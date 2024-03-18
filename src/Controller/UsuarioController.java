/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BancoDeDados.Banco;
import Helper.CadastroHelper;
import View.CadastroUsuario;

/**
 *
 * @author Bruno Groehs
 */
public class UsuarioController {
    private final CadastroUsuario view;
    private CadastroHelper helper;
    private Banco banco;

    public UsuarioController(CadastroUsuario view) {
        this.view = view;
        this.banco = Banco.getInstancia();
        this.helper = new CadastroHelper(view);
    }
    public void criaUsuario(){
        helper.pegaUsuarioSenha();
    }
    
    
}
