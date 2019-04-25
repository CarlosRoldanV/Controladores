/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Perro;
import ec.edu.ups.controladores.controladorPerro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sn= "";
        int opcionMenuPrincipal = 0;
        int opcionMenuPerro=0;
        int opcionMenuPez=0;
        int opcionMenuSerpiente=0;
        int opcionMenuMono=0;
        controladorPerro cp=new controladorPerro();
        Perro p= new Perro();
        do{
                    
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Perro");
            System.out.println("2. CRUD Pez");
            System.out.println("3. CRUD Serpiente");
            System.out.println("4. CRUD Mono");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = teclado.nextInt();
            
            switch(opcionMenuPrincipal){
                case 1: 
                    //opcion para el crud 
                    do{
                        System.out.println("MENU PERRO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuPerro = teclado.nextInt();
                        
                        switch(opcionMenuPerro){
                            case 1:
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                 System.out.println("ingrese el nombre del Perro");
                                String nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                int edad = teclado.nextInt();                       
                                System.out.println("ingrese el peso");
                                double peso = teclado.nextDouble();
                                System.out.println("ingrese el tamaño");
                                String tamaño =teclado.nextLine();
                                System.out.println("ingrese el numero de extremidades");
                                int extremidades = teclado.nextInt();
                                System.out.println("ingrese el sexo");
                              String sexo = teclado.nextLine();
                                System.out.println("ingrese el alimento");
                                String alimento =teclado.nextLine();
                                System.out.println("ingrese ls raza");
                                String raza = teclado.nextLine();
                                System.out.println("ingrese el pelaje");
                                String pelaje = teclado.nextLine();
                                System.out.println("ingrese el color");
                                String color = teclado.nextLine();
                                System.out.println("ingrese el caracter");
                                String caracter = teclado.nextLine();
                                Perro perro = new Perro(raza, pelaje, color, caracter, tamaño, extremidades, sexo, alimento, nombre, edad, peso);
                                cp.create(perro);
                                
                                   break;
                             
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                               System.out.println("Ingrese el codigo del objeto a leer");
                                cp.codigo();
                                System.out.println(cp.read(teclado.nextInt()));
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuPerro !=5);
                    break;
                case 2:
                    //opcion para el crud de refrigerador
                    do{
                        
                    }while(opcionMenuPez !=5);
                    break;
                case 3:
                    //opcion para el crud de computador
                    do{
                        
                    }while(opcionMenuSerpiente !=5);
                    break;
                case 4:
                    //opcion para el crud de televisor
                    do{
                        
                    }while(opcionMenuMono !=5);
                    break;
                case 5:
                    //opcion para salir
                    System.out.println("Adiós !!!");
                    break;
            }
        }while(opcionMenuPrincipal != 5);
}
}