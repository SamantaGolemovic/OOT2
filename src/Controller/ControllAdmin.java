/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Gost;
import Model.Soba;
import Model.TipSobe;
import java.util.List;

/**
 *
 * @author veron
 */
public class ControllAdmin {

    public String spremiGosta(Gost gost) {

        if (DBAdmin.spremanjeGosta(gost)) {
            return "Gost je uspješno spremljen";
        } else {
            return "Gost nije spremljen";
        }

    }

    public String spremiTipSobe(TipSobe tipSobe) {
        if (DBAdmin.spremanjeTipaSobe(tipSobe)) {
            return "Tip sobe je uspješno spremljen";
        } else {
            return "Tip sobe nije spremljen";
        }
    }

    public List dohvatiTipoveSoba() {
        return DBAdmin.getListaTipovaSoba();
    }

    public String azurirajTipSobe(TipSobe tipSobe) {
        if (DBAdmin.azuriranjeKategorije(tipSobe)) {
            return "Tip sobe je uspješno ažuriran!";
        } else {
            return "Tip sobe nije ažurirana!";
        }
    }

    public int pretraziTip(String tip) {
        return DBAdmin.dohvatiSifruTipa(tip);

    }

    public String spremiSobu(Soba soba) {

        if (DBAdmin.spremanjeSobe(soba)) {
            return "Soba je uspješno spremljena";
        } else {
            return "Soba nije spremljena";
        }
    }

    public List dohvatiSobe() {
        return DBAdmin.getListaSoba();
    }

    public TipSobe dohvatiTipSobe(String nazivTipaSobe) {
        return DBAdmin.getTipSobe(nazivTipaSobe);
    }

    public String azurirajSobu(Soba soba) {
        if (DBAdmin.azuriranjeSobe(soba)) {
            return "Soba je uspješno ažurirana!";
        } else {
            return "Soba nije ažurirana!";
        }
    }
    
    public List dohvatiGoste() {
        return DBAdmin.getListaGostiju();
    }
}
