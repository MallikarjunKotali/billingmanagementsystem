import java.sql.*;   //step no 1

public class Connection_28 
{
    public static Connection main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","9022392767");
            return con;
            
            
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
