/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
import java.time.LocalDate;

public class Tarea {
    
    private String codigo;
    private String titulo;
    private String curso;
    private LocalDate fechaEntrega;
    private String estado;

    
    public Tarea() {}

    
    public Tarea(String codigo, String titulo, String curso, LocalDate fechaEntrega, String estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.curso = curso;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public LocalDate getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(LocalDate fechaEntrega) { this.fechaEntrega = fechaEntrega; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}


