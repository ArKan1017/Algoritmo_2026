/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_03;

/**
 *
 * @author LENOVO
 */
public class ejemploProcesador_05 {
    public static void main(String[] args) {
        System.out.println("Iniciando calculo intensivo...");
        long inicio = System.currentTimeMillis();
        
        double suma = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            suma += Math.sqrt(i);
        } 
        
        long fin = System.currentTimeMillis();
        
        System.out.println("Resultado: " + suma + " en " + (fin - inicio) + " ms");
    }
}

