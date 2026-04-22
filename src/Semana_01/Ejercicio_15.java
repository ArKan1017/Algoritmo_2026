package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//5.Genera aleatoriamente un número entero positivo.
//El programa debe determinar si es primo.
//Se espera: Mostrar si el número es primo o no.
import java.util.Random;

public class Ejercicio_15 {
   public static void main(String[] args) {
       Random generador = new Random();
       
       int n = generador.nextInt(200) + 1;
       
       System.out.println("Numero generado : " + n);
       
       int i = 1;
       int primo = 0;
        do {
            if( n % i == 0){
                primo++;
            }
            i++;
        } while( i <= n );
        
        if(primo == 2){
            System.out.println("\nEl numero " + n + " es primo");
        }else{
            System.out.println("\nEl numero " + n + " no es primo");
        }
    }
}
