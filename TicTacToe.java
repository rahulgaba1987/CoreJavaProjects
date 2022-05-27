											
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class TicTacToe implements ActionListener {
final String VERSION = "1.0";
//Setting up ALL the variables
JFrame window = new JFrame("Tic-Tac-Toe " + VERSION);

JMenuBar mnuMain = new JMenuBar();
JMenuItem mnuNewGame = new JMenuItem("New Game"),
mnuInstruction = new JMenuItem("Instructions"),
mnuExit = new JMenuItem("Exit"),
mnuAbout = new JMenuItem("About");

JButton btn1v1 = new JButton("Aman"),
btn1vCPU = new JButton("Player vs CPU"),
btnBack = new JButton("<--back");
JButton btnEmpty[] = new JButton[10];

JPanel pnlNewGame = new JPanel(),
pnlNorth = new JPanel(),
pnlSouth = new JPanel(),
pnlTop = new JPanel(),
pnlBottom = new JPanel(),
pnlPlayingField = new JPanel();
JLabel lblTitle = new JLabel("Tic-Tac-Toe");
JTextArea txtMessage = new JTextArea();

final int winCombo[][] = new int[][] {
{1, 2, 3}, {1, 4, 7}, {1, 5, 9},
{4, 5, 6}, {2, 5, 8}, {3, 5, 7},
{7, 8, 9}, {3, 6, 9}
/*Horizontal Wins*/ /*Vertical Wins*/ /*Diagonal Wins*/
};
final int X = 1220, Y = 25268, color = 190;
boolean inGame = false;
boolean win = false;
boolean btnEmptyClicked = false;
String message;
int turn = 1;
int wonNumber1 = 1, wonNumber2 = 1, wonNumber3 = 1;

public TicTacToe() { //Setting game properties and layout and sytle...
//Setting window properties:
window.setSize(X, Y);
window.setLocation(80, 5);
window.setResizable(false);
window.setLayout(new BorderLayout());
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//Setting Panel layouts and properties
pnlNewGame.setLayout(new GridLayout(2000000, 1200, 2000, 10));
pnlNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
pnlSouth.setLayout(new FlowLayout(FlowLayout.CENTER));

pnlNorth.setBackground(new Color(color-20, color-20, color-20));
pnlSouth.setBackground(new Color(color, color, color));

pnlTop.setBackground(new Color(color, color, color));
pnlBottom.setBackground(new Color(color, color, color));

pnlTop.setLayout(new FlowLayout(FlowLayout.CENTER));
pnlBottom.setLayout(new FlowLayout(FlowLayout.CENTER));
pnlNewGame.setBackground(Color.blue);

//Adding menu items to menu bar
mnuMain.add(mnuNewGame);
mnuMain.add(mnuInstruction);
mnuMain.add(mnuAbout);
mnuMain.add(mnuExit);//---->Menu Bar Complete

//Adding buttons to NewGame panel
pnlNewGame.add(btn1v1);
pnlNewGame.add(btn1vCPU);

//Adding Action Listener to all the Buttons and Menu Items
mnuNewGame.addActionListener(this);
mnuExit.addActionListener(this);
mnuInstruction.addActionListener(this);
mnuAbout.addActionListener(this);
btn1v1.addActionListener(this);
btn1vCPU.addActionListener(this);
btnBack.addActionListener(this);

//Setting up the playing field
pnlPlayingField.setLayout(new GridLayout(3, 3, 2, 2));
pnlPlayingField.setBackground(Color.black);
for(int i=1; i<=9; i++) {
btnEmpty[i] = new JButton();
btnEmpty[i].setBackground(new Color(220, 220, 220));
btnEmpty[i].addActionListener(this);
pnlPlayingField.add(btnEmpty[i]);
}
//Adding everything needed to pnlNorth and pnlSouth
pnlNorth.add(mnuMain);
pnlSouth.add(lblTitle);

//Adding to window and Showing window
window.add(pnlNorth, BorderLayout.NORTH);
window.add(pnlSouth, BorderLayout.CENTER);
window.setVisible(true);
}

//-------------------START OF ACTION PERFORMED CLASS-------------------------//
public void actionPerformed(ActionEvent click) {
Object source = click.getSource();
for(int i=1; i<=9; i++) {
if(source == btnEmpty[i] && turn < 10) {
btnEmptyClicked = true;
if(!(turn % 2 == 0))
btnEmpty[i].setText("X");
else
btnEmpty[i].setText("O");
btnEmpty[i].setEnabled(false);
pnlPlayingField.requestFocus();
turn++;
}
}
if(btnEmptyClicked) {
checkWin();
btnEmptyClicked = false;
}
if(source == mnuNewGame) {
clearPanelSouth();
pnlSouth.setLayout(new GridLayout(2, 1, 2, 5));
pnlTop.add(pnlNewGame);
pnlBottom.add(btnBack);
pnlSouth.add(pnlTop);
pnlSouth.add(pnlBottom);

}
else if(source == btn1v1) {
if(inGame) {
int option = JOptionPane.showConfirmDialog(null, "If you start a new game," +
"your current game will be lost..." + "\n" +
"Are you sure you want to continue?",
"Quit Game?" ,JOptionPane.YES_NO_OPTION);
if(option == JOptionPane.YES_OPTION) {
inGame = false;
}
}
if(!inGame) {
btnEmpty[wonNumber1].setBackground(new Color(220, 220, 220));
btnEmpty[wonNumber2].setBackground(new Color(220, 220, 220));
btnEmpty[wonNumber3].setBackground(new Color(220, 220, 220));
turn = 1;
for(int i=1; i<10; i++) {
btnEmpty[i].setText("");
btnEmpty[i].setEnabled(true);
}
win = false;
showGame();

}
}
else if(source == btn1vCPU) {
JOptionPane.showMessageDialog(null, "Coming Soon!!");
}
else if(source == mnuExit) {
int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
"Exit Game" ,JOptionPane.YES_NO_OPTION);
if(option == JOptionPane.YES_OPTION)
System.exit(0);
}
else if(source == mnuInstruction || source == mnuAbout) {
clearPanelSouth();
String message = "";
txtMessage.setBackground(new Color(color, color, color));
if(source == mnuInstruction) {
message = "Instructions:\n\n" +
"Your goal is to be the first player to get 3 X's or O's in a\n   " +
"Tic-tac-toe is a fun game that you can play any time and anywhere as long as you have a \n" +
"piece of paper, a pencil, and an opponent. Tic-tac-toe is a zero sum game, which means  \n"  +
"that if both players are playing their best, that neither player will win. However, if you learn \n" +
"how to play tic-tac-toe and master some simple strategies, then you'll be able to not only  \n " +
"play, but to win the majority of the time. If you want to know how to play tic-tac-toe, then \n" +

" 1 Draw the board. First, you have to draw the board, which is made up of a 3 x 3  \n " + 
"This means it has three rows of three squares.Some people play with a 4 x 4 grid,\n \n" +
 "but that is for more advanced players, and we will focus on the 3 x 3 grid here.{{largeimage|DrawAGrid Step 1 . \n  " +
" 2      Have the first player go first. Though traditionally \n " +
" the first player goes with X,you can allow the first player to decide whether  \n" +
" he wants to go with X s or O s.These symbols will be placed   \n " +
" on the table, in the attempt to have three of them in a row.\n" + " If you're going first,then the best move you can make is to move into the center. \n" +
"This will maximize your chances of winning, " +
"since you'll be able to create a row of three  \n"  +  " X s or O s in more combinations (4) this way than if you chose a different square. \n \n " +
" 3  Have the second player go second. After the first player goes. \n" ;










} else {
message = "About:\n\n" +
"Title: Tic-Tac-Toe\n" +
"Author: Aman\n" +
"Version: " + VERSION + "\n";
}
txtMessage.setEditable(false);
txtMessage.setText(message);
pnlSouth.setLayout(new GridLayout(2, 1, 15, 20));
pnlTop.add(txtMessage);
pnlBottom.add(btnBack);
pnlSouth.add(pnlTop);
pnlSouth.add(pnlBottom);
}
else if(source == btnBack) {
if(inGame)
showGame();
else {
clearPanelSouth();
pnlSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
pnlNorth.setVisible(true);
pnlSouth.add(lblTitle);
}
}
pnlSouth.setVisible(false);
pnlSouth.setVisible(true);
}
//-------------------END OF ACTION PERFORMED CLASS-------------------------//

