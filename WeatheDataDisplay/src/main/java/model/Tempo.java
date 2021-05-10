package model;

import observer.IObservador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valquíria Anacleto
 */
public class Tempo {

    private ArrayList<IObservador> observadores;
    TempoCollection tempo = TempoCollection.getInstancia();
    private String data;
    private float temperatura;
    private float humidade;
    private float pressao;

    public Tempo(String data, float temperatura, float humidade, float pressao) {
        this.data = data;
        this.temperatura = temperatura;
        this.humidade = humidade;
        this.pressao = pressao;
    }

    public Tempo() {
    }

    public void setMedicao(String[] tempos) {
        data = tempos[0];
        temperatura = (Float.parseFloat(tempos[1]));
        humidade = (Float.parseFloat(tempos[2]));
        pressao = (Float.parseFloat(tempos[3]));

        tempo.adicionar(this);

    }

    public void setExcluirMedicao(String[] tempos) {
        data = tempos[0];
        temperatura = (Float.parseFloat(tempos[1]));
        humidade = (Float.parseFloat(tempos[2]));
        pressao = (Float.parseFloat(tempos[3]));

        tempo.remover(this);

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumidade() {
        return humidade;
    }

    public void setHumidade(float humidade) {
        this.humidade = humidade;
    }

    public float getPressao() {
        return pressao;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    public void medicaoAlterada() {

    }

    @Override
    public String toString() {
        return "Tempo{" + "observadores=" + observadores + ", data=" + data + ", temperatura=" + temperatura + ", humidade=" + humidade + ", pressao=" + pressao + '}';
    }

}
