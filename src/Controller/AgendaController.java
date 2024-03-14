package Controller;

import BancoDeDados.Banco;
import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
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
        banco.adicionarAgendamento(helper.obterModelo());
        
        atualizaTabela();
        helper.limparTela();
        
    }
}
