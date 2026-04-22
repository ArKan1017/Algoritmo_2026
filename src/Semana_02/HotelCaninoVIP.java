/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_02;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class HotelCaninoVIP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] hotel = new int [3][4]; // ya inicia en 0 por defecto

        int opcion;
        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar huésped");
            System.out.println("2. Mostrar disponibilidad");
            System.out.println("3. Salir del sistema");
            System.out.println("4. Encontrar primera habitación libre");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(">> Opción Registrar seleccionada.");
                    System.out.print("Ingrese piso 0-2: ");     
                    int piso = sc.nextInt();
                    System.out.print("Ingrese habitación 0-3: ");     
                    int habitacion = sc.nextInt();

                    // Validación de entradas
                    if (piso < 0 || piso >= hotel.length || habitacion < 0 || habitacion >= hotel[0].length) {
                        System.out.println("Entrada inválida. Intente nuevamente.");
                    } else if (hotel[piso][habitacion] == 1) {
                        System.out.println("Habitación no disponible.");
                    } else {
                        hotel[piso][habitacion] = 1;
                        System.out.println("Registro exitoso.");
                    }
                    break;

                case 2:
                    mostrarDisponibilidad(hotel);
                    break;

                case 3:
                    System.out.println(">> Saliendo del sistema...");
                    break;

                case 4:
                    boolean encontrada = false;
                    for (int i = 0; i < hotel.length; i++) {
                        for (int j = 0; j < hotel[i].length; j++) {
                            if (hotel[i][j] == 0) {
                                System.out.println("La primera habitación libre está en el piso " + i + ", habitación " + j);
                                encontrada = true;
                                break; // rompe el bucle interno
                            }
                        }
                        if (encontrada) break; // rompe el bucle externo
                    }
                    if (!encontrada) {
                        System.out.println("No hay habitaciones libres.");
                    }
                    break; // <-- agregado para evitar caer en default

                default:
                    System.out.println(">> Opción inválida, intente nuevamente.");
            }
            System.out.println(); 
        } while (opcion != 3); 
        sc.close();
    }

    // Método separado para mejorar legibilidad
    static void mostrarDisponibilidad(int[][] hotel) {
        System.out.println(">> Opción Mostrar disponibilidad seleccionada.");
        System.out.println("Disponibilidad del hotel (0=libre, 1=ocupada):");
        for (int[] piso : hotel) {
            for (int hab : piso) {
                System.out.print(hab + " ");
            }
            System.out.println();
        }
    }
}

 