/*
----------------------------------
Start of all the other methods. |
----------------------------------
*/
public void showGame() { // Shows the Playing Field
// *IMPORTANT*- Does not start out brand new (meaning just shows what it had before)
clearPanelSouth();
inGame = true;
pnlSouth.setLayout(new BorderLayout());
pnlSouth.add(pnlPlayingField, BorderLayout.CENTER);
pnlPlayingField.requestFocus();
}

public void checkWin() { // checks if there are 3 symbols in a row vertically, diagonally, or horizontally.
// then shows a message and disables buttons.
for(int i=0; i<7; i++) {
if(
!btnEmpty[winCombo[i][0]].getText().equals("") &&
btnEmpty[winCombo[i][0]].getText().equals(btnEmpty[winCombo[i][1]].getText()) &&
// if {1 == 2 && 2 == 3}
btnEmpty[winCombo[i][1]].getText().equals(btnEmpty[winCombo[i][2]].getText())
/*
The way this checks the if someone won is:
First: it checks if the btnEmpty[x] is not equal to an empty string- x being the array number
inside the multi-dementional array winCombo[checks inside each of the 7 sets][the first number]
Secong: it checks if btnEmpty[x] is equal to btnEmpty[y]- x being winCombo[each set][the first number]
y being winCombo[each set the same as x][the second number] (So basically checks if the first and
second number in each set is equal to each other)
Third: it checks if btnEmtpy[y] is eual to btnEmpty[z]- y being the same y as last time and z being
winCombo[each set as y][the third number]
Conclusion: So basically it checks if it is equal to the btnEmpty is equal to each set of numbers
*/
) {
win = true;
wonNumber1 = winCombo[i][0];
wonNumber2 = winCombo[i][1];
wonNumber3 = winCombo[i][2];
btnEmpty[wonNumber1].setBackground(Color.white);
btnEmpty[wonNumber2].setBackground(Color.white);
btnEmpty[wonNumber3].setBackground(Color.white);
break;
}
}
if(win || (!win && turn>9)) {
if(win) {
if(turn % 2 == 0)
message = "X has won!";
else
message = "O has won!";
win = false;
} else if(!win && turn>9) {
message = "Both players have tied!\nBetter luck next time.";
}
JOptionPane.showMessageDialog(null, message);
for(int i=1; i<=9; i++) {
btnEmpty[i].setEnabled(false);
}
}
}

public void clearPanelSouth() { //Removes all the possible panels
//that pnlSouth, pnlTop, pnlBottom
//could have.
pnlSouth.remove(lblTitle);
pnlSouth.remove(pnlTop);
pnlSouth.remove(pnlBottom);
pnlSouth.remove(pnlPlayingField);
pnlTop.remove(pnlNewGame);
pnlTop.remove(txtMessage);
pnlBottom.remove(btnBack);
}

public static void main(String[] args) {
new TicTacToe();// Calling the class construtor.
}
}
/*
Changes:
1.0- changes below: Stable
0.9- added back button, added comments.
0.8- added dynamic win message.
0.7- added game function- game playable.
0.6- changed menu layout.
0.5- basic functions with menu and nice GUI.
*/