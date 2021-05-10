/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Tempo;
import presenter.ExibicaoAtual;

/**
 *
 * @author Valquíria Anacleto
 */
public class AtualizaTabelaObservador implements IObservador {

    @Override
    public void atualizar(ArrayList<Tempo> tempo) {
       // tabelaAtual = tempo.size();
        
        if ( tempo.size() > 0) {
             try {
        
           /* this.data = tempo.get(tempo.size() - 1).getData();
            this.temperatura = tempo.get(tempo.size() - 1).getTemperatura();
            this.humidade = tempo.get(tempo.size() - 1).getHumidade();
            this.pressao = tempo.get(tempo.size() - 1).getPressao();*/
            ExibicaoAtual.tabela(tempo.get(tempo.size()-1));

        } catch (Exception e) {
            JOptionPane.showMessageDialog( // Caixa de mensagem
		null, // Janela da aplicação (opcional, pode ser null)
		"Digite um valor numérico válido no campo", // Mensagem
		"Erro de validação", // Título da caixa de mensagem
		JOptionPane.ERROR_MESSAGE // Ícone da caixa de mensagem
	);
                
        
        }
    
        }
    }
}
