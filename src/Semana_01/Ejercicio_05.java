package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//5.Genera aleatoriamente dos números enteros positivos
//L (largo) y A (alto). El programa debe dibujar un rectángulo 
//de asteriscos con esas dimensiones. Se espera: Que se imprima
//en pantalla el rectángulo formado por asteriscos.
import java.util.Random;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int L = aleatorio.nextInt(20) + 1;
        int A = aleatorio.nextInt(20) + 1;
        
        System.out.println("Numeros generados: L = " + L + " A = " + A);
        System.out.println("Un rectangulo de " + L + " x " + A +" :");
        
        for(int i = 1; i <= L; i++) {
            for(int j = 1; j <= A; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
