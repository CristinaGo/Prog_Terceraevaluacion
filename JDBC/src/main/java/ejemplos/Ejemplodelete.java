package ejemplos;

import java.sql.*;

public class Ejemplodelete {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:./JDBC/src/empresa2.db";

        try {
            Connection con = DriverManager.getConnection(url);
            String delete = "DELETE FROM empleado WHERE id = 551";
            Statement st = con.createStatement();
            int d = st.executeUpdate(delete);
            System.out.println("Filas eliminadas " + d);

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
