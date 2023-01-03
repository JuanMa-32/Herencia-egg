/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalDeServicio;
import Entidad.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class UniversidadService {
    
    ArrayList<Persona> facultad = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPersonas(){
        
      
        
        Estudiante estu1 = new Estudiante("Matematica", "albert", "einstein", 12369541, "casado");
        facultad.add(estu1);
        
        Estudiante estu2 = new Estudiante("full Stack", "juan", "Aguero", 44122741, "soltero");
        facultad.add(estu2);
        
        Profesor pf1 = new Profesor("lenguaje", 2015, 78, "gustavo", "Alfaro", 123665489, "casado");
        facultad.add(pf1);
        
        
         Profesor pf2 = new Profesor("matematicas", 2020, 123, "sofia", "perez", 4012236,"soltera");
        facultad.add(pf2);
        
        PersonalDeServicio ps1 = new PersonalDeServicio("biblioteca", 2019, 150, "pepe", "Argento", 24122654, "soltero");
        facultad.add(ps1);
        
        PersonalDeServicio ps2 = new PersonalDeServicio("secretaria", 2021, 163, "lionel", "Scaloni", 23122000, "casado");
        facultad.add(ps2);
    }
    
    public void menu(){
        
        crearPersonas();
        boolean flag = true;
        
        do {
            System.out.println("---MENU FACULTAD---\n"
                    + "1.Cambio de estado civil de una persona\n"
                    + "2.Reasignacion de despacho de un empleado\n"
                    + "3.Matriculacion de un estudiante a un nuevo curso \n"
                    + "4.Cambio de departamento de un profesor\n"
                    + "5.Traslado de sección de un empleado del personal de servicio\n"
                    + "6.Imprimir toda la información de cada tipo de individuo\n"
                    + "7.Salir del programa");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el dni de la persona que cambiara el estado civil. ");
                    int dni = leer.nextInt();
                    for (Persona aux : facultad) {
                        if (aux.getDni() == dni) {
                            System.out.println("Ingrese el nuevo estado civil");
                            aux.cambioEstadoCivil(leer.next());
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nIngrese el dni del empleado que reasignara su despacho ");
                    int id = leer.nextInt();
                    for (Persona aux : facultad) {
                        if (aux instanceof Profesor) {
                            Object object = (Profesor) aux;
                            if (aux.getDni() == id) {
                                System.out.println("ingrese el nuevo despacho");
                                ((Profesor) aux).reasignacionDespacho(leer.nextInt());
                            }
                        }
                          if (aux instanceof PersonalDeServicio) {
                            Object object = (PersonalDeServicio) aux;
                            if (aux.getDni() == id) {
                                System.out.println("ingrese el nuevo despacho");
                                ((PersonalDeServicio) aux).reasignacionDespacho(leer.nextInt());
                            }
                        }
                    }
                    break;
                case 3:
                      System.out.println("\nIngrese el dni del estudiante que se matriculara a un nuevo curso ");
                    int key = leer.nextInt();
                    for (Persona aux : facultad) {
                        if (aux instanceof Estudiante) {
                            Object object = (Estudiante) aux;
                            if(aux.getDni()==key){
                                System.out.println("Ingrese el curso nuevo que se matriculara");
                                ((Estudiante) aux).MatricularseAotroCurso(leer.next());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nIngrese el dni del profesor que sera reasignado ");
                    int key3 = leer.nextInt();
                    for (Persona aux : facultad) {
                        if (aux instanceof Profesor) {
                            Object object = (Profesor) aux;
                            if(aux.getDni()==key3){
                                System.out.println("Ingrese el nuevo departamento");
                                ((Profesor) aux).cambioDep(leer.next());
                            }
                        }
                    }
                  
                    break;
                case 5:
                     System.out.println("\nIngrese el dni del empleado de personal que sera trasladado");
                    int key2 = leer.nextInt();
                    for (Persona aux : facultad) {
                        if (aux instanceof PersonalDeServicio) {
                            Object object = (PersonalDeServicio) aux;
                            if(aux.getDni()==key2){
                                System.out.println("Ingrese a donde sera trasladado");
                                ((PersonalDeServicio) aux).trasladoSeccion(leer.next());
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("\n--------Informacion de todos los individuos---------");
                    for (Persona persona : facultad) {
                        System.out.println(persona);
                        System.out.println("\n----------------------------------------------");
                    }
                    break;
                case 7:
                    System.out.println("\nSALIENDO...");
                    flag=false;
            }
        } while (flag);
    }
}
