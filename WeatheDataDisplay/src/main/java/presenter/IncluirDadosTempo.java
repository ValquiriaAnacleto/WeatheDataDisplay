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

    public void adicionar(TelaInicialView view) {
        Tempo tempo = new Tempo();
        String tempos[] = new String[4];

       /* String data = view.getTxtData().getText();
        String temperatura = view.getTxtTemperatura().getText();
        String humidade = view.getTxtHumidade().getText();

        String pressao = view.getTxtPressao().getText(); */

        //if (!data.isEmpty() && !temperatura.isEmpty() && !humidade.isEmpty() && !pressao.isEmpty()) {
        
             tempos[0] =  view.getTxtData().getText();
            tempos[1] =  view.getTxtTemperatura().getText();
             tempos[2] =  view.getTxtHumidade().getText();
              tempos[3] =  view.getTxtPressao().getText();

            tempo.setMedicao(tempos);
            LimparCampos(view);

       /*     if (model.TempoCollection.getInstancia().getDados().contains(tempo)) {

                JOptionPane.showMessageDialog(view, " cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(view, "Digite os dados!!");

            }*/
        
    }

    private void LimparCampos(TelaInicialView view) {
        view.getTxtData().setText("");
        view.getTxtTemperatura().setText("");
        view.getTxtHumidade().setText("");
        view.getTxtPressao().setText("");

    }
}
