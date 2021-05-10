/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import com.pss.Teste;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Tempo;
import view.TelaInicialView;



/**
 *
 * @author Valquíria Anacleto
 */
public class ExibicaoAtual {

    public static void atualizar(String data, float temperatura, float humidade, float pressao) {

        TelaInicialView view = Teste.getTela();
        view.setDataAtual(data);
        view.setTemperaturaAtual(Float.toString(temperatura) + " ºC");
        view.setHumidadeAtual(Float.toString(humidade) + " %");
        view.setPressaoAtual(Float.toString(pressao) + " Pa");
      

    }

    public static void limparCampos() {
        TelaInicialView view = Teste.getTela();

        view.setDataAtual("-");
        view.setTemperaturaAtual("-");
        view.setHumidadeAtual("-");
        view.setPressaoAtual("-");

    }

    public static void tabela(Tempo tempo) {
    

        JTable table = Teste.getTela().getDadosTabela();

        DefaultTableModel model = (DefaultTableModel)table.getModel();

        model.addRow(new Object[]{tempo.getData(),tempo.getTemperatura(),tempo.getHumidade(), tempo.getPressao()});

    }
     public static void removerDadoTabela(int index) {
      JTable table = Teste.getTela().getDadosTabela();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(index);
    }
    
    
       public static void atualizarMedia( float temperatura, float humidade, float pressao, int numeroRegistro) {

        TelaInicialView view = Teste.getTela();
        
        view.setMediaTemperatura(Float.toString(temperatura) + " ºC");
        view.setMediaHumidade(Float.toString(humidade) + " %");
        view.setMediaPressao(Float.toString(pressao) + " Pa");
        view.setNumeroRegistro(Integer.toString(numeroRegistro));
      

    }
    
    
    
   

}
