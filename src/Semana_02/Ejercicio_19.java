/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_02;

/**
 *
 * @author LENOVO
 */
/*
4.Genera aleatoriamente un arreglo de n números
enteros. El programa debe identificar si algún 
elemento se repite. Se espera: Mostrar los elementos 
repetidos
*/
import java.util.Random;
import java.util.Arrays;

public class Ejercicio_19 {
    public static void main(String [] args){
        Random crea = new Random();
        
        int n = crea.nextInt(20) + 1;        
        int[] myArreglo = new int[n];
       
        for(int i = 0; i < n; i++){
            myArreglo[i] = crea.nextInt(20) + 1;
        }    
        
        System.out.print("Mi arreglo de tamanio " + n + " : " +  Arrays.toString(myArreglo));
        
        System.out.print("\nMi arreglo repetidos : [");
        boolean primero = true; //Para controlar las comas
        
        for(int i = 0; i < n; i++){
            boolean repetido = false;
            
            for(int j = i + 1; j < n; j++){
                if( myArreglo[i] == myArreglo[j]){   
                    repetido = true;
                    break;
                }
            }
            if(repetido){
                boolean yaMostrado = false;
                for(int k = 0; k < i; k++){
                        if(myArreglo[k] == myArreglo[i]){
                            yaMostrado = true;
                            break;
                        }
                    }
                if(!yaMostrado){
                    if(!primero)System.out.print(", ");
                    System.out.print(myArreglo[i]);
                    primero = false;
                }
            }
        }
        System.out.print(" ]\n");
    }
}

