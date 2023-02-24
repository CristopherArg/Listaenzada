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
public class Lista {
Nodo Primero;

public void InsertarNodo(int dato)
{
    Nodo nodoNuevo = new Nodo(dato);
    if(Primero == null)
    {
        Primero = nodoNuevo;
    }
    else
    {
        nodoNuevo.siguiendte  =Primero;
        Primero = nodoNuevo;
        
    }
}
public void ListaNodos()
{
    Nodo Auxiliar;
    Auxiliar = Primero;
    while(Auxiliar != null)
    {
        System.out.println(Auxiliar.getDato());
        Auxiliar = Auxiliar.siguiendte;
        
    }
}
}
