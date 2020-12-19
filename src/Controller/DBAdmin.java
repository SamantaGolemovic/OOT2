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
import Model.Soba;
import Model.TipSobe;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class DBAdmin {

    /**
     *
     * @param gost
     * @return
     */
    public static boolean spremanjeGosta(Gost gost) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            String sql = "INSERT INTO Gost(ime_gosta,prezime_gosta,br_mobitela,oib_gosta) VALUES (?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, gost.getIme_gosta());
            stmt.setString(2, gost.getPrezime_gosta());
            stmt.setString(3, gost.getBr_mobitela());
            stmt.setString(4, gost.getOib_gosta());

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

    public static List getListaTipovaSoba() {
        try {
            List lista = new ArrayList<TipSobe>();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Tip_sobe";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int sifra = rs.getInt(1);
                String opis = rs.getString(2);

                TipSobe tipSobe = new TipSobe();
                tipSobe.setSifra_tipa_sobe(sifra);
                tipSobe.setOpis_tipa_sobe(opis);
                lista.add(tipSobe);
            }
            return lista;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean azuriranjeKategorije(TipSobe tipSobe) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr:3306/sgolemovic", "sgolemovic", "11");
            int sifra = tipSobe.getSifra_tipa_sobe();
            String opis = tipSobe.getOpis_tipa_sobe();

            String sql = "Update Tip_sobe SET opis_tipa_sobe='" + opis + "' where sifra_tipa=" + sifra + ";";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

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

    public static int dohvatiSifruTipa(String tip) {
        int sifra = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            Statement stmt = conn.createStatement();

            String sql = "SELECT sifra_tipa FROM Tip_sobe where opis_tipa_sobe='" + tip + "';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                sifra = rs.getInt(1);

            }

            return sifra;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static boolean spremanjeSobe(Soba soba) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr:3306/sgolemovic", "sgolemovic", "11");
            String sql = "INSERT INTO Soba(broj_sobe,cijena_sobe,sifra_tipa,rezervirana,pusenje,ljubimci) VALUES (?,?,?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, soba.getBroj_sobe());
            stmt.setDouble(2, soba.getCijena());
            stmt.setInt(3, soba.getSifra_tipa().getSifra_tipa_sobe());
            stmt.setBoolean(4, soba.isRezervirana());
            stmt.setBoolean(5, soba.isDozvoljeno_pusenje());
            stmt.setBoolean(6, soba.isDozvoljeni_ljubimci());

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

    public static List getListaSoba() {
        try {
            List lista = new ArrayList<Soba>();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            String sql = "SELECT * FROM Soba";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                int sifraSobe = rs.getInt(1);
                String brojSobe = rs.getString(2);
                Double cijena = rs.getDouble(3);
                int sifraTipaSobe = rs.getInt(4);
                boolean rezervirana = rs.getBoolean(5);
                boolean pusenje = rs.getBoolean(6);
                boolean ljubimci = rs.getBoolean(7);

                TipSobe tipSobe = new TipSobe();
                String sql2 = "SELECT opis_tipa_sobe FROM Tip_sobe WHERE sifra_tipa=" + sifraTipaSobe + ";";
                ResultSet rs2 = stmt2.executeQuery(sql2);
                while (rs2.next()) {
                    String opisTipaSobe = rs2.getString(1);

                    tipSobe.setSifra_tipa_sobe(sifraTipaSobe);
                    tipSobe.setOpis_tipa_sobe(opisTipaSobe);

                }

                Soba soba = new Soba();
                soba.setSifra_sobe(sifraSobe);
                soba.setBroj_sobe(brojSobe);
                soba.setCijena(cijena);
                soba.setSifra_tipa(tipSobe);
                soba.setRezervirana(rezervirana);
                soba.setDozvoljeno_pusenje(pusenje);
                soba.setDozvoljeni_ljubimci(ljubimci);

                lista.add(soba);

            }
            return lista;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static TipSobe getTipSobe(String nazivTipaSobe) {
        try {
            TipSobe tipSobe = new TipSobe();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic", "sgolemovic", "11");
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM Tip_sobe where opis_tipa_sobe='" + nazivTipaSobe + "';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                int sifra = rs.getInt(1);

                tipSobe.setSifra_tipa_sobe(sifra);
                tipSobe.setOpis_tipa_sobe(nazivTipaSobe);

            }

            return tipSobe;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public static boolean azuriranjeSobe(Soba soba) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr:3306/sgolemovic", "sgolemovic", "11");
            int sifraSobe = soba.getSifra_sobe();
            String brojSobe = soba.getBroj_sobe();
            Double cijena = soba.getCijena();
            int tipSobe = soba.getSifra_tipa().getSifra_tipa_sobe();
            boolean ljubimci = soba.isDozvoljeni_ljubimci();
            boolean pusenje = soba.isDozvoljeno_pusenje();
            boolean rezervirana = soba.isRezervirana();

            int pusenje2 = 0, ljubimci2 = 0, rezervirana2 = 0;

            if (pusenje == true) {
                pusenje2 = 1;
            } else if (pusenje != true) {
                pusenje2 = 0;
            }
            if (ljubimci == true) {
                ljubimci2 = 1;
            } else if (ljubimci != true) {
                ljubimci2 = 0;
            }
            if (rezervirana == true) {
                rezervirana2 = 1;
            } else if (rezervirana != true) {
                rezervirana2 = 0;
            }

            String sql = "Update Soba SET broj_sobe=" + brojSobe + ", cijena_sobe=" + cijena + ",sifra_tipa="
                    + tipSobe + ", rezervirana=" + rezervirana2 + ", pusenje=" + pusenje2 + ", ljubimci="
                    + ljubimci2 + " where sifra_sobe=" + sifraSobe + ";";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

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

    public static List getListaGostiju() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr:3306/sgolemovic", "sgolemovic", "11");
            List lista = new ArrayList<Gost>();
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            String sql = "SELECT * FROM Gost";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                int sifra = rs.getInt(1);
                String ime = rs.getString(2);
                String prezime = rs.getString(3);
                String brMoba = rs.getString(4);
                String OIB = rs.getString(5);

                Gost gost = new Gost();
                gost.setSifra_gosta(sifra);
                gost.setIme_gosta(ime);
                gost.setPrezime_gosta(prezime);
                gost.setBr_mobitela(brMoba);
                gost.setOib_gosta(OIB);

                lista.add(gost);

            }
            return lista;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
