/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import org.jfree.chart.JFreeChart;

/**
 *
 * @author Valquíria Anacleto
 */
public class TituloEixoY extends TituloEixo {

    public TituloEixoY(String nome, Componente componente) {
        super(nome, componente);
    }


    @Override
    public JFreeChart plotar()  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
