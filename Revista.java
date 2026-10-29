/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Revista extends Material {
    
    public Revista(String codigo,String titulo){
    super(codigo,titulo);
    }

    @Override
    public int diasPrestamo() {
       return 5;
    }
    
}
