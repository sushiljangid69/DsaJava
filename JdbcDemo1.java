import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo1 {
    static final String conString = "jdbc:mysql://localhost:3306/";
    static final String userName = "root";
    static final String password = "";
    static final String dbName = "jdbc_demo";

    public static void main(String[] args) {
        Connection con;
        boolean i;
        try{
            con = DriverManager.getConnection(conString+dbName,userName,password);

            String query = "INSERT INTO login (name,email,pass) VALUES (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,"Sita");
            stmt.setString(2,"sita@gmail.com");
            stmt.setString(3,"123456");
            i = stmt.execute();
            stmt.setString(1,"Ram");
            stmt.setString(2,"ram@gmail.com");
            stmt.setString(3,"123456");
            i = stmt.execute();
            stmt.setString(1,"Sushil");
            stmt.setString(2,"sushil@gmail.com");
            stmt.setString(3,"147852");
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}