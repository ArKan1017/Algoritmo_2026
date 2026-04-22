/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_02;

/**
 *
 * @author LENOVO
 */
//3.Genera aleatoriamente un arreglo de 10 números 
//enteros entre 1 y 10. El programa debe mostrar cada 
//número junto con su cuadrado y cubo. Se espera: Una 
//tabla con número, cuadrado y cubo.
import java.util.Random;
import java.util.Arrays;

public class Ejercicio_18 {
    public static void main (String [] args){
        Random crea = new Random();
        int[] myArreglo = new int[10];
        int[] myCuadrado = new int[10];
        int[] myCubo = new int[10];
        
        for(int i = 0; i < 10;i++){
            myArreglo[i] = crea.nextInt(10) + 1;
            myCuadrado[i] = (int)Math.pow(myArreglo[i],2);
            myCubo[i] = (int)Math.pow(myArreglo[i],3);
        }  
        
        System.out.println("El arreglo : " + Arrays.toString(myArreglo));
        System.out.println("El arreglo elevado al cuadrado : " + Arrays.toString(myCuadrado));
        System.out.println("El arreglo elevado al cubo : " + Arrays.toString(myCubo));
    }
}
