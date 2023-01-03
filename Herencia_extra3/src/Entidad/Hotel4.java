/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Interfaces.precioEstadia;

/**
 *
 * @author NALDO
 * Hotel ****, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, P

 */
public class Hotel4 extends Hotel implements precioEstadia {
    
    protected char gym;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public Hotel4() {
    }

    public Hotel4(char gym, String nombreRestaurant, int capacidadRestaurant, int nHabitaciones, int nCamas, int nPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(nHabitaciones, nCamas, nPisos, precioHabitaciones, nombre, direccion, localidad, encargado);
        this.gym = gym;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public char getGym() {
        return gym;
    }

    public void setGym(char gym) {
        this.gym = gym;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

   
    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    /*
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas)
    */
    @Override
    public void precioHabitacion() {
       
        //valor agregado por restaurant
        /*
        $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50. 
        */
        int agregadoRestaurant=0;
        if (capacidadRestaurant<30){
            agregadoRestaurant=10;
        }else if(capacidadRestaurant>=30 && capacidadRestaurant<=50){
            agregadoRestaurant=30;
        }else if(capacidadRestaurant>50){
            agregadoRestaurant=50;
        }
        
        /*
        Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B. 
        */
        int agregadoGym=0;
        if(gym=='A'){
            agregadoGym=50;
        }else if(gym=='B'){
            agregadoGym=30;
        }
        
        precioHabitaciones= 50+(1*nHabitaciones)+agregadoRestaurant+agregadoGym;
    }

    @Override
    public String toString() {
        return super.toString()+"\n gym: "+gym+" \tnombre restaurant: "+nombreRestaurant+"\t capacidad restaurant: "+capacidadRestaurant; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
