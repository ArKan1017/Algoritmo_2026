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
4.Genera aleatoriamente una matriz de tamaño m×n.
El programa debe calcular su transpuesta (intercambiar filas por columnas).
Se espera: Mostrar la matriz original y la transpuesta.
*/
import java.util.Random;

public class Ejercicio_24 {
    public static void main(String[] args){
        Random crea = new Random();
        
        int m = crea.nextInt(5) + 1;
        int n = crea.nextInt(5) + 1;
        
        int[][] matriz = new int[m][n];
        
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = crea.nextInt(10) + 1;
            }
        }
        
        System.out.print("La matriz " + m + "x" + n + " : \n");
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
            
        System.out.print("\nLa matriz TRANSPUESTA " + n + "x" + m + " : \n");
            for(int j = 0; j < n; j++){
                for(int i = 0; i < m; i++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
    }   
}
