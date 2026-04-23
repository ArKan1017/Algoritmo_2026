/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_03;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;

public class ejemploTiempo_01 {
     public static void main(String[] args) {
        int[] datos = new int[1000000];
        
        for (int i = 0; i < datos.length; i++) datos[i] = i;
        int buscar = 999999;

        long inicioL = System.nanoTime();
        for (int n : datos) if (n == buscar) break; //Lineal
        long finL = System.nanoTime();

        long inicioB = System.nanoTime();
        Arrays.binarySearch(datos, buscar);  //Binario
        long finB = System.nanoTime();

        System.out.println("Lineal: " + (finL - inicioL) + " ns");
        System.out.println("Binaria: " + (finB - inicioB) + " ns");
    }
}
