/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class Herencia_ej4 {

    /**
     * @param args the command line arguments

     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        Circulo c1 = new Circulo();
        System.out.println("ingrese el radio ");
        c1.setRadio(leer.nextDouble());
        
        System.out.println("ingrese el diametro");
        c1.setDiametro(leer.nextDouble());
        
        double area=c1.area();
        double perimetro=c1.perimetro();
        
        System.out.println("EL area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
        
        System.out.println("----------------------------------------------------");
        
        Rectangulo r1 = new Rectangulo();
        System.out.println("ingrese la altura");
        r1.setAltura(leer.nextDouble());
        
        System.out.println("ingrse la base");
        r1.setBase(leer.nextDouble());
        double areaR=r1.area();
        double perimetroR=r1.perimetro();
           
        System.out.println("EL area del rectangulo es: "+areaR);
        System.out.println("El perimetro del rectangulo es: "+perimetroR);
        
    }
    
}
