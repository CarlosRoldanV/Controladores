/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Pez;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Estudiante
 */
public class controladorPez {
    private SortedSet<Pez>lista;
    private int codigo;
    public controladorPez(){
        lista=new TreeSet<>();
        codigo=1;
        
    }
    public void create (Pez objeto){
       codigo++;
        lista.add(objeto);
    }
    public Pez read (int codigo){
        for (Pez Pez:lista){
            if(Pez.getCodigo()==codigo){
                return Pez;
            }
        }
        return null;
    }
    public void update (Pez objeto) {
        for (Pez pez: lista){
        
        if (pez.equals(objeto)){
            lista.remove(pez);
            lista.add(pez);
            break;
        }          
        }
    }
    public void delate(Pez objeto){
        for (Pez pez: lista){
        if (pez.getCodigo() == codigo){
            lista.remove(pez);
            break;
        }
        }
    }
}
