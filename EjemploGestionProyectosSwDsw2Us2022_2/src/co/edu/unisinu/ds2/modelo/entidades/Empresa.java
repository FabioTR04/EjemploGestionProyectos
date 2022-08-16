package co.edu.unisinu.ds2.modelo.entidades;

import java.util.*;

/**
 *
 * @author fabiotrujillo
 */

public class Empresa {
    //propiedades
    private String nit;
    private String nombre;
    private String email;
    private String telefono;
    private String web;
    private List<Proyecto> proyectos;
    private List<Empleado> empleados;
    
    //SET Y GET
    
    public void setNombre(String nom){
        nombre = nom;
    }
    
    //siempre ponerle el this llamese o no iguales
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEmail(){
        return email;
    }
    
}
