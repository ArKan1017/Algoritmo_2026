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
//El programa debe mostrar los primeros n números pares.
//Se espera: Una lista con los números pares generados.
import java.util.Random;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        
        System.out.println("Numero generado: " + n);
        System.out.println("Los " + n + " primeros numeros pares:");
        
        int i = 1;
        while(i <= n) {
            System.out.println(i * 2);
            i ++;
        }
    }
}
