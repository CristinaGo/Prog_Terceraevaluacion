package ejercicio3.dao;

import ejercicio3.modelo.Videojuego;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristina Gómez Campos
 */

public class VideojuegoDAO {
    private static Connection conectar(){
        String url = "jdbc:sqlite:C:./ExamenCristinaGomezCampos/examen.bd";
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

    public static void create(Videojuego v){
        Connection con = conectar();

        String sql = "INSERT INTO videojuego VALUES (?, ?, ?, ?,?,?,?,?);";

        try {
            PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1,v.getId());
                pst.setString(2,v.getNombre());
                pst.setString(3,v.getPlataforma());
                pst.setString(4,v.getGenero());
                pst.setString(5, v.getFechaLanzamiento());
                pst.setDouble(6,v.getPrecio());
                pst.setBoolean(7,v.isStock());
                pst.setInt(8,v.getUnidades());

            int registrosInsertados = pst.executeUpdate();
            System.out.println("Se han insertado: " + registrosInsertados + " registros");

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public static void read(){
        Connection con = conectar();
        Videojuego v = null;
        ArrayList<Videojuego> vj = new ArrayList<>();
        String consulta = "SELECT * FROM videojuego;";

        try {
            PreparedStatement pst = con.prepareStatement(consulta);

            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                v = new Videojuego(rs.getInt("id"), rs.getString("nombre"),rs.getString("plataforma"), rs.getString("genero"), rs.getString("fecha_lanzamiento"),rs.getDouble("precio"),rs.getBoolean("stock"), rs.getInt("unidades"));
                vj.add(v);

            }
            //los ordena solamente por dia,
            vj.stream().sorted((c1,c2)-> c1.getFechaLanzamiento().compareTo(c2.getFechaLanzamiento()))
                    .forEach(c1 -> System.out.println(c1));
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void consultarStock(int id){
        Connection con = conectar();
        String consulta = "SELECT stock, unidades FROM videojuego WHERE id = ?;";


        try {
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            Boolean stock = rs.getBoolean("stock");
            int unidades = rs.getInt("unidades");
            if (stock){
                System.out.println("Hay stock disponible: " + unidades + " unidades");
            }else{
                System.out.println("No hay stock disponible");
            }



            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void delete(int id){
        Connection con = conectar();
        String borrar = "DELETE FROM videojuego WHERE id = ?;";
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


}
