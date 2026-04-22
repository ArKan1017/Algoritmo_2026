package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//2.Genera aleatoriamente un número entero positivo.
//El programa debe verificar si es múltiplo de 9,
//considerando que un número lo es si la suma de sus
//cifras es 9 o múltiplo de 9. Se espera: Mostrar si el
//número cumple o no la condición.
import java.util.Random;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Random generador = new Random();
        
        int n = generador.nextInt(10000) + 1;
        
        System.out.println("Numero generado : " + n );
        
        int cifra = n;
        int suma_cifras = 0;
        do {
            int digito = cifra % 10;
            suma_cifras += digito;
            cifra = cifra / 10;
        } while( cifra != 0 );
        
        if( suma_cifras % 9 == 0){
            System.out.println("Si es multiplo de 9 : " + n );
        }else{
            System.out.println("No es multiplo de 9 : " + n);
        }
    }
}
