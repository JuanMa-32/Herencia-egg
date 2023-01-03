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
public class Yate extends Barco {
    
    private int potenciaCV;
    private int nCamarotes;

    public Yate() {
    }

    public Yate(int potenciaCV, int nCamarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.nCamarotes = nCamarotes;
    }

    @Override
    public String toString() {
        return super.toString()+" Potencia en CV: "+potenciaCV+" Numero de camarotes: "+nCamarotes; 
    }

    @Override
    public int moduloPrecio() {
        return super.moduloPrecio()+potenciaCV+nCamarotes; //To change body of generated methods, choose Tools | Templates.
    }

    
}
