/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_03;

/**
 * 
 * @author LENOVO
 */
public class ejemploTiempo_02 {
    public static void main(String[] args) {
        int iteraciones = 50000;
        
        long inicio = System.nanoTime();
        String s = "";
        for(int i=0; i<iteraciones; i++) s += "a";
        long fin = System.nanoTime();
        
        System.out.println("Tiempo String (+): " + (fin - inicio) / 1_000_000 + " ms");

        inicio = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<iteraciones; i++) sb.append("a");
        fin = System.nanoTime();
        
        System.out.println("Tiempo StringBuilder: " + (fin - inicio) / 1_000_000 + " ms");
    }
}
