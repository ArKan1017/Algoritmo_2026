/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_03;

/**
 *
 * @author LENOVO
 */

public class ejemploMemoria_03 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.gc(); // Sugerir limpieza para medición limpia
        
        
        long antesInt = runtime.totalMemory() - runtime.freeMemory();
        int[] objetosInt = new int[1000000];
        for(int i=0; i<1000000; i++) objetosInt[i] = i;
        long despuesInt = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memoria usada por int[]: " + (despuesInt - antesInt) / 1024 + " KB");
        
        
        System.gc();
        long antes = runtime.totalMemory() - runtime.freeMemory();
        Integer[] objetos = new Integer[1000000];
        for(int i=0; i<1000000; i++) objetos[i] = i;
        long despues = runtime.totalMemory() - runtime.freeMemory();
        
        System.out.println("Memoria usada por Integer[]: " + (despues - antes) / 1024 + " KB");
        
       
    }
}
