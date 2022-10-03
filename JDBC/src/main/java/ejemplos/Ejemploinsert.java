package ejemplos;

import java.sql.*;

public class Ejemploinsert {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:./JDBC/src/empresa2.db";

        try {
            Connection con = DriverManager.getConnection(url);
            /*if (con.isValid(5)){
                System.out.println("Válida");
            }*/
            String insertar = "INSERT INTO empleado VALUES (551, 111, 'Ingeniero', 780, '1990-04-28', '2022-04-28', 1200, 0, 0, 'Gonzales, Carlos Alberto');";
            Statement st = con.createStatement();
            //int filasAñadidas = st.executeUpdate(insertar);
            //System.out.println("Se han añadido " + filasAñadidas);

            String select = "SELECT * FROM empleado WHERE id = 551;";
            ResultSet rs = st.executeQuery(select);
            rs.next();
            System.out.println(rs.getInt("id") + " " + rs.getString("nombre"));

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
