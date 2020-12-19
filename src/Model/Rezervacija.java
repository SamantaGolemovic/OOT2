/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author veron
 */
public class Rezervacija {
    public int sifra_rezervacije;
    
    private double ukupanIznos;

    private Date datum_dolaska;
    
    private Date datum_odlaska;

    private List<Rez_soba> listaStavki = new ArrayList<Rez_soba>();

    public int getSifra_rezervacije() {
        return sifra_rezervacije;
    }

    public void setSifra_rezervacije(int sifra_rezervacije) {
        this.sifra_rezervacije = sifra_rezervacije;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public List<Rez_soba> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(List<Rez_soba> listaStavki) {
        this.listaStavki = listaStavki;
    }

    public Rez_soba dodavanjeRezSobe(Rez_soba rez_soba) {
        listaStavki.add(rez_soba);
        return rez_soba;
    }
    
    public void izracunIznosaRacuna() {
        ukupanIznos = 0;
        for (Rez_soba rez_soba: listaStavki){
            ukupanIznos+= rez_soba.getSoba().getCijena();
        }
    }

    public Date getDatum_dolaska() {
        return datum_dolaska;
    }

    public void setDatum_dolaska(Date datum_dolaska) {
        this.datum_dolaska = datum_dolaska;
    }

    public Date getDatum_odlaska() {
        return datum_odlaska;
    }

    public void setDatum_odlaska(Date datum_odlaska) {
        this.datum_odlaska = datum_odlaska;
    }
    
    
}
