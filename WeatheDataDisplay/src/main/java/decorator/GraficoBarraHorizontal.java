/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javax.swing.JFrame;
import model.Tempo;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Valquíria Anacleto
 */
public class GraficoBarraHorizontal extends Grafico {

    private Tempo tempo;

  

    

    public GraficoBarraHorizontal(DefaultCategoryDataset categoriaDataSet) {
        super(categoriaDataSet);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Gráfico Barra Horizontal");
        setSize(950, 700);
        setLocationRelativeTo(null);
        plotar();
        setVisible(true);
    }
    
    

    

    
    
    @Override
    public JFreeChart plotar()  {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.setValue(tempo.getTemperatura(), "Temperatura", " ");
        dataSet.setValue(tempo.getHumidade(), "Humidade", " ");
        dataSet.setValue(tempo.getPressao(), "TPressao", " ");

        JFreeChart graficoBarraHorizontal = ChartFactory.createBarChart("A", "B", "C", dataSet, PlotOrientation.HORIZONTAL, true, false, false);
         ChartPanel painel= new ChartPanel(graficoBarraHorizontal);
        add(painel);
        return graficoBarraHorizontal;
    }

}
