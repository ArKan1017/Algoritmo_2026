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
2.Crea una matriz de 5x5 con valores enteros aleatorios.
El programa debe mostrar la matriz en pantalla.
Se espera: Visualizar la matriz generada.
*/
import java.util.Random;

public class Ejercicio_22 {
    public static void main(String[] args){
        Random crea = new Random();
        int[][] matriz = new int[5][5];
        
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = crea.nextInt(90) + 1;
            }
        }
        
        System.out.print("La matriz 5x5 : \n");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
