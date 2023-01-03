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
public final class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " Se alimenta de: "+alimento );
    }
    
}
