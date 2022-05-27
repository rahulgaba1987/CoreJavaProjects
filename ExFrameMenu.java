import java.awt.*;
import java.awt.event.*;
import java.io.*;

   
    public class ExFrameMenu extends WindowAdapter implements ActionListener
   	  {
      Frame f = new Frame("Notepad");
      Panel p = new Panel();
      TextArea ta= new TextArea(100,100);
	String c_text;
      ExFrameMenu()
{
  	      f.addWindowListener(new WindowAdapter(){
  		public void windowClosing(WindowEvent we){
  System.exit(0);
  }
  });
		
      		
         MenuBar m = new MenuBar();
         
        f.setMenuBar(m);
        
        Menu file = new Menu("File");
         Menu edit = new Menu("Edit");
         Menu help = new Menu("Help");
        
        MenuItem nw = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem quit = new MenuItem("Quit");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
	MenuItem paste = new MenuItem("Paste");
	MenuItem about = new MenuItem("About Notepad");
          
        file.add(nw);
	file.add(open);
	file.add(save);
	file.add(quit);

     	edit.add(cut);
       	edit.add(copy);
       	edit.add(paste);
	
	help.add(about);
         
        m.add(file);
        m.add(edit);
      	m.add(help);

	nw.addActionListener(this);
	open.addActionListener(this);        
	save.addActionListener(this);
	quit.addActionListener(this);
	cut.addActionListener(this);
	copy.addActionListener(this);
	paste.addActionListener(this);
	about.addActionListener(this);
      	
	f.add(ta);
       	f.setSize(1000,1000);
       	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
		{
			String s= ae.getActionCommand();
			if(s.equals("Quit"))
				{
					System.exit(0);
				}
			if(s.equals("New"))
				{
					ta.setText("");
				}
			if(s.equals("Open"))
				{
					 openFile();
				}
			if(s.equals("Save"))
				{
					 saveFile();
				}
			if(s.equals("Cut"))
				{
				c_text= ta.getSelectedText();
				int start=ta.getSelectionStart();
  				int end=ta.getSelectionEnd();
  				String startText=ta.getText().substring(0, start);
  				String endText=ta.getText().substring(end, ta.getText().length());
  				ta.setText(startText+endText);

				}
			if(s.equals("Copy"))
				{
					c_text= ta.getSelectedText();
				}
			if(s.equals("Paste"))
				{
					int pos1=ta.getCaretPosition();
					ta.insert(c_text,pos1);
				}
			if(s.equals("About Notepad"))
				{
					String au="\n\n\n\t";
					au+=" Notepad is a common text-only (plain text) editor";
					au+="\n \t The resulting files—typically saved with the .txt extension—have no format ";
					au+="\n \t tags or styles, making the program suitable for editing system files that are to be used in a DOS environment.";
					ta.setText(au);
				}

			
		}
	private void openFile()
    {
        //Show the Open File dialog box to the user.
        FileDialog fd = new FileDialog(f, "Open File", 0);
        fd.setVisible(true);

        //Get the file path.
        StringBuffer sbPath = new StringBuffer(fd.getDirectory());
        sbPath.append("\\");
        String fileName = fd.getFile();

        //Cancel if null:
        if (fileName == null)
        {
            return;
        }
        else sbPath.append(fileName);

        // Open and fill the input stream; paint the TextArea.
        try
        {
            FileInputStream fs = new FileInputStream(sbPath.toString());
            byte[] data = new byte [ sbPath.length() ];
            fs.read(data);
            ta.setText(new String(data));
        }
        catch (IOException e)
        {
            ta.setText(e.toString());
        }
    }
     

private void saveFile()
    {
        try
        {
            // Show the dialog box to the user.
            FileDialog fd = new FileDialog(f, "Save File", 1);
            fd.setVisible(true);

            //Get the path and file name.
            StringBuffer sbPath = new StringBuffer(fd.getDirectory());
            sbPath.append("\\");
            // Get the file name to create:
            sbPath.append(fd.getFile());
            FileOutputStream fo = new FileOutputStream(sbPath.toString());

            // Parse the data: 
            String strdata = ta.getText();
            byte[] data = new byte [strdata.length()];
            for (int idx = 0; idx < strdata.length(); idx++)
            {
                data[idx] = (byte)strdata.charAt(idx);
            }
            // Write the array to the file.
            fo.write(data);
        }
        catch (IOException ex)
        {
            ta.setText(ex.toString());
        }
    }
     
     public static void main(String argv[])
  	      {
          	new ExFrameMenu();
		}

 }