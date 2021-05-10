/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import model.Tempo;
import org.jfree.data.category.DefaultCategoryDataset;
import view.TelaInicialView;

/**
 *
 * @author Valquíria Anacleto
 */
public  abstract class Grafico extends Componente {
   
    public String titulo;
     public float tamanho;
    DefaultCategoryDataset categoriaDataSet;
   
    private Tempo tempo;
    TelaInicialView tela;

    
               /* Componente grafico = new Grafico(dataSet) 

                    grafico  = new TituloEixoY(" ", grafico);
                
*/public Grafico(DefaultCategoryDataset categoriaDataSet) {
    
    }

    
    
    

       
    

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    
  
    
   

   

  


    
    
}
