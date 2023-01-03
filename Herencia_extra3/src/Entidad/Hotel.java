/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas
 */
public class Hotel extends Alojamiento implements Comparable<Hotel> {
    
    protected int nHabitaciones;
    protected int nCamas;
    protected int nPisos;
    protected double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int nHabitaciones, int nCamas, int nPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.nHabitaciones = nHabitaciones;
        this.nCamas = nCamas;
        this.nPisos = nPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public int getnCamas() {
        return nCamas;
    }

    public void setnCamas(int nCamas) {
        this.nCamas = nCamas;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    

    
    @Override
    public String toString() {
        return super.toString()+"\n habitaciones: "+nHabitaciones+"\t camas: "+nCamas+"\t pisos: "+nPisos+"\t precio habitacion: "+precioHabitaciones; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Hotel t) {
      
       Integer resp;
       
       if(this.precioHabitaciones>t.getPrecioHabitaciones()){
          resp=-1;  
       }else if(this.precioHabitaciones==t.getPrecioHabitaciones()){
           resp=0;
       }else {
           resp=1;
       }
       
       return resp;
    }
    
    
    
}
