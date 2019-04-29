/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Gato;
import ec.edu.ups.clases.Leon;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Mono;
import ec.edu.ups.controladores.ControladorMono;
import ec.edu.ups.controladores.ControladorGato;
import ec.edu.ups.controladores.ControladorLeon;
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
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner (System.in);
        String sn= "";
        int opcion;
        int codigo;
        int opcionMenu= -1;
        controladorPerro cp=new controladorPerro();
      ControladorLeon  cl=new ControladorLeon();
      ControladorMono cm= new ControladorMono();
      ControladorGato cg=new ControladorGato();
        Perro p= new Perro();
        do{
                    
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Perro");
            System.out.println("2. CRUD gato");
            System.out.println("3. CRUD Serpiente");
            System.out.println("4. CRUD Mono");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1: 
                    //opcion para el crud 
                    do{
                        System.out.println("MENU PERRO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. lista");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenu = teclado.nextInt();
                        
                        switch(opcionMenu){
                            case 1:
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del 
                                System.out.println("ingrese datos del Perro");
                                 System.out.println("ingrese el nombre del Perro");
                                String nombre=teclado1.nextLine();
                                System.out.println("ingrese la edad");
                                int edad = teclado1.nextInt();                       
                                System.out.println("ingrese el peso");
                                double peso = teclado1.nextDouble();
                                System.out.println("ingrese el tamaño");
                                String tamaño =teclado2.nextLine();
                                System.out.println("ingrese el numero de extremidades");
                                int extremidades = teclado1.nextInt();
                                System.out.println("ingrese el sexo");
                              String sexo = teclado2.nextLine();
                                System.out.println("ingrese el alimento");
                                String alimento =teclado2.nextLine();
                                System.out.println("ingrese ls raza");
                                String raza = teclado2.nextLine();
                                System.out.println("ingrese el pelaje");
                                String pelaje = teclado2.nextLine();
                                System.out.println("ingrese el color");
                                String color = teclado2.nextLine();
                                System.out.println("ingrese el caracter");
                                String caracter = teclado2.nextLine();
                                Perro perro = new Perro(raza, pelaje, color, caracter, tamaño, extremidades, sexo, alimento, nombre, edad, peso);
                                cp.create(perro);
                                
                                   break;
                             
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                System.out.println("Ingrese el codigo del objeto a leer");
                                cp.codigo();
                                System.out.println(cp.read(teclado.nextInt()));
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                System.out.println("Ingrese el codigo del objeto a modificar");
                                cp.codigo();
                               codigo = teclado.nextInt();
                                if (cp.read(codigo) != null) {
                               System.out.println("ingrese el nombre del Perro");
                                nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                 edad = teclado.nextInt();                       
                                System.out.println("ingrese el peso");
                                 peso = teclado.nextDouble();
                                System.out.println("ingrese el tamaño");
                                 tamaño =teclado.nextLine();
                                System.out.println("ingrese el numero de extremidades");
                                 extremidades = teclado.nextInt();
                                System.out.println("ingrese el sexo");
                               sexo = teclado.nextLine();
                                System.out.println("ingrese el alimento");
                                 alimento =teclado.nextLine();
                                System.out.println("ingrese ls raza");
                                 raza = teclado.nextLine();
                                System.out.println("ingrese el pelaje");
                                 pelaje = teclado.nextLine();
                                System.out.println("ingrese el color");
                                 color = teclado.nextLine();
                                System.out.println("ingrese el caracter");
                                 caracter = teclado.nextLine();
                                 perro = new Perro(raza, pelaje, color, caracter, tamaño, extremidades, sexo, alimento, codigo, nombre, edad, peso);
                                 cp.update(perro);
                                } else {
                                    System.out.println("El objeto no existe");
                                }
                                break;
                                   case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                  System.out.println("Ingrese el codigo del objeto a elmiminar");
                                cp.codigo();
                                codigo = teclado.nextInt();
                                cp.delate(codigo);
                                break;
                                case 5:
                                 cp.lista();
                                break;
                           }
                                }
                        while(opcionMenu !=6);
                    break;
                       
                case 2:
                    do {
                         System.out.println("MENU Gato");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. lista");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenu = teclado.nextInt();
                        switch (opcionMenu) {
                            case 1:
                                System.out.println("Ingrese datos del gato");
                               System.out.println("ingrese el nombre del Gato");
                                String nombre=teclado2.nextLine();
                                System.out.println("ingrese la edad");
                                int edad = teclado2.nextInt();                       
                                System.out.println("ingrese el peso");
                                double peso = teclado2.nextDouble();
                                System.out.println("ingrese el tamaño");
                                String tamaño =teclado1.nextLine();
                                System.out.println("ingrese el numero de extremidades");
                                int extremidades = teclado2.nextInt();
                                System.out.println("ingrese el sexo");
                                String sexo = teclado1.nextLine();
                                System.out.println("ingrese el alimento");
                                String alimento =teclado1.nextLine();
                                System.out.println("ingrese el tipo");
                                String tipo = teclado1.nextLine();
                                System.out.println("ingrese los a-os de vida");
                                int añosvida =teclado1.nextInt();
                                System.out.println("ingrese el color");
                                String color = teclado3.nextLine();
                                System.out.println("ingrese las medidas");
                                double medidas = teclado1.nextDouble();
                                Gato gato = new Gato(tipo, añosvida, color, medidas, tamaño, extremidades, sexo, alimento, nombre, edad, peso);
                                cg.create(gato);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                cg.codigo();
                                System.out.println(cg.read(teclado.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del objeto a modificar");
                                cg.codigo();
                                codigo = teclado.nextInt();
                                if (cg.read(codigo) != null) {
                                   System.out.println("ingrese el nombre del gato");
                                 nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                 edad = teclado.nextInt();                       
                                System.out.println("ingrese el peso");
                                 peso = teclado.nextDouble();
                                System.out.println("ingrese el tamaño");
                                 tamaño =teclado.nextLine();
                                System.out.println("ingrese el numero de extremidades");
                                 extremidades = teclado.nextInt();
                                System.out.println("ingrese el sexo");
                               sexo = teclado.nextLine();
                                System.out.println("ingrese el alimento");
                                 alimento =teclado.nextLine();
                                System.out.println("ingrese el tipo");
                                 tipo = teclado.nextLine();
                                System.out.println("ingrese los a-os de vida");
                                 añosvida =teclado.nextInt();
                                System.out.println("ingrese el color");
                                 color = teclado.nextLine();
                                System.out.println("ingrese las medidas");
                                 medidas = teclado.nextDouble();
                                  gato = new Gato(tipo, añosvida, color, medidas, tamaño, extremidades, sexo, alimento, codigo, nombre, edad, peso);
                                    cg.update(gato);
                                } else {
                                    System.out.println("El objeto no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                cg.codigo();
                                codigo = teclado.nextInt();
                                cg.delete(codigo);
                                break;
                            case 5:
                                cg.lista();
                                break;
                        }
                    } while (opcionMenu != 6);
                    break;
                case 3:
                    do {
                        System.out.println("MENU Leon");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. lista");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenu = teclado.nextInt();
                        switch (opcionMenu) {
                            case 1:
                                
                               System.out.println("ingrese el nombre del Leon");
                                String nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                int edad = teclado.nextInt();                       
                                System.out.println("ingrese el peso");
                                double peso = teclado.nextDouble();
                                System.out.println("ingrese el clima");
                                String clima = teclado.nextLine();
                                System.out.println("ingrese la ubicacion");
                                String ubicacion = teclado.nextLine();
                                System.out.println("ingese su fuerza");
                                int ferza = teclado.nextInt();
                                System.out.println("ingrese el precio");
                                double precio = teclado.nextDouble();
                                System.out.println("ingrese la velocidad m/s");
                                int velocidad = teclado.nextInt();
                                
                                 System.out.println("ingrese el numero de dientes");
                                 int numdietes = teclado.nextInt();
                                 
                                  System.out.println("ingrese la medida");
                                  int medidad = teclado.nextInt();
                                  System.out.println("ingrese la cantidad de hijos");
                                   int numhijos = teclado.nextInt();
                                Leon leon = new Leon(precio, numdietes, medidad, numhijos, clima, ubicacion, ferza, precio, nombre, edad, peso);
                                cl.create(leon);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                cl.codigo();;
                                System.out.println(cl.read(teclado.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar codigo del objeto a modificar");
                                cl.codigo();
                                codigo = teclado.nextInt();
                                if (cl.read(codigo) != null) {
                                    System.out.println("ingrese el nombre del Leon");
                                 nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                 edad = teclado.nextInt();                       
                                System.out.println("ingrese el peso");
                                 peso = teclado.nextDouble();
                                System.out.println("ingrese el clima");
                                 clima = teclado.nextLine();
                                System.out.println("ingrese la ubicacion");
                                 ubicacion = teclado.nextLine();
                                System.out.println("ingese su fuerza");
                                 ferza = teclado.nextInt();
                                System.out.println("ingrese el precio");
                                 precio = teclado.nextDouble();
                                System.out.println("ingrese la velocidad m/s");
                                 velocidad = teclado.nextInt();
                                
                                 System.out.println("ingrese el numero de dientes");
                                  numdietes = teclado.nextInt();
                                 
                                  System.out.println("ingrese la medida");
                                   medidad = teclado.nextInt();
                                  System.out.println("ingrese la cantidad de hijos");
                                    numhijos = teclado.nextInt();
                                 leon = new Leon(precio, numdietes, medidad, numhijos, clima, ubicacion, ferza, precio, nombre, edad, peso);
                                
                                  cl.update(leon);
                                } else {
                                    System.out.println("El objeno no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                cl.codigo();
                                codigo = teclado.nextInt();
                                cl.delete(codigo);
                                break;
                            case 5:
                                cl.lista();
                                break;
                        }
                    } while (opcionMenu != 6);
                    break;
                case 4:
                    do {
                       System.out.println("MENU mono");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. lista");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenu = teclado.nextInt();
                        opcionMenu = teclado.nextInt();
                        switch (opcionMenu) {
                            case 1:
                               System.out.println("ingrese el nombre del Leon");
                                String nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                int edad = teclado.nextInt();                       
                                System.out.println("ingrese el peso");
                                double peso = teclado.nextDouble();
                                System.out.println("ingrese el clima");
                                String clima = teclado.nextLine();
                                System.out.println("ingrese la ubicacion");
                                String ubicacion = teclado.nextLine();
                                System.out.println("ingese su fuerza");
                                int ferza = teclado.nextInt();
                                System.out.println("ingrese el precio");
                                double precio = teclado.nextDouble();
                                System.out.println("ingrese la habilidad");
                                String habilidad = teclado.nextLine();
                                System.out.println("ingrese altura");
                                int altura = teclado.nextInt();
                                System.out.println("ingrese el habitat");
                                String habitat = teclado.nextLine();
                                System.out.println("ingrese la  actitud");
                                String actitud = teclado.nextLine();
                                    Mono mono= new Mono(habilidad, altura, habitat, actitud, clima, ubicacion, ferza, precio, nombre, edad, peso);
                                  cm.create(mono);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                cm.codigo();
                                System.out.println(cm.read(teclado.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar codigo del objeto a modificar");
                                cm.codigo();
                                codigo = teclado.nextInt();
                                if (cm.read(codigo) != null) {
                                    System.out.println("ingrese el nombre del Leon");
                                 nombre=teclado.nextLine();
                                System.out.println("ingrese la edad");
                                 edad = teclado.nextInt();                       
                                System.out.println("ingrese el peso");
                                 peso = teclado.nextDouble();
                                System.out.println("ingrese el clima");
                                 clima = teclado.nextLine();
                                System.out.println("ingrese la ubicacion");
                                 ubicacion = teclado.nextLine();
                                System.out.println("ingese su fuerza");
                                 ferza = teclado.nextInt();
                                System.out.println("ingrese el precio");
                                 precio = teclado.nextDouble();
                                System.out.println("ingrese la habilidad");
                                 habilidad = teclado.nextLine();
                                System.out.println("ingrese altura");
                                 altura = teclado.nextInt();
                                System.out.println("ingrese el habitat");
                                 habitat = teclado.nextLine();
                                System.out.println("ingrese la  actitud");
                                 actitud = teclado.nextLine();
                                    mono = new Mono(habilidad, altura, habitat, actitud, clima, ubicacion, ferza, precio, nombre, edad, peso);
                                    cm.update(mono);
                                }else{
                                    System.out.println("El objeto no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                cm.codigo();
                                codigo = teclado.nextInt();
                                cm.delet(codigo);
                                break;
                            case 5:
                                cm.lista();
                                break;
                    }
                    } while (opcionMenu != 6);
            }
        } while (opcion < 5);

    }

}


