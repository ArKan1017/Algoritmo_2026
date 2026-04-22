package Semana_02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//1.Genera aleatoriamente un número entero positivo n (entre 1 y 10.
//Con ese valor, crea un vector de tamaño n y llénalo con 
//números enteros aleatorios en el rango de 1 a 100.
import java.util.Random;
import java.util.Arrays;

public class Ejercicio_16 {
    public static void main(String[] args){
        Random crea = new Random();
        
        int n = crea.nextInt(10) + 1;
        System.out.println("Tamaño del vector generado : " + n);
        
        byte[] myVector = new byte[n];
        
        int  i = 0;
        while( i < n){
            myVector[i] = (byte)(Math.random()* 101);
            i++;
        } 
         
        for(int j = 0; j < n;j++){
            System.out.println("myVector["+ j +"] = " + myVector[j]);
        }
         System.out.println("Vector completo: " + Arrays.toString(myVector));
    }
}
