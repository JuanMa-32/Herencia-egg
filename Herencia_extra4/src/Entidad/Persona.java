/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil. 

 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    //Cambio del estado civil de una persona. 
    
    public void cambioEstadoCivil(String newEstado){
        
        estadoCivil = newEstado;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre + "\t apellido: " + apellido + "\t dni: " + dni + "\t estadoCivil: " + estadoCivil ;
    }
    
    
}
