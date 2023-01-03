/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;



/**
 *
 * @author NALDO
 * En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados. 
 */
public final  class Estudiante extends Persona{
    
    private String curso;

    public Estudiante() {
   
    }

    public Estudiante(String curso, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String Curso) {
        this.curso = Curso;
    }

    @Override
    public void cambioEstadoCivil(String newEstado) {
        super.cambioEstadoCivil(newEstado); //To change body of generated methods, choose Tools | Templates.
    }
    
    //• Matriculación de un estudiante en un nuevo curso. 
    public void MatricularseAotroCurso(String newCurso){
        
        curso=newCurso;
    }    

    @Override
    public String toString() {
        return super.toString()+"\ncurso: " + curso ; //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
