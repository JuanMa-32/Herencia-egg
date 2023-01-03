/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author NALDO
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Electrodomestico> conjuntoElctro = new ArrayList();
        
        Electrodomestico lav1 = new Lavadora();
        lav1.crearElectrodomestico();
        
       
        conjuntoElctro.add(lav1);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        Televisor tv1 = new Televisor();
        tv1.crearElectrodomestico();
        
        conjuntoElctro.add(tv1);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
         Lavadora lav2 = new Lavadora();
        lav2.crearElectrodomestico();
        
        conjuntoElctro.add(lav2);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        Televisor tv2 = new Televisor();
        tv2.crearElectrodomestico();
       
        conjuntoElctro.add(tv2);
        
        int totalTV=0;
        int totalLAV=0;
        int totalElectro=0;
        
        for (Electrodomestico aux : conjuntoElctro) {
            System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>><");
            aux.precioFinal();
            System.out.println(aux);
            
            if (aux instanceof Televisor) {
                Televisor object = (Televisor) aux;
                totalTV+=aux.getPrecio();
                continue;
            }
            
            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;
                totalLAV+=aux.getPrecio();
                continue;
            }
            
        }

        totalElectro=totalTV+totalLAV;
 
        System.out.println("\n PRECIO TOTAL GASTADO EN ELECTRODOMESTICOS: "+totalElectro+"\n"
                + "PRECIO TOTAL GASTADO EN TELEVISORES: "+totalTV+"\n"
                       + "PRECIO TOTAL GASTADO EN LAVADORAS: "+totalLAV);

    }
    
}
