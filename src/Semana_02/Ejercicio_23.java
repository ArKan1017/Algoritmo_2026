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
    3.Genera aleatoriamente una matriz de tamaño m×n
    con valores enteros aleatorios.El programa debe 
    calcular la suma de cada fila y cada columna.
    Se espera: Mostrar la matriz y las sumas correspondientes.
    */
    import java.util.Random;
    public class Ejercicio_23 {
        public static void main(String[] args){
            Random crea = new Random();

            int m = crea.nextInt(10) + 1;
            int n = crea.nextInt(10) + 1;

            int [][] matriz = new int[m][n];

            for(int i = 0; i < m;i++){
                for(int j = 0; j < n; j++){
                    matriz[i][j] = crea.nextInt(10) + 1;
                }
            }
            System.out.print("La matriz " + m + "x" + n + " : \n");
            for(int i = 0; i < m; i++){
                int sumaFila = 0;
                for(int j = 0; j < n; j++){
                    System.out.print(matriz[i][j] + "\t");
                    sumaFila += matriz[i][j];
                }
                System.out.println("| Suma Fila: " + sumaFila);
            }
            for(int i = 0; i < n * 8; i++){
                System.out.print("-");
            }
            System.out.println();
            
            for (int j = 0; j < n; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < m; i++) {
                    sumaColumna += matriz[i][j];
                }
                System.out.print(sumaColumna + "\t");
            }
            
            System.out.println("\nSumas Columnas");
        }
    }
