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

    private Date datum_rezervacije;

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

    public Date getVrijemeKreiranja() {
        return datum_rezervacije;
    }

    public void setVrijemeKreiranja(Date vrijemeKreiranja) {
        this.datum_rezervacije = vrijemeKreiranja;
    }

    public List<Rez_soba> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(List<Rez_soba> listaStavki) {
        this.listaStavki = listaStavki;
    }

    public Rez_soba dodavanjeStavke(Rez_soba stavka) {
        listaStavki.add(stavka);
        return stavka;
    }
    
    public void izracunIznosaRacuna() {
        ukupanIznos = 0;
        for (Rez_soba stavka: listaStavki){
            ukupanIznos+= stavka.getSoba().getCijena();
        }
    }
}
