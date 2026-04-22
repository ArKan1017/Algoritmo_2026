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
//El programa debe calcular el resultado de la serie: 1− 2 + 3 − 4 + 5 − 6...n. 
//Se espera: Mostrar el resultado final de la expresión.
import java.util.Random;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Random generador = new Random();
        
        int n = generador.nextInt(100) + 1;
        
        System.out.println("Numeros generado : " + n);
        System.out.println("De la serie: 1−2+3−4+5−6...n.");
        
        int i = 1;
        int resultado = 0;
        
        do{
            if( i % 2 == 0){
                resultado -= i;
            }else{
                resultado += i;
            }
            i++;
        }while( i <= n);
        
        System.out.println("El resultado final es : " + resultado);
    }
}
