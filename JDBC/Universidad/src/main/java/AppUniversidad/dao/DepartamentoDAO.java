package AppUniversidad.dao;

import AppUniversidad.modelo.Alumno;
import AppUniversidad.modelo.Departamento;

import java.sql.*;

public class DepartamentoDAO {

    private static Connection conectar(){
        String url = "jdbc:sqlite:./JDBC/Universidad/Universidad.db";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
            /* if (con.isValid(5)){
                System.out.println("Conexión establecida");
            }*/
            return con;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void create(Departamento departamento){
        Connection con = conectar();

        String sql = "INSERT INTO departamento VALUES (?, ?);";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,departamento.getId());
            pst.setString(2,departamento.getNombre());
            int registrosInsertados = pst.executeUpdate();
            System.out.println("Se han insertado: " + registrosInsertados + " registros");

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Departamento read(int id){
        Connection con = conectar();
        Departamento d = null;
        String consulta = "SELECT * FROM departamento WHERE id = ?;";

        try {
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                d = new Departamento(rs.getInt("id"),rs.getString("nombre"));

            }
            con.close();
            return d;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void update(Departamento departamento){
        Connection con = conectar();
        String act = "UPDATE departamento SET nombre = ? WHERE id = ?;";
        try {
            PreparedStatement pst = con.prepareStatement(act);
            pst.setString(1,departamento.getNombre());
            pst.setInt(2,departamento.getId());

            int actualizado = pst.executeUpdate();
            System.out.println("Se han actualizado: " + actualizado + " registros");
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete(int id){
        Connection con = conectar();
        String borrar = "DELETE FROM departamento WHERE id = ?;";
        try {
            PreparedStatement pst = con.prepareStatement(borrar);
            pst.setInt(1,id);
            int borrado = pst.executeUpdate();
            System.out.println("Se han borrado: " + borrado + " registros");

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int obtenerUltimoId(){
        Connection con = conectar();
        String sql = "SELECT MAX(id) FROM departamento;";
        ResultSet rs = null;
        int ultimoID = 0;
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            if (!rs.equals(null)){
                ultimoID = rs.getInt(1);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el último id " + e.getMessage());
            e.printStackTrace();
        }


        return ultimoID;
    }

}
