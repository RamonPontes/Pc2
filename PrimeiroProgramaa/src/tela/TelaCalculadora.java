/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

import vo.Calculadora;

/**
 *
 * @author info2025
 */
public class TelaCalculadora extends javax.swing.JFrame {
    Calculadora calculadoa = new Calculadora();
    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
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
        tNumero1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tNumero2 = new javax.swing.JTextField();
        bSoma = new javax.swing.JButton();
        lResultado = new javax.swing.JLabel();
        bSubtrai = new javax.swing.JButton();
        bDivide = new javax.swing.JButton();
        bMultiplica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite o 1º número: ");

        tNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumero1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite o 2º número: ");

        tNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumero2ActionPerformed(evt);
            }
        });

        bSoma.setText("Somar");
        bSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSomaActionPerformed(evt);
            }
        });

        bSubtrai.setText("Subtrai");
        bSubtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubtraiActionPerformed(evt);
            }
        });

        bDivide.setText("Dividi");
        bDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivideActionPerformed(evt);
            }
        });

        bMultiplica.setText("Multiplica");
        bMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSubtrai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDivide)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMultiplica))
                    .addComponent(lResultado))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSoma)
                    .addComponent(bSubtrai)
                    .addComponent(bDivide)
                    .addComponent(bMultiplica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lResultado)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumero1ActionPerformed

    private void tNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumero2ActionPerformed

    private void bSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSomaActionPerformed
        calculadoa.setNumero1(Float.parseFloat(tNumero1.getText()));
        calculadoa.setNumero2(Float.parseFloat(tNumero2.getText()));
        
        calculadoa.soma();
        
        lResultado.setText(Float.toString(calculadoa.getResultado()));
    }//GEN-LAST:event_bSomaActionPerformed

    private void bSubtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubtraiActionPerformed
        calculadoa.setNumero1(Float.parseFloat(tNumero1.getText()));
        calculadoa.setNumero2(Float.parseFloat(tNumero2.getText()));
        
        calculadoa.subtracao();
        
        lResultado.setText(Float.toString(calculadoa.getResultado()));
    }//GEN-LAST:event_bSubtraiActionPerformed

    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivideActionPerformed
        calculadoa.setNumero1(Float.parseFloat(tNumero1.getText()));
        calculadoa.setNumero2(Float.parseFloat(tNumero2.getText()));
        
        calculadoa.divisao();
        
        lResultado.setText(Float.toString(calculadoa.getResultado()));
    }//GEN-LAST:event_bDivideActionPerformed

    private void bMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplicaActionPerformed
        calculadoa.setNumero1(Float.parseFloat(tNumero1.getText()));
        calculadoa.setNumero2(Float.parseFloat(tNumero2.getText()));
        
        calculadoa.multiplicacao();
        
        lResultado.setText(Float.toString(calculadoa.getResultado()));
    }//GEN-LAST:event_bMultiplicaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDivide;
    private javax.swing.JButton bMultiplica;
    private javax.swing.JButton bSoma;
    private javax.swing.JButton bSubtrai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lResultado;
    private javax.swing.JTextField tNumero1;
    private javax.swing.JTextField tNumero2;
    // End of variables declaration//GEN-END:variables
}
