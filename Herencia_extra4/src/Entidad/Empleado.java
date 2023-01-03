/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
public class Empleado extends Persona {
    
    protected int anioIncorporacion;
    protected int nDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int nDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nDespacho = nDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getnDespacho() {
        return nDespacho;
    }

    public void setnDespacho(int nDespacho) {
        this.nDespacho = nDespacho;
    }
    
    //• Reasignación de despacho a un empleado. 
    
    public void reasignacionDespacho(int newDespacho){
        nDespacho=newDespacho;
    }

    @Override
    public String toString() {
        return super.toString()+"\nanioIncorporacion: " + anioIncorporacion + "\t nDespacho: " + nDespacho; //To change body of generated methods, choose Tools | Templates.
    }

  

   
    
    
}
