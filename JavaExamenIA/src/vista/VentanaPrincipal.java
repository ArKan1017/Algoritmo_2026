/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author LENOVO
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    
    public JTextField txtCodigo;
    public JTextField txtTitulo;
    public JTextField txtCurso;
    public JTextField txtFecha;
    public JComboBox<String> cmbEstado;
    public JButton btnRegistrar;
    public JTable tablaTareas;
    public DefaultTableModel modeloTabla;

    public VentanaPrincipal() {
        setTitle("Gestión de Tareas Académicas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JPanel panelFormulario = new JPanel(new GridLayout(6, 2, 5, 5));

        txtCodigo = new JTextField();
        txtTitulo = new JTextField();
        txtCurso = new JTextField();
        txtFecha = new JTextField();
        cmbEstado = new JComboBox<>(new String[]{"Pendiente", "En proceso", "Completada"});
        btnRegistrar = new JButton("Registrar");

        panelFormulario.add(new JLabel("Código:"));
        panelFormulario.add(txtCodigo);
        panelFormulario.add(new JLabel("Título:"));
        panelFormulario.add(txtTitulo);
        panelFormulario.add(new JLabel("Curso:"));
        panelFormulario.add(txtCurso);
        panelFormulario.add(new JLabel("Fecha entrega (YYYY-MM-DD):"));
        panelFormulario.add(txtFecha);
        panelFormulario.add(new JLabel("Estado:"));
        panelFormulario.add(cmbEstado);
        panelFormulario.add(new JLabel(""));
        panelFormulario.add(btnRegistrar);

        
        modeloTabla = new DefaultTableModel(new Object[]{"Código", "Título", "Curso", "Fecha", "Estado"}, 0);
        tablaTareas = new JTable(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tablaTareas);

        
        setLayout(new BorderLayout());
        add(panelFormulario, BorderLayout.NORTH);
        add(scrollTabla, BorderLayout.CENTER);
    }
}



