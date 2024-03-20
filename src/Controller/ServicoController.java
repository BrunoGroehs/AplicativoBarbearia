/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BancoDeDados.Banco;
import Helper.ServicoHelper;
import Model.Servico;
import View.Agenda;
import View.CadastroServico;

/**
 *
 * @author Bruno Groehs
 */
public class ServicoController {
    private final CadastroServico view;
    private ServicoHelper helper;
    private Banco banco;
    

    public ServicoController(CadastroServico view) {
        this.view = view;
        banco = Banco.getInstancia();
        helper = new ServicoHelper(view);
    }
    public void criaServico(){
        Servico servico = helper.obterModelo();
        
        if(servico != null){
            banco.adicionarServico(servico);
            this.view.exibeMensagem("Servico adicionado com Sucesso.");            
        }
        else{this.view.exibeMensagem("Servico não adicionado.");}
    }
    
}
