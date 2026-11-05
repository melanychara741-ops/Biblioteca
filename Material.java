/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author sara
 */
public abstract class Material {
    private String codigo;
    private String titulo;
    private boolean prestado;
    
    public Material(String codigo, String titulo){
        this.codigo=codigo;
        this.titulo=titulo;
        this.prestado=false;
    }
    public abstract int diasPrestamo();
    
    public String getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public boolean isPrestado(){
        return prestado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
}
