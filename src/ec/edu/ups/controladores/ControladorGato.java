/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Gato;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Carlos
 */
public class ControladorGato {
  private SortedSet<Gato> lista;
    private int codigo;
    
    public ControladorGato() {
        lista = new TreeSet<>();
        codigo = 0;
    }
   public void create(Gato objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
   public Gato read(int codigo) {
        for (Gato gato : lista) {
            if (gato.getCodigo() == codigo) {
                return gato;
            }
        }
        return null;
    }
    public void update(Gato objeto) {
        for (Gato gato : lista) {
           
            if(gato.equals(objeto)){
                lista.remove(gato);
                lista.add(objeto);
                break;
            }
        }
    }
    
   public void delete(int codigo) {
        for (Gato gato : lista) {
           
            if(gato.getCodigo()== codigo){
                lista.remove(gato);
                break;
            }
        }
    }
    public void imprimir(){
        System.out.println("lista Ordenada");
        for (Gato gato : lista) {
            System.out.println(gato.toString());
        }
    }
    public void codigo(){
       for (Gato gato : lista) {
            System.out.println(gato.getCodigo()+". "+gato.getNombre());
        } 
    }
    public void lista (){
        for (Gato gato : lista) {
            System.out.println(gato);
        }
    }
}
