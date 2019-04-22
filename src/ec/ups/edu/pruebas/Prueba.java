/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.pruebas;

import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Pez;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Estudiante
 */
public class Prueba {
   
   public static void main(String[] args) {
   
       Perro p =new Perro();

//Declaracion de Variables de la clase Perro
        p.setCodigo(1);
        p.setNombre("Safira");
        p.setEdad(1);
        p.setPeso(2.5);
        p.setSexo("Macho");
     
        
        Perro p1= new Perro();
        p1.setCodigo(2);
        p1.setNombre("Babas");
        p1.setEdad(1);
        p1.setPeso(2.5);
        p1.setSexo("hembra");
        
        Pez pez = new Pez();
        pez.setCodigo(2);
       ////sirve para comparar los codigos 
        if (p.equals(p1)){
            System.out.println("son iguales :-)");
        }else{
        System.out.println("no son iguales :-(");
        }
        
        Set<Perro> lista=new HashSet<>();
        lista.add(p);
        lista.add(p1);
        for(Perro perro : lista){
            System.out.println("Perro: "+ perro.getNombre());
        }
        if (lista.contains(p1)){
            System.out.println("si existe! ");
        }
        
        //compareTo
       SortedSet<Perro> listaOrdenada = new TreeSet<>();
       listaOrdenada.add(p);
       listaOrdenada.add(p1);
       System.out.println("Lista ordenada");
       for (Perro perro:listaOrdenada) {
       System.out.println(perro.getNombre());
       }
       
        }

      
}

 

