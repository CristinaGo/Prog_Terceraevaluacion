package AppUniversidad.dao;

import AppUniversidad.modelo.Alumno;

import java.sql.*;
import java.util.List;

/**
 * Contiene toda la gestión de los alumnos en la base de datos
 */

public class AlumnoDAO {

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

    public static void create(Alumno alumno){
        Connection con = conectar();

        String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,alumno.getId());
            pst.setString(2,alumno.getNombre());
            pst.setString(3,alumno.getDireccion());
            pst.setString(4,alumno.getTelefono());
            int registrosInsertados = pst.executeUpdate();
            System.out.println("Se han insertado: " + registrosInsertados + " registros");

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public static Alumno read(int id){
        Connection con = conectar();
        Alumno a = null;
        String consulta = "SELECT * FROM alumno WHERE id = ?;";

        try {
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                a = new Alumno(rs.getInt("id"),rs.getString("nombre"),rs.getString("direccion"),rs.getString("telefono"));

            }
            con.close();
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void update(Alumno alumno){
        Connection con = conectar();
        String act = "UPDATE alumno SET nombre = ?, direccion = ?, telefono = ? WHERE id = ?;";
        try {
            PreparedStatement pst = con.prepareStatement(act);
            pst.setString(1,alumno.getNombre());
            pst.setString(2,alumno.getDireccion());
            pst.setString(3,alumno.getTelefono());
            pst.setInt(4,alumno.getId());

            int actualizado = pst.executeUpdate();
            System.out.println("Se han actualizado: " + actualizado + " registros");
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id){
        Connection con = conectar();
        String borrar = "DELETE FROM alumno WHERE id = ?;";
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
        String sql = "SELECT MAX(id) FROM alumno;";
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
