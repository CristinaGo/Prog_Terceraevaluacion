package ejemplos;

import java.sql.*;

public class EjemplosPreparedStatement {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:./JDBC/src/empresa2.db";

        try {
            Connection con = DriverManager.getConnection(url);
            String select = "SELECT nombre, puesto, fecha_nac, num_hijos FROM empleado WHERE num_hijos = ? AND salario > ?";
            PreparedStatement pst = con.prepareStatement(select);
            pst.setInt(1,0);
            pst.setDouble(2,2000);

            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("nombre") + "\t" + rs.getString("puesto")  + "\t" + rs.getString("fecha_nac")  + "\t" + rs.getInt("num_hijos"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
