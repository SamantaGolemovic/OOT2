/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author veron
 */
public class Rezervacija_soba_APP extends javax.swing.JFrame {

    PrijavaGostaView prijavaGostaView = new PrijavaGostaView(this,true);
    RezervacijaView rezervacijaView = new RezervacijaView(this,true);
    ZaposleniciView zaposleniciView = new ZaposleniciView(this,true);
    SobeView sobeView = new SobeView(this,true);
    PregledGostijuView pregledGostijuView = new PregledGostijuView(this,true);
    PregledRezervacijaView pregledRezervacijaView = new PregledRezervacijaView(this,true);
    TipSobeView tipSobeView = new TipSobeView(this,true);
    
    /**
     * Creates new form Rezervacija_soba_APP
     */
    public Rezervacija_soba_APP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bltPrijavaGosta = new javax.swing.JButton();
        btnRezervacija = new javax.swing.JButton();
        btnZaposlenici = new javax.swing.JButton();
        btnSobe = new javax.swing.JButton();
        btnPregledGostiju = new javax.swing.JButton();
        btnPregledRezervacija = new javax.swing.JButton();
        btnTipSobe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Glavni izbornik");

        bltPrijavaGosta.setText("Prijava gosta");
        bltPrijavaGosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bltPrijavaGostaActionPerformed(evt);
            }
        });

        btnRezervacija.setText("Rezervacija");
        btnRezervacija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezervacijaActionPerformed(evt);
            }
        });

        btnZaposlenici.setText("Zaposlenici");
        btnZaposlenici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZaposleniciActionPerformed(evt);
            }
        });

        btnSobe.setText("Sobe");
        btnSobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobeActionPerformed(evt);
            }
        });

        btnPregledGostiju.setText("Pregled gostiju");
        btnPregledGostiju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregledGostijuActionPerformed(evt);
            }
        });

        btnPregledRezervacija.setText("Pregled rezervacija");
        btnPregledRezervacija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregledRezervacijaActionPerformed(evt);
            }
        });

        btnTipSobe.setText("Tip soba");
        btnTipSobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipSobeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnPregledRezervacija)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnZaposlenici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bltPrijavaGosta, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btnTipSobe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPregledGostiju, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRezervacija, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btnSobe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRezervacija)
                    .addComponent(bltPrijavaGosta))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSobe)
                    .addComponent(btnTipSobe))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZaposlenici)
                    .addComponent(btnPregledGostiju))
                .addGap(76, 76, 76)
                .addComponent(btnPregledRezervacija)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bltPrijavaGostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bltPrijavaGostaActionPerformed
        prijavaGostaView.setVisible(true);
    }//GEN-LAST:event_bltPrijavaGostaActionPerformed

    private void btnZaposleniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZaposleniciActionPerformed
        zaposleniciView.setVisible(true);
    }//GEN-LAST:event_btnZaposleniciActionPerformed

    private void btnRezervacijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezervacijaActionPerformed
        rezervacijaView.setVisible(true);
    }//GEN-LAST:event_btnRezervacijaActionPerformed

    private void btnPregledGostijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregledGostijuActionPerformed
        pregledGostijuView.setVisible(true);
    }//GEN-LAST:event_btnPregledGostijuActionPerformed

    private void btnPregledRezervacijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregledRezervacijaActionPerformed
        pregledRezervacijaView.setVisible(true);
    }//GEN-LAST:event_btnPregledRezervacijaActionPerformed

    private void btnSobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobeActionPerformed
        sobeView.setVisible(true);
    }//GEN-LAST:event_btnSobeActionPerformed

    private void btnTipSobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipSobeActionPerformed
        tipSobeView.setVisible(true);
    }//GEN-LAST:event_btnTipSobeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rezervacija_soba_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rezervacija_soba_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rezervacija_soba_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rezervacija_soba_APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rezervacija_soba_APP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bltPrijavaGosta;
    private javax.swing.JButton btnPregledGostiju;
    private javax.swing.JButton btnPregledRezervacija;
    private javax.swing.JButton btnRezervacija;
    private javax.swing.JButton btnSobe;
    private javax.swing.JButton btnTipSobe;
    private javax.swing.JButton btnZaposlenici;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
