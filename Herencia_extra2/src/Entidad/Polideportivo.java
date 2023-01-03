/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;



/**
 *
 * @author NALDO
 * Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
public class Polideportivo extends Edificio {

    private String instalacion;
    private String nombre;

    
    public Polideportivo() {
    }

    
    public Polideportivo(String instalacion, int ancho, int alto, int largo, String nombre) {
        super(ancho, alto, largo);
        this.instalacion = instalacion;
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public int calcularSuperficie() {
       return super.ancho*super.largo;
    }

    @Override
    public int calcularVolumen() {
        return super.alto*super.ancho*super.largo;
    }
    
}
