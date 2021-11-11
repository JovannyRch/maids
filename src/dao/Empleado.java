/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


public class Empleado {
    private int idComision;
    private String fecha;
    private String nombreTrabajador;
    private String nombreCliente;
    private int tiempoTrabajado;
    private int comisionObtenida;
    private int descuentosRealizados;
    private int sueldo;
    
    
    
     public Empleado(String fecha, String nombreTrabajador, String nombreCliente) {
        this.fecha = fecha;
        this.nombreTrabajador = nombreTrabajador;
        this.nombreCliente = nombreCliente;
    }

    public Empleado(int idComision, String fecha, String nombreTrabajador, String nombreCliente, int tiempoTrabajado, int comisionObtenida, int descuentosRealizados, int sueldo) {
        this.idComision = idComision;
        this.fecha = fecha;
        this.nombreTrabajador = nombreTrabajador;
        this.nombreCliente = nombreCliente;
        this.tiempoTrabajado = tiempoTrabajado;
        this.comisionObtenida = comisionObtenida;
        this.descuentosRealizados = descuentosRealizados;
        this.sueldo = sueldo;
    }
    
    

    public int getIdComision() {
        return idComision;
    }

    public void setIdComision(int idComision) {
        this.idComision = idComision;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTiempoTrabajado() {
        return tiempoTrabajado;
    }

    public void setTiempoTrabajado(int tiempoTrabajado) {
        this.tiempoTrabajado = tiempoTrabajado;
    }

    public int getComisionObtenida() {
        return comisionObtenida;
    }

    public void setComisionObtenida(int comisionObtenida) {
        this.comisionObtenida = comisionObtenida;
    }

    public int getDescuentosRealizados() {
        return descuentosRealizados;
    }

    public void setDescuentosRealizados(int descuentosRealizados) {
        this.descuentosRealizados = descuentosRealizados;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
