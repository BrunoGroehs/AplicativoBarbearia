/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ServicoController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bruno Groehs
 */
public class CadastroServico extends javax.swing.JFrame {
    private final ServicoController controller;
    /**
     * Creates new form CadastroServico
     */
    public CadastroServico() {
        initComponents();
        this.controller = new ServicoController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jValorCadastro = new javax.swing.JTextField();
        jservicoCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCadastraServico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jValorCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jValorCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValorCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jValorCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 200, 30));

        jservicoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jservicoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jservicoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Serviço:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, 40));

        jCadastraServico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCadastraServico.setText("Cadastrar");
        jCadastraServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastraServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastraServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/FundoLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 320, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastraServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastraServicoActionPerformed
        // TODO add your handling code here:
        controller.criaServico();
        setVisible(false);
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        
        
        
    }//GEN-LAST:event_jCadastraServicoActionPerformed

    private void jservicoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jservicoCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jservicoCadastroActionPerformed

    private void jValorCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValorCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jValorCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServico().setVisible(true);
            }
        });
    }

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JTextField getjValorCadastro() {
        return jValorCadastro;
    }

    public void setjValorCadastro(JTextField jValorCadastro) {
        this.jValorCadastro = jValorCadastro;
    }

    public JTextField getJservicoCadastro() {
        return jservicoCadastro;
    }

    public void setJservicoCadastro(JTextField jservicoCadastro) {
        this.jservicoCadastro = jservicoCadastro;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastraServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jValorCadastro;
    private javax.swing.JTextField jservicoCadastro;
    // End of variables declaration//GEN-END:variables
}
