package ejemplos;

import java.sql.*;

public class JDBCEmpresa2 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:./JDBC/src/empresa2.db";
        try {
            Connection con = DriverManager.getConnection(url);
            /*if(con.isValid(5)){
                System.out.println("Conexion válida");
            } else {
                System.out.println("Timeout");
            }*/
            // cualquier query es un objeto de tipo statement
            Statement st = con.createStatement();
            //SELECT
            String consulta = "SELECT * FROM departamento;";
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double presupuesto = rs.getDouble("presupuesto");
                System.out.println(id + "\t" + nombre + "\t" + presupuesto + " euros");
            }


            con.close();
        } catch (SQLException e) {
            System.out.println("Excepción de base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
