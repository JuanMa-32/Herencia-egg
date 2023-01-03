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
public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumoE, int peso) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

/**
 * Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
 */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Ingrese (KG) la carga que aguanta esta lavadora");
        carga=leer.nextInt();
    }
   

   /**
    * Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */
      @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if(carga>30){
            precio+=500;
            
        }
          System.out.println("su lavadora salio: "+super.precio);
    }
    
 
}
