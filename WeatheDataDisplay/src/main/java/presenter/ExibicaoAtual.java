/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import observer.IObservador;
import com.pss.TempoCollection;
import java.time.LocalDate;
import model.Tempo;

import view.IExibicao;
import view.TelaInicialView;

/**
 *
 * @author Valquíria Anacleto
 */
public class ExibicaoAtual  implements  IObservador,IExibicao{
    
  TelaInicialView view;
    
   

    public ExibicaoAtual() {
    
    }
    
    
   public void atualizar( TelaInicialView view) {
       Tempo tempo= new Tempo();
       view.getDataAtual().setText(tempo.getData());
       view.getTemperaturaAtual().setText(String.valueOf(tempo.getTemperatura()));
       view.getHumidadeAtual().setText(String.valueOf(tempo.getHumidade()));
       view.getPressaoAtual().setText(String.valueOf(tempo.getPressao()));
       
    }

    @Override
    public void exibir() {
        System.out.println("Exibição atual");
    }

    @Override
    public void atualizar(TempoCollection dadosTempo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
