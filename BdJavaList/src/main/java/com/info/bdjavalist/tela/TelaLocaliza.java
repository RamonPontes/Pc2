/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.info.bdjavalist.tela;

import com.info.bdjavalist.bd.Bd;
import com.info.bdjavalist.bd.BdAluno;
import com.info.bdjavalist.vo.Aluno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info2025
 */
public class TelaLocaliza extends javax.swing.JFrame {
    
    BdAluno bd;
    
    
    /**
     * Creates new form TelaLocaliza
     */
    public TelaLocaliza() {
        initComponents();
        bd = new BdAluno();
        preencheTabela();
    }
    
    private void preencheTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tLocaliza.getModel();
        int i = modelo.getRowCount();
        while (i-- > 0) {
            modelo.removeRow(i);
            }
        List<Aluno> lista = bd.pesquisa(tFiltro.getText());
        for (Aluno a : lista) {
        modelo.addRow(new Object[]{a.getId(), a.getNome(), a.getSerie(), a.getTurma()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tLocaliza = new javax.swing.JTable();
        tFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bFiltro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArquivo = new javax.swing.JMenu();
        mNovo = new javax.swing.JMenuItem();
        mAltera = new javax.swing.JMenuItem();
        mExclui = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        tLocaliza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Série", "Turma"
            }
        ));
        jScrollPane1.setViewportView(tLocaliza);

        jLabel1.setText("Filtro");

        bFiltro.setText("Ok");
        bFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltroActionPerformed(evt);
            }
        });

        mArquivo.setText("Arquivo");

        mNovo.setText("Novo");
        mNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNovoActionPerformed(evt);
            }
        });
        mArquivo.add(mNovo);

        mAltera.setText("Alterar");
        mAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlteraActionPerformed(evt);
            }
        });
        mArquivo.add(mAltera);

        mExclui.setText("Excluir");
        mExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mExcluiActionPerformed(evt);
            }
        });
        mArquivo.add(mExclui);

        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        mArquivo.add(mSair);

        jMenuBar1.add(mArquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFiltro)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltroActionPerformed
        preencheTabela();
    }//GEN-LAST:event_bFiltroActionPerformed

    private void mNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNovoActionPerformed
        TelaAluno t = new TelaAluno();
        t.setAluno(new Aluno());
        t.setVisible(true);
    }//GEN-LAST:event_mNovoActionPerformed

    private void mAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlteraActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tLocaliza.getModel();
        if (tLocaliza.getSelectedRow() != -1) {
            int id = (Integer) modelo.getValueAt(tLocaliza.getSelectedRow(), 0);
            TelaAluno t = new TelaAluno();
            t.setAluno(bd.localiza(id));
            t.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Não há nenhum aluno selecionado");
        }
    }//GEN-LAST:event_mAlteraActionPerformed

    private void mExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mExcluiActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tLocaliza.getModel();
        if (tLocaliza.getSelectedRow() != -1) {
            int id = (Integer) modelo.getValueAt(tLocaliza.getSelectedRow(), 0);
            bd.exclui(id);
            preencheTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Não há nenhum aluno selecionado");
        }
    }//GEN-LAST:event_mExcluiActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        preencheTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed
        Bd.fecha();
        this.dispose();
    }//GEN-LAST:event_mSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLocaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocaliza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mAltera;
    private javax.swing.JMenu mArquivo;
    private javax.swing.JMenuItem mExclui;
    private javax.swing.JMenuItem mNovo;
    private javax.swing.JMenuItem mSair;
    private javax.swing.JTextField tFiltro;
    private javax.swing.JTable tLocaliza;
    // End of variables declaration//GEN-END:variables
}
