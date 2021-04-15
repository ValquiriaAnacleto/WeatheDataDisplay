/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Tempo;
import view.TelaInicialView;

/**
 *
 * @author Valquíria Anacleto
 */
public class IncluirDadosTempo {

    private TelaInicialView view;

    public IncluirDadosTempo() {
        view = new TelaInicialView();
        
        view.getBtnIncluir().addActionListener(new ActionListener(){
        
               @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            adicionar(view);
                            
                        }
                    });
        
 
        
            
   
        
        
   
    }
    
    

    public void adicionar(TelaInicialView view) {
       Tempo tempo = new Tempo();
        try {
            String data = view.getTxtData().getText();
            String temperatura = view.getTxtTemperatura().toString();
            String humidade = view.getTxtHumidade().getText();

            String pressao = view.getTxtPressao().getText();
            
              JOptionPane.showMessageDialog(null , " cadastrado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }
    private void LimparDados() {
        view.getTxtData().setText("");
        view.getTxtTemperatura().setText("");
        view.getTxtHumidade().setText("");
        view.getTxtPressao().setText("");
      
    }
}
