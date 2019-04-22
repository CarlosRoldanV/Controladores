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
 * @author Byron PC
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
        controladorPerro op=new controladorPerro();
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
                    //opcion para el crud aire acondicionado
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
                               System.out.println("ingrese el codigo");
                               int codigo=teclado.nextInt();
                                System.out.println("ingrese el nombre del Perro");
                                String nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                int edad = teclado.nextInt();                       
                                System.out.println("ingrese peso");
                                double peso =teclado.nextDouble();
                                System.out.println("ingrese el sexo");
                                String sexo = teclado.nextLine();
                                op.create(p);
                                
                                   break;
                             
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                System.out.println("Ingrese el codigo a leer");
                                 int c = teclado.nextInt();
                                 op.read(c);
                                System.out.println(op.read(c));
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