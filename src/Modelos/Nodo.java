/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author umg
 */
public class Nodo {
int dato;
Nodo siguiendte;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiendte=null;
        
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiendte() {
        return siguiendte;
    }

    public void setSiguiendte(Nodo siguiendte) {
        this.siguiendte = siguiendte;
    }


}
