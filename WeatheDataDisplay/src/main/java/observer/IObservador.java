/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import model.Tempo;

/**
 *
 * @author Valquíria Anacleto
 */
public interface IObservador {
    public void atualizar(ArrayList<Tempo> tempo);
}
