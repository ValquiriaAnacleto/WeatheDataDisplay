/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Tempo;

import presenter.ExcluirDadosTempo;
import presenter.IncluirDadosTempo;
import view.TelaInicialView;

/**
 *
 * @author Valquíria Anacleto
 */
public class Teste extends JFrame {

    private static TelaInicialView view = new TelaInicialView();

    public static void main(String[] args) throws Exception {
        Tempo tempo = new Tempo();

        IncluirDadosTempo incluir = new IncluirDadosTempo();
        ExcluirDadosTempo excluir = new ExcluirDadosTempo();

        view.getBtnIncluir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incluir.adicionar(view);

                /* Componente grafico = new Grafico(dataSet) 

                    grafico  = new TituloEixoY(" ", grafico);
                
                 */
            }
        });

        view.getBtnExcluirDados().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluir.remover();
            }
        });

    }

    public static TelaInicialView getTela() {
        return view;
    }
}
