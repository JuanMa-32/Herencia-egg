/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Alquiler;
import Entidad.Amotor;
import Entidad.Barco;
import Entidad.Velero;
import Entidad.Yate;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class AlquilerService{
    
    Alquiler a1 = new Alquiler();
    
    public void Alquilar(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        
        System.out.println("------------BIENVENIDO A ALQUILERES.JAVA-----------------");
        
        System.out.println("Nombre: ");
        a1.setNombre(leer.next());
        
        System.out.println("DNI: ");
        a1.setDni(leer.next());
        
        System.out.println("fecha de alquiler: YYYY-MM-DD");
        a1.setFechaAlquiler(leer.next());
        
        System.out.println("fecha de devolucion: YYYY-MM-DD");
        a1.setFechaDevolucion(leer.next());
        
        System.out.println("posicion de amarre: ");
        a1.setPosicionAmarre(leer.next());
        
        int opc;
        System.out.println("que barco alquilara: \n"
                + "1: NORMAL\n"
                + "2: VELERO\n"
                + "3: A MOTOR\n"
                + "4: YATE");
        opc=leer.nextInt();
        
          long duracion = a1.diasAlquilado();//metodo que retorna los dias que fue alquilado el barco
          
        switch(opc){
            case 1:
                Barco normal = new Barco("666-AF-215", 15, 2005);
                a1.setBarcoAocupar(normal);
                int modulo = normal.moduloPrecio();
                System.out.println("PRECIO ALQUILER: "+duracion*modulo);
                break;
            case 2:
                Velero velero = new Velero(5,"32-AZ-29",20, 2010);
                a1.setBarcoAocupar(velero);
                 int mod = velero.moduloPrecio();
                System.out.println("PRECIO ALQUILER: "+duracion*mod);
                break;
            case 3:
                Amotor barcoMotor = new Amotor(600,"745-ASD-111", 20,2015);
                a1.setBarcoAocupar(barcoMotor);
                 int moduloB = barcoMotor.moduloPrecio();
                System.out.println("PRECIO ALQUILER: "+duracion*moduloB);
                break;
            case 4:
                Yate yate = new Yate(1200, 10, "89-21-33", 80,1999);
                a1.setBarcoAocupar(yate);
                 int moduloY = yate.moduloPrecio();
                System.out.println("PRECIO ALQUILER: "+duracion*moduloY);
                break;
            
        }

        System.out.println(a1);
    }

 

   
}
