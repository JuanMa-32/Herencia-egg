/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author NALDO
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal p1 = new Perro("India","dog chow",4,"boxer");
        p1.alimentarse();
        
        Animal p2 = new Perro("bruno","carne",1,"pitbull");
        p2.alimentarse();
        
        Animal g1 = new Gato("pelusa","galletas",6,"siames");
        g1.alimentarse();
        
        Animal c1 = new Caballo("picante","pasto",15,"fino");
        c1.alimentarse();
    }
    
}
