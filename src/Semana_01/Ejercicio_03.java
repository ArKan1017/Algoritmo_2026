package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//3.Genera aleatoriamente un número entero positivo n.
//El programa debe imprimir la tabla de multiplicar de 
//n desde 1 hasta 12. Se espera: Mostrar la tabla completa
//en formato ordenado.
import java.util.Random;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int n = aleatorio.nextInt(20) + 1;
        
        System.out.println("Numero generado: " + n);
        System.out.println("La tabla de multiplicar del " + n );
   
        for(int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }   
}
