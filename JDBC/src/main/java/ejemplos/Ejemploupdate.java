package ejemplos;

import java.sql.*;

public class Ejemploupdate {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:./JDBC/src/empresa2.db";

        try {
            Connection con = DriverManager.getConnection(url);
            String update = "UPDATE empleado SET salario = salario*1.1 WHERE nombre LIKE 'S%';";
            Statement st = con.createStatement();
            int u = st.executeUpdate(update);
            System.out.println("Registros actualizados: " + u);
            String select = "SELECT nombre, salario FROM empleado WHERE nombre LIKE 'S%';";
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                System.out.println(rs.getString("nombre") + "\t" + rs.getDouble("salario")+ "€");
            }


            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
