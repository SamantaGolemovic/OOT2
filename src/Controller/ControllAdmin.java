/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Gost;

/**
 *
 * @author veron
 */
public class ControllAdmin {
    
    
    public String spremiGosta(Gost gost) {
        
        int id=DBAdmin.povecaj_sifru_gosta();
        gost.setSifra_gosta(id);
        
        if (DBAdmin.spremanjeGosta(gost)) {
            return "Gost je uspješno spremljen";
        } else {
            return "Gost nije spremljen";
        }
       
    }
    
}
