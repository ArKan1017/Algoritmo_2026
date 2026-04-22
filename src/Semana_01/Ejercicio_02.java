package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//2.Genera aleatoriamente un número entero positivo n. 
//El programa debe calcular la suma de los primeros n 
//números naturales. Se espera: Mostrar el valor de la suma total.
import java.util.Random;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int n = aleatorio.nextInt(20) + 1;
        
        System.out.println("Numero generado: " + n);
        System.out.println("La suma del 1 hasta " + n + ":");
        
        int suma = 0;
        for(int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Es ---> " + suma);
    }
}

