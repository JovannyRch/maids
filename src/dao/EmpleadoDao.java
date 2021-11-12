/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList listar() {
        ArrayList<Empleado> lista = new ArrayList<>();
        String sql = "select id_comision, DATE_FORMAT(fecha, '%d-%m-%Y') as fecha_,nombre_trabajador,nombre_cliente,tiempo_trabajado,comision_obtenida,descuentos_realizados,sueldototal from empleados";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado item = new Empleado();
                item.setIdComision(rs.getInt(1));
                item.setFecha(rs.getString(2));
                item.setNombreTrabajador(rs.getString(3));
                item.setNombreCliente(rs.getString(4));
                item.setTiempoTrabajado(rs.getInt(5));
                item.setComisionObtenida(rs.getInt(6));
                item.setDescuentosRealizados(rs.getInt(7));
                item.setSueldo(rs.getInt(8));
                lista.add(item);
            }
            cn.Desconectar();
        } catch (Exception e) {
            System.out.println("Error en el query: " + e.getMessage());
        }
        return lista;
    }
    
  
    public int add(Empleado registro) {
        int r = 0;
        String sql = "insert into empleados"
                + "(fecha, nombre_trabajador, nombre_cliente, tiempo_trabajado, comision_obtenida, descuentos_realizados, sueldototal)"
                + " values(STR_TO_DATE('"
                + registro.getFecha()
                + "', '%Y-%m-%d'),?,?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, registro.getNombreTrabajador());
            ps.setObject(2, registro.getNombreCliente());
            ps.setObject(3, registro.getTiempoTrabajado());
            ps.setObject(4, registro.getComisionObtenida());
            ps.setObject(5, registro.getDescuentosRealizados());
            ps.setObject(6, registro.getSueldo());

            r = ps.executeUpdate();

             cn.Desconectar();
        } catch (Exception e) {
            System.out.println("Error en: " + sql);
            System.out.println(e.getMessage());
        }
        return r;
    }

}
