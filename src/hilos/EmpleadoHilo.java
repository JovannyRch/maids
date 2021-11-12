/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import dao.Empleado;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class EmpleadoHilo extends Thread {

    private Empleado empleado;
    private JProgressBar progressBar;
    private JLabel label;
    private static javax.swing.Timer t;
    
    
    
    public EmpleadoHilo(Empleado empleado, JProgressBar progressBar, JLabel label) {
        this.empleado = empleado;
        this.progressBar = progressBar;
        this.label = label;
        
        
        
    }

    @Override
    public void run() {
        int horas = 5 + (getRandomNumber(-3,3));
        this.empleado.setTiempoTrabajado(horas);
        System.out.println("El empleado: "+this.empleado.getNombreTrabajador()+", trabajará "+horas+" hrs");
        for (int i = 0; i <= this.empleado.getTiempoTrabajado(); i++) {
            int porcentaje = this.calcularPorcentaje(i);
            this.progressBar.setValue(porcentaje);
            this.label.setText("Porcentaje "+porcentaje+"%");
            if(i != empleado.getTiempoTrabajado()){
                esperarNSegundos(1);
            }
        }
        
        System.out.println("El empleado: "+this.empleado.getNombreTrabajador()+" terminó su trabajo ");
    }

    public int calcularPorcentaje(int horaActual) {
        return Integer.parseInt((horaActual * 100 / this.empleado.getTiempoTrabajado()) + "");
    }

    private void esperarNSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    
    public Empleado getEmpleado(){
        return this.empleado;
    }
    
}
