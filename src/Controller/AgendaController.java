package Controller;

import BancoDeDados.Banco;
import EnviaEmail.EnviaEmail;
import Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import View.CadastroCliente;
import View.CadastroServico;
import View.MenuPrincipal;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bruno Groehs
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;
    private Banco banco;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
        this.banco = Banco.getInstancia();
    }
    public void atualizaAll(){
        atualizaCliente();
        atualizaServico();
        atualizaTabela();
        atualizaValor();
    }
    public void limpaAll(){
        helper.limpaTabela();
        helper.limpaBoxCliente();
        helper.limpaBoxServicos();
    }
        //buscar lista do array e colocar na tabela.    
    public void atualizaTabela(){
        ArrayList<Agendamento> agendamentos = banco.getAgendamentos();
        //exibir a lista na view;
        helper.preencherTabela(agendamentos);
    }
    /*busca clientes no banco de dados para o box*/
    public void atualizaCliente(){
        ArrayList<Cliente> clientes = banco.getClientes();
        helper.preencheBoxCliente(clientes);
    }
    public void atualizaServico(){
        ArrayList<Servico> servicos = banco.getServicos();
        helper.preencheBoxServicos(servicos);
    }
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarServico(servico.getValor());
    }
    public void agendar(){
        EnviaEmail enviaE = new EnviaEmail();
        if(helper.obterModelo() != null){
            Agendamento agendamento = helper.obterModelo();
            
            banco.adicionarAgendamento(agendamento);
            enviaE.enviaEmailCompleto(agendamento.getCliente().getNome(), agendamento.getHoraData(), agendamento.getDiaData(), agendamento.getServico(), agendamento.getObservacao());
            
        }
        
        
        atualizaTabela();
        helper.limparTela();
    }
    public void navegaParaCadastroCliente(){
        CadastroCliente cadastroCliente = new CadastroCliente();
        view.setVisible(false);
        cadastroCliente.setVisible(true);
    }
    public void navegaParaCadastroServico(){
        CadastroServico cadastroServico = new CadastroServico();
        view.setVisible(false);
        cadastroServico.setVisible(true);
    }

}