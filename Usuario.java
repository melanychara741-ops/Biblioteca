/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Usuario {
    private int MAX_PRESTADOS=3;
    private String nombre;
    private List<Material> prestado= new ArrayList<>();
    public Usuario(String nombre){
        this.nombre=nombre;
    }
       public void agregarPrestamo(Material material) throws prestamoException{
           if(prestado.size()>=MAX_PRESTADOS){
               throw new  prestamoException(nombre+" ya tiene "+MAX_PRESTADOS+" prestados");
               
           }
           prestado.add(material);
    }
       
       public List<Material> getPrestados(){
       return prestado;
       }
       public boolean quitarPrestamo(Material material){
       return prestado.remove(material);
       }
       
    public String getNombre(){
        return nombre;
    }
    
}
