package Semana_02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//2.Genera aleatoriamente un arreglo de 10 números enteros.
//El programa debe mostrar los elementos en orden inverso. 
//Se espera: Mostrar el arreglo original y el invertido.
import java.util.Random;


public class Ejercicio_17 {
    public static void main (String[] args){
        Random crea = new Random();
        int [] myArray = new int[10];
        
        for(int i = 0; i < 10;i++){
            myArray[i] = crea.nextInt(100) + 1;
        }
        
        System.out.print(" Mi arreglo : \n[");
        for(int j = 0; j < 10;j++){
            System.out.print(myArray[j]);
            if( j < 9 ){
                System.out.print(",");
            }
        }
        System.out.println(" ]\n");
        
        System.out.print(" Mi arreglo inverso : \n[");
        for(int j = 9; j >= 0;j--){
            System.out.print(myArray[j]);
            if( j > 0){
                System.out.print(",");
            }
        }
        System.out.println(" ]");
    }
}    
    



