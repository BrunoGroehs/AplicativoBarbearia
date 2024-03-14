package Controller;

import BancoDeDados.Banco;
import Controller.Helper.LoginHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
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
        
        // Adicionar usuários (isso pode ser feito aqui ou em outro momento)
        Usuario usuario = new Usuario("", "");
        
        Cliente cliente1 = new Cliente("123456789", "João", "Silva");
        Cliente cliente2 = new Cliente("987654321", "Maria", "Santos");
        Cliente cliente3 = new Cliente("111222333", "Carlos", "Souza");
        Cliente cliente4 = new Cliente("444555666", "Ana", "Oliveira");
        Cliente cliente5 = new Cliente("777888999", "Pedro", "Ferreira");
        Cliente cliente6 = new Cliente("222333444", "Paula", "Ribeiro");
        Cliente cliente7 = new Cliente("555666777", "Fernando", "Gomes");
        Cliente cliente8 = new Cliente("888999000", "Laura", "Almeida");
        Cliente cliente9 = new Cliente("333444555", "Ricardo", "Cruz");
        Cliente cliente10 = new Cliente("666777888", "Mariana", "Martins");

        Servico servico1 = new Servico(1, "Manicure", 30);
        Servico servico2 = new Servico(2, "Pedicure", 45);
        Servico servico3 = new Servico(3, "Corte de Cabelo", 60);
        Servico servico4 = new Servico(4, "Coloração", 90);
        Servico servico5 = new Servico(5, "Maquiagem", 45);
        Servico servico6 = new Servico(6, "Depilação", 60);
        Servico servico7 = new Servico(7, "Massagem Relaxante", 90);
        Servico servico8 = new Servico(8, "Tratamento Facial", 60);
        Servico servico9 = new Servico(9, "Escova Progressiva", 120);
        Servico servico10 = new Servico(10, "Design de Sobrancelhas", 30);

        Agendamento agendamento1 = new Agendamento(cliente1, servico1, 10, "13/03/2024 10:00");
        Agendamento agendamento2 = new Agendamento(cliente2, servico2, 15, "15/03/2024 15:30");
        Agendamento agendamento3 = new Agendamento(cliente3, servico3, 12, "17/03/2024 14:00");
        Agendamento agendamento4 = new Agendamento(cliente4, servico4, 11, "19/03/2024 11:30");
        Agendamento agendamento5 = new Agendamento(cliente5, servico5, 14, "21/03/2024 09:45");
        Agendamento agendamento6 = new Agendamento(cliente6, servico6, 16, "23/03/2024 16:15");
        Agendamento agendamento7 = new Agendamento(cliente7, servico7, 13, "25/03/2024 12:30");
        Agendamento agendamento8 = new Agendamento(cliente8, servico8, 10, "27/03/2024 11:00");
        Agendamento agendamento9 = new Agendamento(cliente9, servico9, 11, "29/03/2024 13:45");
        Agendamento agendamento10 = new Agendamento(cliente10, servico10, 15, "31/03/2024 15:00");

        
        banco.adicionarUsuario(usuario);
        
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);
        banco.adicionarCliente(cliente4);
        banco.adicionarCliente(cliente5);
        banco.adicionarCliente(cliente6);
        banco.adicionarCliente(cliente7);
        banco.adicionarCliente(cliente8);
        banco.adicionarCliente(cliente9);
        
        banco.adicionarServico(servico1);
        banco.adicionarServico(servico2);
        banco.adicionarServico(servico3);
        banco.adicionarServico(servico4);
        banco.adicionarServico(servico5);
        banco.adicionarServico(servico6);
        banco.adicionarServico(servico7);
        banco.adicionarServico(servico8);
        banco.adicionarServico(servico9);
        
        banco.adicionarAgendamento(agendamento1);
        banco.adicionarAgendamento(agendamento2);
        banco.adicionarAgendamento(agendamento3);
        banco.adicionarAgendamento(agendamento4);
        banco.adicionarAgendamento(agendamento5);
        banco.adicionarAgendamento(agendamento6);
        banco.adicionarAgendamento(agendamento7);
        banco.adicionarAgendamento(agendamento8);
        banco.adicionarAgendamento(agendamento9);
        banco.adicionarAgendamento(agendamento10);
        
        
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
}
