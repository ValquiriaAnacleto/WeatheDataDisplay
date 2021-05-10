/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import model.Tempo;
import presenter.ExibicaoAtual;

/**
 *
 * @author Valquíria Anacleto
 */
public class AtualizaDadosObservador implements IObservador {

    private String data;
    private float temperatura;
    private float humidade;
    private float pressao;
    private int num;
    


    @Override
    public void atualizar(ArrayList<Tempo>tempo) {
          if (tempo.size() > 0) {
            this.data = tempo.get(tempo.size() - 1).getData();
            this.temperatura = tempo.get(tempo.size() - 1).getTemperatura();
            this.humidade = tempo.get(tempo.size() - 1).getHumidade();
            this.pressao = tempo.get(tempo.size() - 1).getPressao();
           

            ExibicaoAtual.atualizar(data, temperatura, humidade, pressao);

         }else{
           ExibicaoAtual.limparCampos();
        }
    }
}
