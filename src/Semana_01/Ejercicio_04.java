package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//4.Genera aleatoriamente un número entero positivo n.
//El programa debe mostrar los primeros n números impares.
//Se espera: Una lista con los números impares generados.
import java.util.Random;

public class Ejercicio_04 { 
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int n = aleatorio.nextInt(20) + 1;
        
        System.out.println("Numero generado: " + n);
        System.out.println("Los " + n + " numeros impares:");
         
        for(int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
