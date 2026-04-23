/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_03;

/**
 *
 * @author LENOVO
 */
import java.util.stream.IntStream;

public class ejemploProcesador_06 {
    public static void main(String[] args) {
        System.out.println("Iniciando cálculo multihilo...");
        long inicio = System.currentTimeMillis();

        // Usa todos los núcleos disponibles
        double suma = IntStream.range(0, Integer.MAX_VALUE)
                              .parallel() 
                              .mapToDouble(Math::sqrt)
                              .sum();   

        long fin = System.currentTimeMillis();
        
        System.out.println("Resultado: " + suma + " en " + (fin - inicio) + " ms");
    }
}


