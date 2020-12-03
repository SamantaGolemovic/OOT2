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
public class Zaposlenik {
    public int sifra_zaposlenika;
    public String ime_zaposlenika;
    public String prezime_zaposlenika;
    public String korisnicko_ime;
    public String lozinka;

    public int getSifra_zaposlenika() {
        return sifra_zaposlenika;
    }

    public void setSifra_zaposlenika(int sifra_zaposlenika) {
        this.sifra_zaposlenika = sifra_zaposlenika;
    }

    public String getIme_zaposlenika() {
        return ime_zaposlenika;
    }

    public void setIme_zaposlenika(String ime_zaposlenika) {
        this.ime_zaposlenika = ime_zaposlenika;
    }

    public String getPrezime_zaposlenika() {
        return prezime_zaposlenika;
    }

    public void setPrezime_zaposlenika(String prezime_zaposlenika) {
        this.prezime_zaposlenika = prezime_zaposlenika;
    }

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    
}
