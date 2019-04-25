/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ControladorPerro {
 
   private List<Perro> lista;
    private int codigo;
    // Constructor
    public ControladorPerro() {
        codigo = 0;
        lista = new ArrayList<>();
    }
    
    public void create(Perro objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    public Perro read (int codigo){
        for (Perro Perro:lista){
            if(Perro.getCodigo()==codigo){
                return Perro;
            }
        }
        return null;
    }
   public void update(Perro objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Perro elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
            }
        }
    }
   
    public void delete(int codigo){
        for (int i=0; i<lista.size();i++){
            Perro elemento= lista.get(i);
        if (elemento.getCodigo() == codigo){
            lista.remove(i);
            break;
        }
        }
    }
    public void lista (){
        for (Perro perro : lista) {
            System.out.println(perro);
        }
    }
    // Metodo extra para mostrar por pantalla los codigos de los objetos
    public void codigo(){
        
       for (Perro perro : lista) {
            System.out.println(perro.getCodigo()+". "+perro.getNombre());
        } 
    }
    
}