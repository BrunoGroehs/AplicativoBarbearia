/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Bruno Groehs
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;
    

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        textoUsuario1 = new javax.swing.JTextField();
        textoSenha1 = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        jBCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.gray);
        setIconImages(null);
        setLocationByPlatform(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        texto2.setForeground(new java.awt.Color(255, 255, 255));
        texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto2.setText("senha");
        texto2.setToolTipText("");
        texto2.setAlignmentY(0.0F);
        jPanel1.add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 170, -1, -1));

        texto3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        texto3.setForeground(new java.awt.Color(255, 255, 255));
        texto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto3.setText("LOGIN");
        texto3.setToolTipText("");
        texto3.setAlignmentY(0.0F);
        jPanel1.add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        texto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText("usuario");
        texto.setToolTipText("");
        texto.setAlignmentY(0.0F);
        jPanel1.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 96, -1, -1));

        textoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(textoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 124, 160, 28));

        textoSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSenha1ActionPerformed(evt);
            }
        });
        jPanel1.add(textoSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 198, 160, 28));

        botaoLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoLogin.setText("Entrar");
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });
        jPanel1.add(botaoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 105, 46));

        jBCadastro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jBCadastro.setText("Cadastre-se");
        jBCadastro.setBorder(null);
        jBCadastro.setBorderPainted(false);
        jBCadastro.setContentAreaFilled(false);
        jBCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(jBCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/FundoLogin.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 310, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario1ActionPerformed

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        // botao para logar com usuario e senha
        this.controller.entrarNoSistema();
        
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void textoSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSenha1ActionPerformed

    private void jBCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroActionPerformed
        // TODO add your handling code here:
        controller.cadastraUsuario();
    }//GEN-LAST:event_jBCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton jBCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JPasswordField textoSenha1;
    private javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTextoSenha1() {
        return textoSenha1;
    }

    public void setTextoSenha1(JPasswordField textoSenha1) {
        this.textoSenha1 = textoSenha1;
    }

    public JTextField getTextoUsuario1() {
        return textoUsuario1;
    }

    public void setTextoUsuario1(JTextField textoUsuario1) {
        this.textoUsuario1 = textoUsuario1;
    }

    
    
}
