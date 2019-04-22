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
public class controladorPerro {

    public controladorPerro(List<Perro> lista, int codigo) {
        this.lista = lista;
        this.codigo = codigo;
    }
    
    public List<Perro> lista;
    private int codigo;

    public controladorPerro() {
      lista = new ArrayList<>();
      
    }
    public void create (Perro objeto){
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
    public void update (Perro objeto) {
        for (int i=0; i<lista.size();i++){
            Perro elemento= lista.get(i);
        if (elemento.equals(objeto)){
            lista.set(i, objeto);
            break;
        }          
        }
    }
    public void delate(Perro objeto){
        for (int i=0; i<lista.size();i++){
            Perro elemento= lista.get(i);
        if (elemento.getCodigo() == codigo){
            lista.remove(i);
            break;
        }
        }
    }
    
}

