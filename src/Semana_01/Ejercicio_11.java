package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//1.Genera aleatoriamente la cantidad de alumnos y sus edades,
//diferenciando hombres y mujeres. El programa debe calcular
//el promedio de edades de hombres, mujeres y del grupo total.
//Se espera: Mostrar los tres promedios.
import java.util.Random;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Random generador = new Random();
        
        int n_alumnos = generador.nextInt(20) + 1;
        int n_hombres = generador.nextInt(n_alumnos) + 1;
        int n_mujeres = Math.abs(n_alumnos - n_hombres);
        
        System.out.println("Numero de alumnos generado : " + n_alumnos);
        System.out.println("Numero de hombres generado : " + n_hombres);
        System.out.println("Numero de mujeres generado : " + n_mujeres + "\n");
        
        int suma_edades_H = 0;
        int suma_edades_M = 0;
        
        int contador_H = 1, contador_M = 1;
        
        do {
            int edad = generador.nextInt(50) + 1;
            System.out.println("Hombre - " + contador_H + " : " + edad);
            suma_edades_H += edad;
            
            contador_H++;
        }while(contador_H <= n_hombres);
        
        System.out.println();
        
        do {
            if( n_mujeres != 0){
                int edad = generador.nextInt(50) + 1;
                System.out.println("Mujer - " + contador_M + " : " + edad);
                suma_edades_M += edad;
            }
            contador_M ++;
        } while(contador_M <= n_mujeres);
        
        int suma_edades_T = suma_edades_H + suma_edades_M;
        
        double prom_edades_H = (double)suma_edades_H / n_hombres ;
        double prom_edades_M = (double)suma_edades_M / n_mujeres;
        double prom_edades_T = (double)suma_edades_T / n_alumnos;
        
        if( n_hombres != 0){
        System.out.println("\nPromedio de las edades de los hombres: " + prom_edades_H);
        }
        if (n_mujeres != 0){
        System.out.println("Promedio de las edades de las mujeres: " + prom_edades_M);
        }
        System.out.println("Promedio de las edades totales : " + prom_edades_T);
   }
}
