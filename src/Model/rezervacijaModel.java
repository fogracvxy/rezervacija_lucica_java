/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Spuda
 */
public class rezervacijaModel {
    int slobodnaMjesta;
    int ukupnoMjesta;
    String datumDolaska;
    String datumOdlaska;

    public rezervacijaModel(int slobodnaMjesta, int ukupnoMjesta, String datumDolaska, String datumOdlaska) {
        this.slobodnaMjesta = slobodnaMjesta;
        this.ukupnoMjesta = ukupnoMjesta;
        this.datumDolaska = datumDolaska;
        this.datumOdlaska = datumOdlaska;
    }

    public int getSlobodnaMjesta() {
        return slobodnaMjesta;
    }

    public void setSlobodnaMjesta(int slobodnaMjesta) {
        this.slobodnaMjesta = slobodnaMjesta;
    }

    public int getUkupnoMjesta() {
        return ukupnoMjesta;
    }

    public void setUkupnoMjesta(int ukupnoMjesta) {
        this.ukupnoMjesta = ukupnoMjesta;
    }

    public String getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(String datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public String getDatumOdlaska() {
        return datumOdlaska;
    }

    public void setDatumOdlaska(String datumOdlaska) {
        this.datumOdlaska = datumOdlaska;
    }
    
}
