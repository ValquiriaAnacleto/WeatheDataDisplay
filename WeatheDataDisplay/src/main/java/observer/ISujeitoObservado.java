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
public interface ISujeitoObservado {


    
    public void remover(IObservador observador);
     public void registrar(IObservador observador);

    public abstract void notificar();
}
