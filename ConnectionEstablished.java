import java.sql.*;
public class ConnectionFirst {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vivek","root","");
            Statement stm=con.createStatement();
            if(con.isClosed())
            {
                System.out.println("Connection could not be established");
            }
            else
            {
                System.out.println("Connection established Successfully");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
