/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_extra2;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class Herencia_extra2 {

    /**
     * @param args the command line arguments
     * 



Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Edificio> listEdif = new ArrayList();
        
        Polideportivo poli1 = new Polideportivo();
        System.out.println("<<<<<<<<<<<<PRIMER POLIDEPORTIVO>>>>>>>>>>>><\n"
                + "nombre: ");
        poli1.setNombre(leer.next());
        System.out.println("Instalacion: TECHADO/ABIERTO");
        poli1.setInstalacion(leer.next());

        System.out.println("Ancho: ");
        poli1.setAncho(leer.nextInt());

        System.out.println("Largo: ");
        poli1.setLargo(leer.nextInt());

        System.out.println("Alto: ");
        poli1.setAlto(leer.nextInt());
        listEdif.add(poli1);
        
        
        

        Polideportivo poli2 = new Polideportivo();
        System.out.println("\n<<<<<<<<<<<<SEGUNDO POLIDEPORTIVO>>>>>>>>>>>><\n"
                + "nombre: ");
        poli2.setNombre(leer.next());
        System.out.println("Instalacion: TECHADO/ABIERTO");
        poli2.setInstalacion(leer.next());

        System.out.println("Ancho: ");
        poli2.setAncho(leer.nextInt());

        System.out.println("Largo: ");
        poli2.setLargo(leer.nextInt());

        System.out.println("Alto: ");
        poli2.setAlto(leer.nextInt());
        listEdif.add(poli2);
        
        
        

        EdificioDeOficinas edificiOfi = new EdificioDeOficinas();
        System.out.println("\n<<<<<<<<<<<<<<EDIFICIO CON OFICINAS>>>>><>>>>>><>\n"
                + "Cantidad de oficinas: ");
        edificiOfi.setnOficinas(leer.nextInt());
        System.out.println("Cantidad de personas por oficina: ");
        edificiOfi.setPersonasXofi(leer.nextInt());

        System.out.println("Cantidad de pisos del edificio: ");
        edificiOfi.setnPisos(leer.nextInt());

        System.out.println("Ancho: ");
        edificiOfi.setAncho(leer.nextInt());

        System.out.println("Largo: ");
        edificiOfi.setLargo(leer.nextInt());

        System.out.println("Alto: ");
        edificiOfi.setAlto(leer.nextInt());
        listEdif.add(edificiOfi);
        
        

        EdificioDeOficinas edificiOfi2 = new EdificioDeOficinas();
        System.out.println("\n<<<<<<<<<<<<<<EDIFICIO CON OFICINAS>>>>><>>>>>><>\n"
                + "Cantidad de oficinas: ");
        edificiOfi2.setnOficinas(leer.nextInt());
        System.out.println("Cantidad de personas por oficina: ");
        edificiOfi2.setPersonasXofi(leer.nextInt());

        System.out.println("Cantidad de pisos del edificio: ");
        edificiOfi2.setnPisos(leer.nextInt());

        System.out.println("Ancho: ");
        edificiOfi2.setAncho(leer.nextInt());

        System.out.println("Largo: ");
        edificiOfi2.setLargo(leer.nextInt());

        System.out.println("Alto: ");
        edificiOfi2.setAlto(leer.nextInt());

        listEdif.add(edificiOfi2);
        
        int poliTechado=0;
        int poliAbierto=0;
        
        for (Edificio aux : listEdif) {
            

            if (aux instanceof Polideportivo) {
                Object object = (Polideportivo) aux;
                System.out.println("----------POLIDEPORTIVO-------------");
                System.out.println("SUPERFICIE: " + aux.calcularSuperficie());
                System.out.println("VOLUMEN: " + aux.calcularVolumen());
                if (((Polideportivo) aux).getInstalacion().equalsIgnoreCase("techado")) {
                    poliTechado++;

                } else if (((Polideportivo) aux).getInstalacion().equalsIgnoreCase("abierto")) {
                    poliAbierto++;
                }
            }

            if (aux instanceof EdificioDeOficinas) {
                Object object = (EdificioDeOficinas) aux;
                System.out.println("----------EDIFICIO OFICINAS-------------");
                System.out.println("SUPERFICIE: " + aux.calcularSuperficie());
                System.out.println("VOLUMEN: " + aux.calcularVolumen());
                ((EdificioDeOficinas) aux).cantPersonas();
            }
        }

        System.out.println("\nPOLIDEPORTIVOS TECHADOS: "+poliTechado+"\n"
                + "POLIDEPORTIVOS ABIERTOS: "+poliAbierto);
    }
    
}
