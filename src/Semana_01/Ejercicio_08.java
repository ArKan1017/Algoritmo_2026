package Semana_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
//3.Genera aleatoriamente la cantidad de alumnos y sus 
//calificaciones. El programa debe determinar cuántos no 
//tienen derecho al examen de nivelación (por ejemplo, si 
//su nota es menor a 11). Se espera: Mostrar el número de 
//alumnos que no cumplen con el requisito.
import java.util.Random;

public class Ejercicio_08 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int n_alumnos = random.nextInt(20) +1;
        
        System.out.println("Numero de alumnos generados : " + n_alumnos);
        int i = 1;
        int no_cumplen = 0;
        while(i <= n_alumnos) {
            int nota = random.nextInt(20) + 1;
            System.out.println("Alumno - "+ i + "\nNota : " + nota);
            if(nota < 11){
                no_cumplen ++;
            };
            i++;
        }
        System.out.println("El numero de " + "alumnos que no cumplen con el requisito: " + no_cumplen);
    }
}
