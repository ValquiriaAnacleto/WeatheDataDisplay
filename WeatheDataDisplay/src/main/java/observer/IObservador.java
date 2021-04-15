/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import com.pss.TempoCollection;

/**
 *
 * @author Valquíria Anacleto
 */
public interface IObservador {
    public void atualizar(TempoCollection dadosTempo);
}
