/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class Biblioteca {

    private List<Material> catalogo=new ArrayList<>();
    
    private void agregarCatalogo(Material material){
    catalogo.add(material);
    }
    public Material buscar(String codigo)throws prestamoException{
    for(Material material:catalogo){
    if( material.getCodigo().equalsIgnoreCase(codigo)){
        return material;
    } 
    }
    throw new prestamoException("No existe el material con ese codigo"+codigo);
    }
    public void prestar(Usuario usuario,String codigo) throws prestamoException{
    Material m =buscar(codigo);
    
    if(m.isPrestado()){
    throw new prestamoException(m.getTitulo()+"No esta disponible");
    }
    usuario.agregarPrestamo(m);
    m.setPrestado(true);
   
    }
}
