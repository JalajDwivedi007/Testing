package grp1.DemoProj;
import java.sql.*;
public class App 
{
    public static void main( String[] args )
    {
    	String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "jalaj007";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,userName,password);
			if(conn!=null) {
				System.out.println("Database Connected!");
			}
			else {
				System.out.println("Oops! Ran into some issue");
			}
		}
        catch(SQLException | ClassNotFoundException e) {
        	System.out.println(e);
        }
    }
}
