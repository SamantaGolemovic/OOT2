/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Gost;
import Model.TipSobe;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Korisnik
 */
public class DBAdmin {

    public static int povecaj_sifru_gosta() {
        int id = 1;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            Statement stmt = conn.createStatement();
            String sql = "SELECT max(sifra_gosta) FROM Gost";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
            return id;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

    /**
     *
     * @param gost
     * @return
     */
    public static boolean spremanjeGosta(Gost gost) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            String sql = "INSERT INTO Gost(sifra_gosta,ime_gosta,prezime_gosta,br_mobitela,oib_gosta) VALUES (?,?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, gost.getSifra_gosta());
            stmt.setString(2, gost.getIme_gosta());
            stmt.setString(3, gost.getPrezime_gosta());
            stmt.setString(4, gost.getBr_mobitela());
            stmt.setString(5, gost.getOib_gosta());

            stmt.execute();
            conn.close();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean spremanjeTipaSobe(TipSobe tipSobe) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            String sql = "INSERT INTO Tip_sobe(opis_tipa_sobe) VALUES (?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tipSobe.getOpis_tipa_sobe());
            
            stmt.execute();
            conn.close();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
