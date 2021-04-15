/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author Valquíria Anacleto
 */
public abstract class ISujeitoObservado {
    
     protected ArrayList<IObservador> observadores;

    public ISujeitoObservado( ) {
        this.observadores = new ArrayList<>() ;
    }
     
     
     
     public void adicionar(IObservador observador){
        observadores.add(observador);
     }
        
     public void remover(IObservador observador) {
         observadores.remove(observador);
     }
       
    public abstract void notificar();
}
