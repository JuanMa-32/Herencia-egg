/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 */
public class AlojamientoExtraHotelero extends Alojamiento{
    
    protected String estado;//este atributo dice si es privado o publico
    protected int mtsCuadrado;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(String estado, int mtsCuadrado, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.estado = estado;
        this.mtsCuadrado = mtsCuadrado;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n estado: " + estado + " \tmts Cuadrado: " + mtsCuadrado; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
