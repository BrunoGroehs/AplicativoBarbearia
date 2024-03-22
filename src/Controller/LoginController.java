package Controller;

import BancoDeDados.Banco;
import Helper.LoginHelper;
import Model.Usuario;
import View.CadastroUsuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    private Banco banco; // Referência ao banco de dados
    
    public LoginController(Login view) {
        this.view = view;
        this.banco = Banco.getInstancia(); // Obtém a instância única do banco de dados
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema() {
        // Lógica para entrar no sistema
        Usuario usu = helper.obterModelo();
        
        if(banco.verificaUsuarioNomeSenha(usu)){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }
        else{this.view.exibeMensagem("Usuario ou senha nao encontrados.");}
        
    }
    public void cadastraUsuario(){
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
        
    }
}
