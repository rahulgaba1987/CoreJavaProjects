
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Naim
 */
public class javaconnect {
    Connection conn;
public static java.sql.Connection ConnecrDb(){
  try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql:///officeinfo", "root", "12345");
      return conn;
  } catch(Exception e){
      
  }
        return null;
}
}
