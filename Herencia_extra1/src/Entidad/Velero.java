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
public class Velero extends Barco  {
    
    private int nMastiles;

    public Velero() {
    }

    public Velero(int nMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nMastiles = nMastiles;
    }

    @Override
    public String toString() {
        return super.toString()+"  Cantidad de mastiles: "+nMastiles; 
    } 

    @Override
    public int moduloPrecio() {
        return super.moduloPrecio()+nMastiles;
        
    }
    
    
}
