/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...). 
 */
public final class Profesor extends Empleado {
    
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int nDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, nDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void cambioEstadoCivil(String newEstado) {
        super.cambioEstadoCivil(newEstado); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reasignacionDespacho(int newDespacho) {
        super.reasignacionDespacho(newDespacho); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Cambio de departamento de un profesor. 
    
    public void cambioDep(String newDepartamento){
        
        departamento=newDepartamento;
    }

    @Override
    public String toString() {
        return super.toString()+ "\ndepartamento: " + departamento ; //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
