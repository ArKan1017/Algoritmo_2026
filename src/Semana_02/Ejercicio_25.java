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
5.Genera aleatoriamente una matriz de tamaño m×n. 
El programa debe verificar si un número dado existe 
en la matriz y mostrar su posición. Se espera: 
Indicar si el número está presente y en qué coordenadas.
*/
import java.util.Random;
import java.util.Scanner; // Necesario para pedir el número al usuario

public class Ejercicio_25 {
    public static void main(String[] args) {
        Random crea = new Random();
        Scanner lea = new Scanner(System.in);
        
        int m = crea.nextInt(5) + 1;
        int n = crea.nextInt(5) + 1;
        
        int[][] matriz = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = crea.nextInt(10) + 1;
            }
        }
        System.out.println("La matriz " + m + "x" + n + " :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\nIngrese el numero a buscar (1-10): ");
        int buscar = lea.nextInt();
        boolean encontrado = false;

        System.out.println("Resultados de la busqueda");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] == buscar){
                    System.out.println("- Encontrado en coordenadas: [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }
        if(!encontrado){
            System.out.println("El numero " + buscar + " no se encuentra en la matriz.");
        }
    }   
}
    

