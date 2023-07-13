package marcin.com;

import java.sql.*;

public class CreateT {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bazatestowa";
        String user = "root";
        String password = "abc123";

        String query = "SELECT * FROM student";

        try(Connection conn = DriverManager.getConnection(url,user,password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query)){
                while(rs.next()){
                    System.out.println(rs.getString(1) + " "+rs.getString(2)+ " " +
                            rs.getString(3));
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
