package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//1.Genera aleatoriamente un número entero positivo n.
//El programa debe mostrar una cuenta regresiva desde n 
//hasta 1. Se espera: La secuencia descendente completa.
import java.util.Random;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int n = random.nextInt(100) + 1;
        
        System.out.println("Numero generado: "+ n);
        System.out.println("Cuenta regresiva de " + n + " - 1");
        
        int  i = n;
        while(i >= 1) { 
            System.out.println(i);
            i--;
        }
    }
}
