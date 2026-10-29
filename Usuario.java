/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Usuario {
    private String nombre;
    private int MAX_PRESTADOS=3;
    private List<Material>prestados= new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

public void agregarPrestamo(){
if(prestados.size()>=MAX_PRESTADOS){

}
}
    
    
}
