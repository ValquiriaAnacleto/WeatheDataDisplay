/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javax.swing.JFrame;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Valquíria Anacleto
 */
public abstract class Componente extends JFrame {
    
      
       
        public abstract JFreeChart plotar() ;
}
