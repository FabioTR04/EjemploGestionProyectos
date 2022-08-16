/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unisinu.ds2.modelo.entidades;

/**
 *
 * @author fabiotrujillo
 */
public class Empleado {
    
    public void prueba(){
        Empresa e1 = new Empresa();
//        e1.nombre = "xyz";
//        e1.telefono = "www.miweb.com";

        e1.setEmail("jarrieta@gmail.com");
        e1.setNombre("ED PROFE");
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Email: " + e1.getEmail());
    }
    
}
