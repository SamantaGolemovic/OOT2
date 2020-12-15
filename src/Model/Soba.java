/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author veron
 */
public class Soba {
    public int sifra_sobe;
    public String broj_sobe;
    public double cijena;
    public TipSobe sifra_tipa;
    public boolean rezervirana;
    public boolean dozvoljeno_pusenje;
    public boolean dozvoljeni_ljubimci;

    public int getSifra_sobe() {
        return sifra_sobe;
    }

    public void setSifra_sobe(int sifra_sobe) {
        this.sifra_sobe = sifra_sobe;
    }

    public String getBroj_sobe() {
        return broj_sobe;
    }

    public void setBroj_sobe(String broj_sobe) {
        this.broj_sobe = broj_sobe;
    }

    

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public TipSobe getSifra_tipa() {
        return sifra_tipa;
    }

    public void setSifra_tipa(TipSobe sifra_tipa) {
        this.sifra_tipa = sifra_tipa;
    }

    public boolean isRezervirana() {
        return rezervirana;
    }

    public void setRezervirana(boolean rezervirana) {
        this.rezervirana = rezervirana;
    }

    public boolean isDozvoljeno_pusenje() {
        return dozvoljeno_pusenje;
    }

    public void setDozvoljeno_pusenje(boolean dozvoljeno_pusenje) {
        this.dozvoljeno_pusenje = dozvoljeno_pusenje;
    }

    public boolean isDozvoljeni_ljubimci() {
        return dozvoljeni_ljubimci;
    }

    public void setDozvoljeni_ljubimci(boolean dozvoljeni_ljubimci) {
        this.dozvoljeni_ljubimci = dozvoljeni_ljubimci;
    }

    
    
    
}
