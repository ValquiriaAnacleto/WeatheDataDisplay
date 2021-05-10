/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import observer.IObservador;
import observer.ISujeitoObservado;
import model.Tempo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import observer.AtualizaDadosObservador;
import observer.AtualizaMediaObservador;
import observer.AtualizaTabelaObservador;
import observer.IObservador;
import observer.ISujeitoObservado;

/**
 *
 * @author Valquíria Anacleto
 */
public final class TempoCollection implements ISujeitoObservado {

    private final ArrayList<Tempo> dadosTempo;
    private final ArrayList<IObservador> observadores;
    private static TempoCollection instancia;

    private final AtualizaDadosObservador ob1 = new AtualizaDadosObservador();
    private final AtualizaTabelaObservador ob2 = new AtualizaTabelaObservador();
    private final AtualizaMediaObservador ob3 = new AtualizaMediaObservador();

    public TempoCollection() {
        dadosTempo = new ArrayList<>();
        observadores = new ArrayList<>();
        registrar(ob1);
        registrar(ob2);
        registrar(ob3);
    }

    @Override
    public void notificar() {

        for (IObservador o: observadores) {
    
            o.atualizar(dadosTempo);
        }

        JOptionPane.showConfirmDialog(null, " Lá vai uma notificação!");

    }

    public void adicionar(Tempo tempo) {
        dadosTempo.add(tempo);
        notificar();
    }

    public void remover(Tempo tempo) {
        try {
         for (int i = 0; i < dadosTempo.size(); i++) {
              if (dadosTempo.get(i).getData().equals(tempo.getData())) {
                   dadosTempo.remove(i);
            notificar();
         }
        
           
        } 
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!!");
        }
    }
    

    @Override
    public void remover(IObservador observador) {
        observadores.remove(observador);
        
    }

    @Override
    public void registrar(IObservador observador) {
        observadores.add(observador);
    }

    public static TempoCollection getInstancia() {
        if (instancia == null) {
            instancia = new TempoCollection();
        }
        return instancia;
    }

    public static void setInstancia(TempoCollection instancia) {
        TempoCollection.instancia = instancia;
    }

    public ArrayList<Tempo> getDados() {
        return dadosTempo;
    }

}
