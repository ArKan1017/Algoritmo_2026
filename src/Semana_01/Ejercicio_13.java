package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//3.Genera aleatoriamente un número entero positivo.
//El programa debe determinar si es un número perfecto
//(igual a la suma de sus divisores propios). 
//Se espera: Mostrar si el número es perfecto o no.
import java.util.Random;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Random generador = new Random();
        
        int n = generador.nextInt(100) + 1;
        
        System.out.println("Numero generado : " + n);
        System.out.println("El numero " + n + " es perfecto ?");
        
        int i = 1;
        int suma_divisores = 0;
        
        do {
            if( n % i == 0){
                suma_divisores += i;
            }
            i++;
        } while( i <= n / 2 );
        
        if(suma_divisores == n ){
            System.out.println(" SI es un numero PERFECTO :" + n );
        }else{
            System.out.print("NO es PERFECTO\n");
        }
    }
}
