/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exposiciones_codigo;

/**
 *
 * @author LENOVO
 */

public class Auto{
    
    private String marca;
    private String modelo;
    private String color;
    private boolean encendido;

        public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.encendido = false; 
    }
    
    public void arrancar() {
        this.encendido = true;
        System.out.println("El " + marca + " " + modelo + 
                "de color " + color + " ha arrancado.");
    }
    public void tocarBocina() {
        System.out.println("¡Beep beep!");
    }
    
    public static void main(String[] args) {
        
        Auto miAuto = new Auto("Toyota", "Corolla", "Rojo");
        Auto autoHermano = new Auto("Hyundai", "Elantra", "Gris");
        
        miAuto.arrancar();
        miAuto.tocarBocina();
        autoHermano.arrancar();
        autoHermano.tocarBocina();
    }
}

