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
1.Crea una matriz de 5x5 llamada “diagonal”. 
El programa debe asignar el valor 1 en la diagonal
principal y 0 en el resto. Se espera: Mostrar la matriz
completa.
*/

public class Ejercicio_21 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];

        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1; 
                }
            }
        }

        System.out.println("Matriz Diagonal 5x5:");
        
        // System.out.println(Arrays.deepToString(diagonal));
                
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

