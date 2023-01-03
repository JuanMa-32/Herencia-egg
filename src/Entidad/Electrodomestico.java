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
 * precio, color,
consumo energético (letras entre A y F) y peso.
 */
public  class Electrodomestico {
    
    protected int precio;
    protected String color;
    protected char consumoE;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoE, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(char letra){
        switch(letra){
            case 'a':
                this.consumoE=letra;
                break;
            case 'b':
                 this.consumoE=letra;
                break;
            case 'c':
                 this.consumoE=letra;
                break;
            case 'd':
                 this.consumoE=letra;
                break;
            case 'e':
                 this.consumoE=letra;
                break;
            case 'f':
                 this.consumoE=letra;
                break;
            default:
                this.consumoE='f';
        }
    }
    
    /**
     * Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public void comprobarColor(String color){
        
        switch(color.toLowerCase()){
            case "blanco":
                this.color=color;
                break;
            case "negro":
                 this.color=color;
                break;
            case "rojo":
                 this.color=color;
                break;
            case "azul":
                 this.color=color;
                break;
            case "gris":
                 this.color=color;
                break;
            default:
                 this.color="blanco";
        }
    }
    
    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearElectrodomestico(){
        
        precio=1000;//precio inicial
        
        System.out.println("Ingrese el valor energetico de su electrodomestico desde a/f");
        char letra =  leer.next().charAt(0);
        comprobarConsumoEnergetico( letra);
        
        System.out.println("Ingrese el color de su electrodomestico");
        String color = leer.next();
        comprobarColor( color);
        
        System.out.println("Ingrese el peso de su electrodomestico");
        peso=leer.nextInt();
        
        
    }
    
    /**
     *   Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    public void precioFinal(){
        
        switch (consumoE) {
            case 'a':
                precio += 1000;
                break;
            case 'b':
                precio += 800;
                break;
            case 'c':
                precio += 600;
                break;
            case 'd':
                precio += 500;
                break;
            case 'e':
                precio += 300;
                break;
            case 'f':
                precio += 100;
                break;

        }
        if(peso>=1 && peso<=19 ){
            precio+=100;
        }else if(peso>=20 && peso<=49){
            precio+=500;
        }else if(peso>=50 && peso<=79){
            precio+=800;
        }else if(peso>=80){
            precio+=100;
        }

    }    

    @Override
    public String toString() {
        return "Electrodomestico" + "precio=" + precio + " color=" + color + " consumoE=" + consumoE + " peso=" + peso;
    }
    
}
