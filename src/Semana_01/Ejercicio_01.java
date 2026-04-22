package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
// 1.Diseña un programa que genere aleatoriamente un número 
//entero positivo n. El programa debe contar desde 1 hasta n 
//mostrando cada número en pantalla. Se espera: Que se visualice 
//la secuencia completa de números desde 1 hasta n.
import java.util.Random;

public class Ejercicio_01 {
    public static void main(String[] args){
        Random aleatorio = new Random();
        
        int n = aleatorio.nextInt(20) + 1;
        
        System.out.println("Numero generado: " + n);
        System.out.println("Secuencia del 1 hasta " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

