/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presenter.IncluirDadosTempo;
import view.TelaInicialView;




/**
 *
 * @author Valquíria Anacleto
 */
public class Teste {

    public static void main(String[] args) {
         TelaInicialView tela = new TelaInicialView();
         IncluirDadosTempo  incluir= new IncluirDadosTempo();
         
         tela.getBtnIncluir().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    incluir.adicionar(tela);

                }
            });
         
     
        
        
      
    
    }

}
