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
public class Amotor extends Barco {
    
    private int potenciaCV;

    public Amotor() {
    }

    public Amotor(int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString()+"  Potencia en CV: "+potenciaCV; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int moduloPrecio() {
        return super.moduloPrecio()+potenciaCV; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
