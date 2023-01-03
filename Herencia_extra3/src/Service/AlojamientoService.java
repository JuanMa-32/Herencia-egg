/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class AlojamientoService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    /*
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
    */
     ArrayList <Alojamiento> alojamiento = new ArrayList();
     ArrayList<Hotel> hoteles = new ArrayList();
    
    public void crearAlojamientos(){

        //hotel 4 estrellas
        Hotel4 hCuatro1 = new Hotel4('A', "mc donals", 200, 150, 300, 20, 0, "APARK HOTEL", "9 de julio", "buenos aires", "leo messi");
        alojamiento.add(hCuatro1);
        hCuatro1.precioHabitacion();
        hoteles.add(hCuatro1);

        //hotel 5 estrellas
        Hotel5 hCinco1 = new Hotel5(2, 4, 7, 'A', "Mostaza", 150, 300, 750, 30, 0, "cr7 hoteles", "gran via", "madrid", "pipo gorosito");
        alojamiento.add(hCinco1);
        hCinco1.precioHabitacion();
        hoteles.add(hCinco1);

        //hotel 4 estrellas
        Hotel4 hCuatro2 = new Hotel4('B', "burger kings", 100, 50, 230, 20, 0, "diplomatic", "belgrano", "mendoza", "dario benedetto");
        alojamiento.add(hCuatro2);
         hCuatro2.precioHabitacion();
         hoteles.add(hCuatro2);
         

        //hotel 5 estrellas
        Hotel5 hCinco2 = new Hotel5(2, 6, 10, 'A', "PANINI", 300, 500, 750, 75, 0, "intercontinental", "guaymallen", "mendoza", "lionel scaloni");
        alojamiento.add(hCinco2);
        hCinco2.precioHabitacion();
       hoteles.add(hCinco2);

        //camping 1
        Camping c1 = new Camping(200, 4, true, "publico", 1000, "YPF", "irala 233", "maipu", "sergio berni");
        alojamiento.add(c1);

        //camping 2
        Camping c2 = new Camping(130, 2, false, "privado", 870, "pescador", "palacios 14788", "maipu", "sergio busquet");
        alojamiento.add(c2);
        
        //residencia 1
        Residencia r1 = new Residencia(26, true, true, "publico", 360, "RESIDENCIA MARTINEZ", "ulises 54", "berazategui", "antonela rocuzzo");
        alojamiento.add(r1);
        
        //residencia 2
        Residencia r2 = new Residencia(15, true, false, "publico", 400, "RESIDENCIA ARGENTINOS", "peru 54", "malasia", "susana gimenez");
        alojamiento.add(r2);        
    }
    
    public void menu(){
        
        boolean flag = true;
        crearAlojamientos();
     do{
         System.out.println("\n<<<<<<<<<<<<<<<<<<<BIENVENIDO A ALOJAMIENTOS>>>>>>>>>>>>>>>>>>>>>>>>\n"
                 + "1. Ver todos los alojamientos\n"
                 + "2. Ver todos los hoteles\n"
                 + "3. Ver todos los camping con restaurant\n"
                 + "4. Ver todas las residencias con descuentos\n"
                 + "5. Salir");
         int opc = leer.nextInt();
         
         Collections.sort(hoteles);
         switch(opc){
             case 1:
                 for (Alojamiento aux : alojamiento) {
                     System.out.println(aux);
                     System.out.println("\n---------------------------------------------------------------------");
                 }
                 break;
             case 2:
                 for (Hotel aux : hoteles) {
                     System.out.println(aux);
                     System.out.println("\n---------------------------------------------------------------------");
                 }
                 break;
             case 3:
                 for (Alojamiento aux : alojamiento) {
                     if (aux instanceof Camping) {
                         Object object = (Camping) aux;
                         if(((Camping) aux).isRestaurante()==true){
                             System.out.println(aux);
                             System.out.println("\n---------------------------------------------------------------------");
                         }
                     }
                 }
                 break;
             case 4:
                 for (Alojamiento aux : alojamiento) {
                     if (aux instanceof Residencia) {
                         Object object = (Residencia) aux;
                         if(((Residencia) aux).isDescuentoGremios()==true){
                             System.out.println(aux);
                             System.out.println("\n---------------------------------------------------------------------");
                         }
                     }
                 }
                 break;
             case 5: 
                 System.out.println("ADIOS...");
                 flag=false;
                 
                 
         }
         
     }while(flag);
        
    }
    
    
}
