/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author Bruno Groehs
 */
public class LoginHelper implements IHelper{
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Usuario obterModelo(){
        String usuario = view.getTextoUsuario1().getText();// Obtém o texto do campo de usuário
        String senha = new String(view.getTextoSenha1().getPassword()); // Obtém o texto do campo de senha
        
        Usuario modelo = new Usuario(usuario, senha);
        return modelo;
    }
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextoSenha1().setText(senha);
        view.getTextoUsuario1().setText(nome);   
    }
    public void limpaText(){
        view.getTextoUsuario1().setText("");
        view.getTextoSenha1().setText("");
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
