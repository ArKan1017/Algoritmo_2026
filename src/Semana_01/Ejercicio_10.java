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
//El programa debe calcular cuántas cifras tiene ese número.
//Se espera: Mostrar la cantidad de dígitos.
import java.util.Random;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Random random = new Random();
        
        long n = (long)(random.nextDouble()* 9_999_999_999L) + 1;
        
        System.out.println("Numero generado: " + n);
        
        int cont_cifras = 0;
        long temp = n;
        while(temp != 0) {
            temp = temp / 10;
            cont_cifras++; 
        }
        System.out.println("La cantidad de dígitos es : " + cont_cifras);
    }
}

