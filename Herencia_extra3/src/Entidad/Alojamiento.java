/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 *  *  Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar
 */
public class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String encargado;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return   "Nombre: " + nombre + "\t direccion: " + direccion + "\t  localidad: " + localidad + "\t encargado: " + encargado ;
    }
    
    
}
