/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
public final class Camping extends AlojamientoExtraHotelero {
    
    private int capacidadMaxCarpas;
    private int nBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaxCarpas, int nBanios, boolean restaurante, String estado, int mtsCuadrado, String nombre, String direccion, String localidad, String encargado) {
        super(estado, mtsCuadrado, nombre, direccion, localidad, encargado);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.nBanios = nBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getnBanios() {
        return nBanios;
    }

    public void setnBanios(int nBanios) {
        this.nBanios = nBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMtsCuadrado() {
        return mtsCuadrado;
    }

    public void setMtsCuadrado(int mtsCuadrado) {
        this.mtsCuadrado = mtsCuadrado;
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

    @Override
    public String toString() {
        return super.toString()+" capacidad Maxima carpas: "+capacidadMaxCarpas+"\t baños: "+nBanios+"\t restaurant: "+restaurante; 
    }

   
    
    
}
