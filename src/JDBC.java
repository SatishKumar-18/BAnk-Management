import java.sql.*;
public class JDBC {

    Connection con = null;
    Statement st = null;
    public JDBC(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "SatishKumar");

            if(con != null){
                st = con.createStatement();
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
