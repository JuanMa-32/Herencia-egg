/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...). 
 */
public final class PersonalDeServicio extends Empleado {
    
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int anioIncorporacion, int nDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, nDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public void cambioEstadoCivil(String newEstado) {
        super.cambioEstadoCivil(newEstado); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reasignacionDespacho(int newDespacho) {
        super.reasignacionDespacho(newDespacho); //To change body of generated methods, choose Tools | Templates.
    }
    
    //• Traslado de sección de un empleado del personal de servicio. 
    
    public void trasladoSeccion(String newSeccion){
        seccion=newSeccion;
    }

    @Override
    public String toString() {
        return super.toString()+"\n seccion: "+seccion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
