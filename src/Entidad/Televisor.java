/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class Televisor extends Electrodomestico{
    
    private int pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador, int precio, String color, char consumoE, int peso) {
        super(precio, color, consumoE, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    /**
     * Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
     */
    Scanner leer = new Scanner (System.in).useDelimiter("\n");

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("ingrese las pulgadas de el TV");
        pulgadas=leer.nextInt();
        
        System.out.println("ingrese si tiene sintonizador SI/NO");
        String sinto = leer.next();
        
        if(sinto.equalsIgnoreCase("si")){
            sintonizador=true;
        }else{
            sintonizador=false;
        }
    }
    

   
    /**
     * Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */
     @Override
    public void precioFinal() {
        super.precioFinal();
        if(pulgadas>40){ 
            int p = (this.precio*30)/100;
            this.precio+=p;
        }
        
        if(sintonizador==true){
            this.precio+=500;
        }
        System.out.println("EL PRECIO DE SU TV "+this.precio);
    }
    
    
}
