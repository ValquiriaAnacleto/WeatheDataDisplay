/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss;

import observer.IObservador;
import observer.ISujeitoObservado;
import model.Tempo;
import java.util.ArrayList;

/**
 *
 * @author Valquíria Anacleto
 */
public class TempoCollection extends ISujeitoObservado {

    private ArrayList<Tempo> dadosTempo;

    public TempoCollection(ArrayList<Tempo> dadosTempo) {
        this.dadosTempo = dadosTempo;
    }

    @Override
    public void notificar() {
         for(IObservador observador : observadores){
            observador.atualizar(this);
        }
    }
    
    public void adicionar(Tempo tempo){
        dadosTempo.add(tempo);
        notificar();
    }
    
    public void remover(Tempo tempo){
        dadosTempo.remove(tempo);
        notificar();
    }
    

  
}
