package AppUniversidad.dao;

import AppUniversidad.modelo.Alumno;
import AppUniversidad.modelo.Asignatura;

import java.sql.*;
import java.util.List;

public class AsignaturaDAO {

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

    public static void create(Asignatura asignatura){
        Connection con = conectar();

        String sql = "INSERT INTO asignatura VALUES (?, ?, ?, ?, ?);";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,asignatura.getId());
            pst.setString(2,asignatura.getNombre());
            pst.setInt(3,asignatura.getHoras());
            pst.setDouble(4,asignatura.getPrecio());
            pst.setInt(5,asignatura.getDepartamento());
            int registrosInsertados = pst.executeUpdate();
            System.out.println("Se han insertado: " + registrosInsertados + " registros");

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void cargarLista(List<Asignatura> lista){

        lista.stream().forEach(asignatura -> create(asignatura));



    }


    public static Asignatura read(int id){
        Connection con = conectar();
        Asignatura a = null;
        String consulta = "SELECT * FROM asignatura WHERE id = ?;";

        try {
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                a = new Asignatura(rs.getInt("id"),rs.getString("nombre"),
                        rs.getInt("num_horas"), rs.getDouble("precio"),rs.getInt("departamento_id"));

            }
            con.close();
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void update(Asignatura asignatura){
        Connection con = conectar();
        String act = "UPDATE asignatura SET nombre = ?, num_horas = ?, precio = ? , departamento_id = ? WHERE id = ?;";
        try {
            PreparedStatement pst = con.prepareStatement(act);
            pst.setString(1,asignatura.getNombre());
            pst.setInt(2,asignatura.getHoras());
            pst.setDouble(3,asignatura.getPrecio());
            pst.setInt(4,asignatura.getDepartamento());
            pst.setInt(5,asignatura.getId());

            int actualizado = pst.executeUpdate();
            System.out.println("Se han actualizado: " + actualizado + " registros");
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id){
        Connection con = conectar();
        String borrar = "DELETE FROM asignatura WHERE id = ?;";
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
        String sql = "SELECT MAX(id) FROM asignatura;";
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

   /* public static String nombreDepartamento(int id){
        return read(id).getNombre();
    }*/

    public static void listarAsignaturas(){
        String sql = "SELECT asignatura.id, asignatura.nombre, departamento.nombre FROM asignatura JOIN departamento  ON (asignatura.departamento_id = departamento.id);";
        Connection con = conectar();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs =  pst.executeQuery();
            int contador = 0;
            while (rs.next()){
                System.out.println(rs.getInt(1) + " - " + rs.getString(2)+ " - " +rs.getString(3));
                contador++;
            }
            System.out.println("Se han encontrado " + contador + " asignaturas");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
