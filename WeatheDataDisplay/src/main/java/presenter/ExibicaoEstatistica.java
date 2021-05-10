/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import observer.IObservador;
import model.TempoCollection;
import java.util.ArrayList;
import model.Tempo;

import view.IExibicao;

/**
 *
 * @author Valquíria Anacleto
 */
public class ExibicaoEstatistica implements IObservador, IExibicao {

    public ExibicaoEstatistica(TempoCollection dadosTempo) {

    }

    @Override
    public void exibir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(ArrayList<Tempo> tempo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
