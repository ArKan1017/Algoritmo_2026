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
5.Genera aleatoriamente un arreglo de n números
enteros positivos (donde n también se genera aleatoriamente
entre 5 y 15). El programa debe calcular el promedio de
todos los elementos y determinar cuál es el número mayor dentro del
arreglo. Se espera: Mostrar el arreglo completo generado, el promedio
de los valores e Indicar cuál es el número mayor y en qué posición 
se encuentra dentro del arreglo.
*/
import java.util.Random;
import java.util.Arrays;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Random crea = new Random();

        int n = crea.nextInt(11) + 5;
        int[] myArreglo = new int[n];

        double suma = 0;
        int mayor = -1; 
        int posicionMayor = 0;
        
        for (int i = 0; i < n; i++) {
            myArreglo[i] = crea.nextInt(50) + 1; 
            
            suma += myArreglo[i];

            if (myArreglo[i] > mayor) {
                mayor = myArreglo[i];
                posicionMayor = i;
            }
        }

        double promedio = suma / n;

        System.out.println("Arreglo generado (tamanio " + n + "): " + Arrays.toString(myArreglo));
        System.out.printf("Promedio de los valores: %.2f%n", promedio);
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion del mayor: " + posicionMayor);
    }
}
