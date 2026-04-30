/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author LENOVO
 */
import modelo.Tarea;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TareaControlador implements ActionListener {
    private VentanaPrincipal vista;

    public TareaControlador(VentanaPrincipal vista) {
        this.vista = vista;
        
        this.vista.btnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            try {
               
                String codigo = vista.txtCodigo.getText();
                String titulo = vista.txtTitulo.getText();
                String curso = vista.txtCurso.getText();
                LocalDate fecha = LocalDate.parse(vista.txtFecha.getText());
                String estado = (String) vista.cmbEstado.getSelectedItem();

                
                Tarea tarea = new Tarea(codigo, titulo, curso, fecha, estado);

               
                vista.modeloTabla.addRow(new Object[]{
                        tarea.getCodigo(),
                        tarea.getTitulo(),
                        tarea.getCurso(),
                        tarea.getFechaEntrega(),
                        tarea.getEstado()
                });

                
                vista.txtCodigo.setText("");
                vista.txtTitulo.setText("");
                vista.txtCurso.setText("");
                vista.txtFecha.setText("");
                vista.cmbEstado.setSelectedIndex(0);

                JOptionPane.showMessageDialog(vista, "Tarea registrada correctamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error al registrar tarea: " + ex.getMessage());
            }
        }
    }
}
