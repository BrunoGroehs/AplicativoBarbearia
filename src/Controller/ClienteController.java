/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BancoDeDados.Banco;
import Helper.ClienteHelper;
import Helper.ServicoHelper;
import Model.Cliente;
import Model.Servico;
import View.CadastroCliente;

/**
 *
 * @author Bruno Groehs
 */
public class ClienteController {
    private final CadastroCliente view;
    private ClienteHelper helper;
    private Banco banco;

    public ClienteController(CadastroCliente view) {
        this.view = view;
        banco = Banco.getInstancia();
        helper = new ClienteHelper(view);
    }

    public void criaCliente() {
        Cliente cliente = helper.obterModelo();
        
        if(cliente != null){
            banco.adicionarCliente(cliente);
            this.view.exibeMensagem("Cliente adicionado com Sucesso.");            
        }
        else{this.view.exibeMensagem("Cliente não adicionado.");}
    }    
}
