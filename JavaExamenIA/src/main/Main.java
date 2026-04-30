/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
import vista.VentanaPrincipal;
import controlador.TareaControlador;

public class Main {
    public static void main(String[] args){
        VentanaPrincipal vista = new VentanaPrincipal();
        TareaControlador controlador = new TareaControlador(vista);
        vista.setVisible(true);
    }
}

