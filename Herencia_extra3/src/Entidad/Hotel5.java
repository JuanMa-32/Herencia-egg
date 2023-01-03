/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
 */
public final class Hotel5 extends Hotel4 {
    
    private int nSalonesDeConferencia;
    private int nSuites;
    private int nLimosinas;

    public Hotel5() {
    }

    public Hotel5(int nSalonesDeConferencia, int nSuites, int nLimosinas, char gym, String nombreRestaurant, int capacidadRestaurant, int nHabitaciones, int nCamas, int nPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(gym, nombreRestaurant, capacidadRestaurant, nHabitaciones, nCamas, nPisos, precioHabitaciones, nombre, direccion, localidad, encargado);
        this.nSalonesDeConferencia = nSalonesDeConferencia;
        this.nSuites = nSuites;
        this.nLimosinas = nLimosinas;
    }

    public int getnSalonesDeConferencia() {
        return nSalonesDeConferencia;
    }

    public void setnSalonesDeConferencia(int nSalonesDeConferencia) {
        this.nSalonesDeConferencia = nSalonesDeConferencia;
    }

    public int getnSuites() {
        return nSuites;
    }

    public void setnSuites(int nSuites) {
        this.nSuites = nSuites;
    }

    public int getnLimosinas() {
        return nLimosinas;
    }

    public void setnLimosinas(int nLimosinas) {
        this.nLimosinas = nLimosinas;
    }

   

    @Override
    public void precioHabitacion() {
        /*
        Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hote
        */
        int agregadoLimosinas=15*nLimosinas;
        super.precioHabitacion();
        precioHabitaciones+=agregadoLimosinas;
    }

    @Override
    public String toString() {
        return super.toString()+"\n cantidad de salones de conferencia: "+nSalonesDeConferencia+"\t cantidad de suites: "+nSuites+"\t cantidad de limosinas: "+nLimosinas; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
