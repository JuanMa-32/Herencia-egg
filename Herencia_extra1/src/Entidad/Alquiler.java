/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


import java.time.Duration;
import java.time.LocalDate;



/**
 *
 * @author NALDO
 */
public class Alquiler {
    
    protected String nombre;
    protected String dni;
    protected String fechaAlquiler;
    protected String fechaDevolucion;
    protected String posicionAmarre;
    protected Barco barcoAocupar;
    

    public Alquiler() {
    }

    public Alquiler(String nombre, String dni, String fechaAlquiler, String fechaDevolucion, String posicionAmarre, Barco barcoAocupar) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoAocupar = barcoAocupar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoAocupar() {
        return barcoAocupar;
    }

    public void setBarcoAocupar(Barco barcoAocupar) {
        this.barcoAocupar = barcoAocupar;
    }

    @Override
    public String toString() {
        return "----Alquiler----" + "\nnombre " + nombre + "\n dni " + dni + "\n fechaAlquiler " + fechaAlquiler + "\n fechaDevolucion " + fechaDevolucion + "\n posicionAmarre " + posicionAmarre + "\n <<<barcoAocupar>>>" + barcoAocupar ;
    }
    
    public long diasAlquilado(){
        
        LocalDate inicio = LocalDate.parse(fechaAlquiler);
        LocalDate fin = LocalDate.parse(fechaDevolucion);
        
        Duration tiempoAlqui = Duration.between(inicio.atStartOfDay(), fin.atStartOfDay());
        
        return tiempoAlqui.toDays();
    }
}
