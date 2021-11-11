/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.Random;


public class EmpleadoHilo extends Thread {

    
   
    
    public EmpleadoHilo(){
    }
    
    @Override
    public void run() {
        
        
        
    }

    private void esperarNSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    
}