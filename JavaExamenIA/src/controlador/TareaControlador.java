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
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            registrarTarea();
        } else if (e.getSource() == vista.btnEliminar) {
            eliminarTarea();
        } else if (e.getSource() == vista.btnBuscar) {
            buscarTarea();
        }
    }

    private void registrarTarea() {
        
        if (vista.txtCodigo.getText().isEmpty() || vista.txtTitulo.getText().isEmpty() ||
            vista.txtCurso.getText().isEmpty() || vista.txtFecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios.");
            return;
        }

        // Validar código repetido
        for (int i = 0; i < vista.modeloTabla.getRowCount(); i++) {
            if (vista.modeloTabla.getValueAt(i, 0).equals(vista.txtCodigo.getText())) {
                JOptionPane.showMessageDialog(vista, "El código ya existe.");
                return;
            }
        }

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

            JOptionPane.showMessageDialog(vista, "Tarea registrada correctamente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Formato de fecha incorrecto. Use YYYY-MM-DD.");
        }
    }

    private void eliminarTarea() {
        int fila = vista.tablaTareas.getSelectedRow();
        if (fila >= 0) {
            vista.modeloTabla.removeRow(fila);
            JOptionPane.showMessageDialog(vista, "Tarea eliminada.");
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione una tarea para eliminar.");
        }
    }

    private void buscarTarea() {
        String criterio = vista.txtBuscar.getText().toLowerCase();
        if (criterio.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Ingrese un código o título para buscar.");
            return;
        }

        for (int i = 0; i < vista.modeloTabla.getRowCount(); i++) {
            String codigo = vista.modeloTabla.getValueAt(i, 0).toString().toLowerCase();
            String titulo = vista.modeloTabla.getValueAt(i, 1).toString().toLowerCase();

            if (codigo.contains(criterio) || titulo.contains(criterio)) {
                vista.tablaTareas.setRowSelectionInterval(i, i);
                JOptionPane.showMessageDialog(vista, "Tarea encontrada en la fila " + (i + 1));
                return;
            }
        }
        JOptionPane.showMessageDialog(vista, "No se encontró ninguna tarea.");
    }
}

