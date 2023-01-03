/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
public class EdificioDeOficinas extends Edificio{
    
    private int nOficinas;
    private int personasXofi;
    private int nPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nOficinas, int personasXofi, int nPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nOficinas = nOficinas;
        this.personasXofi = personasXofi;
        this.nPisos = nPisos;
    }

    public int getnOficinas() {
        return nOficinas;
    }

    public void setnOficinas(int nOficinas) {
        this.nOficinas = nOficinas;
    }

    public int getPersonasXofi() {
        return personasXofi;
    }

    public void setPersonasXofi(int personasXofi) {
        this.personasXofi = personasXofi;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void cantPersonas(){
        
        int xPiso = nOficinas*personasXofi;
        System.out.println("----EDIFICIO----\n"
                + "cantidad de personas que entran por piso: "+xPiso+"\n"
                        + "cantidad de personas total que entran en el edificio: "+xPiso*nPisos);
    }
    @Override
    public int calcularSuperficie() {
      return super.ancho*super.largo*this.nPisos;
    }

    @Override
    public int calcularVolumen() {
       return super.alto*super.ancho*super.largo;
    }
    
    
}
