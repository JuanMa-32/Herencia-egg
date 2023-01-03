/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * s se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
public final class Residencia extends AlojamientoExtraHotelero {
    
    private int nHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int nHabitaciones, boolean descuentoGremios, boolean campoDeportivo, String estado, int mtsCuadrado, String nombre, String direccion, String localidad, String encargado) {
        super(estado, mtsCuadrado, nombre, direccion, localidad, encargado);
        this.nHabitaciones = nHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
        return super.toString()+"\n habitaciones: "+nHabitaciones+"\t descuento a gremios: "+descuentoGremios+"\t campo deportivo: "+campoDeportivo; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
