import java.sql.*;

public class JDBCLAB1 {

    public static void main(String[] args) {

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/StudentsDB";
            String username = "root";
            String password = "Isratheboss54";

            Class.forName(driver);
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);

            System.out.println("Established Connection");

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}