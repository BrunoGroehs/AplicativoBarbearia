/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import BancoDeDados.Banco;
import Model.Usuario;
import View.CadastroUsuario;
import View.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Groehs
 */
public class CadastroHelper implements IHelper{
    
    private final CadastroUsuario view;
    private Banco banco;

    public CadastroHelper(CadastroUsuario view) {
        this.view = view;
        this.banco = Banco.getInstancia();
    }
    //estou pegando os dados do view e criando um usuario novo quando clica no botao cadastrar
    public void pegaUsuarioSenha() {
        
        String login = view.getjTextField1().getText();
        String senha1 = view.getjPasswordField1().getText();
        String senha2 = view.getjPasswordField2().getText();
        
        System.out.println(senha1);
        System.out.println(senha2);
        
        if(!(login.equals("")) && senha1.equals(senha2)){
            Usuario usuario = new Usuario(login,senha1);
            banco.adicionarUsuario(usuario);
            
            //abre o login e fecha o CadastroUsuario
            this.view.setVisible(false);
            
            Login loginView = new Login();
            loginView.setVisible(true);
        }
        else{JOptionPane.showMessageDialog(null, "Senhas diferentes!");}
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
