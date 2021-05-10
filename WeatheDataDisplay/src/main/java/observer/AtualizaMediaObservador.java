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
public class AtualizaMediaObservador implements IObservador {

    private float temperatura = 0;
    private float humidade = 0;
    private float pressao = 0;
    private float temperaturaMedia = 0;
    private float humidadeMedia = 0;
    private float pressaoMedia = 0;
    private int numeroRegistros = 0;

    @Override
    public void atualizar(ArrayList<Tempo> tempos) {
        if (tempos.size() > 0) {
            temperatura = 0;
            humidade = 0;
            pressao = 0;
            numeroRegistros = 0;

            for (Tempo tempo : tempos) {
                temperatura += tempo.getTemperatura();
                humidade += tempo.getHumidade();
                pressao += tempo.getPressao();
                numeroRegistros++;

            }
            temperaturaMedia = calculoMedia(temperatura, numeroRegistros);
            humidadeMedia = calculoMedia(humidade, numeroRegistros);
            pressaoMedia = calculoMedia(pressao, numeroRegistros);

            ExibicaoAtual.atualizarMedia(temperaturaMedia, humidadeMedia, pressaoMedia, numeroRegistros);

        } else {
            ExibicaoAtual.atualizarMedia(0, 0, 0, 0);
        }
    }

    public float calculoMedia(float unidade, float registros) {

        return unidade / registros;
    }

}
