sqlconnection.package marcin.com;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bazatestowa";
        String user = "root";
        String password = "abc123";

        String query = "CREATE TABLE IF NOT EXISTS  registration "+
                "(id INTEGER not NULL, " +
                "first VARCHAR(50)," +
                "last VARCHAR(50)," +
                "age INTEGER," +
                "PRIMARY KEY(id))";

        String mselect = "SELECT id,first,last,age FROM registration";

        try(Connection con = DriverManager.getConnection(url,user,password);
            Statement st = con.createStatement();
            ){
            st.executeUpdate(query);

            System.out.println("tabela została utworzona");

//            System.out.println("dodanie rekordu do tabeli...");
//            String sql_z = "INSERT INTO registration VALUES(100,'Anna','Kot',34)";
//            st.executeUpdate(sql_z);
//
//            System.out.println("dodanie rekordu do tabeli...");
//            sql_z = "INSERT INTO registration VALUES(102,'Teofil','Knot',67)";
//            st.executeUpdate(sql_z);
//
//            System.out.println("dodanie rekordu do tabeli...");
//            sql_z = "INSERT INTO registration VALUES(107,'Jacek','Nowak',45)";
//            st.executeUpdate(sql_z);

//            String update = "UPDATE registration " +
//                    "SET age=30 WHERE id in(101,102);";
//            st.executeUpdate(update);
//
//            String del = "DELETE FROM registration " +
//                    "WHERE id in(101,102);";
//            st.executeUpdate(del);

            ResultSet rs = st.executeQuery(mselect + " ORDER BY first ASC");
            while (rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", wiek: " + rs.getInt("age"));
                System.out.print(", imię: " + rs.getString("first"));
                System.out.print(", nazwisko: " + rs.getString("last") + "\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
