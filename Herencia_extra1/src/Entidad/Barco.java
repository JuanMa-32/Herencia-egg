/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import interfaces.costoAlquiler;

/**
 *
 * @author NALDO
 */
public class Barco implements costoAlquiler {
    
    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return  "\nMatricula: " + matricula + "\t Eslora mts: " + eslora + "\t Año de Fabricacion: " + anioFabricacion ;
    }

    @Override
    public int moduloPrecio() {
        return eslora*10;
    }

    

    
    
    
}
