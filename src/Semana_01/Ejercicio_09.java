package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//
//4.Genera aleatoriamente un número entero positivo n.
//El programa debe calcular el factorial de n. 
//Se espera: Mostrar el resultado del factorial.
import java.util.Random;

public class Ejercicio_09 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int n = random.nextInt(10) + 1;
        
        System.out.println("Numero generado : " + n);
        System.out.println("El factorial de " + n + " es: ");
        
        int i = 1;
        int factorial = n;
        while( i < n) { 
            factorial = factorial * (n - i) ;
            i++;
        }
        System.out.println(factorial);
    }
}
