/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import com.pss.Teste;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Tempo;
import static presenter.ExibicaoAtual.tabela;
import view.TelaInicialView;

/**
 *
 * @author Valquíria Anacleto
 */
public class ExcluirDadosTempo {

    public void remover() {
       
        
        Tempo tempo = new Tempo();  //
        TelaInicialView view = Teste.getTela();//
        JTable table = Teste.getTela().getDadosTabela();//
          

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(table.getSelectedRow() < 0) {
              JOptionPane.showMessageDialog(null, "erro!");
            
           } else {
             Vector vetorTempo = model.getDataVector().elementAt(table.getSelectedRow());
              String data, temperatura, umidade, pressao;
        
         data = vetorTempo.get(0).toString();
        temperatura =vetorTempo.get(1).toString();
        umidade =vetorTempo.get(2).toString();
        pressao = vetorTempo.get(3).toString();
        
        String[] vetorRemover = new String[4];
         vetorRemover[0] = data;
            vetorRemover[1] = temperatura;
            vetorRemover[2] = umidade;
            vetorRemover[3] = pressao;
            tempo.setExcluirMedicao(vetorRemover);
            atualiza(table.getSelectedRow());
        }
    }

        
    public void atualiza(int index) {
        
       ExibicaoAtual.removerDadoTabela(index); 
    }
      

       
        
        

    

}
