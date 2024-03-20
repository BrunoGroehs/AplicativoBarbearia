/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Cliente;
import View.CadastroCliente;

/**
 *
 * @author Bruno Groehs
 */
public class ClienteHelper implements IHelper{
    private final CadastroCliente view;

    public ClienteHelper(CadastroCliente view) {
        this.view = view;
    }

    @Override
    public Cliente obterModelo() {
        String nome = view.getjNomeCadastroCliente().getText();
        String telefone = view.getjTelefoneCadastroCliente().getText();
        String email = view.getjEmailCadastroCliente().getText();
        Cliente cliente = new Cliente(nome, telefone, email);
        return cliente;
    }

    @Override
    public void limparTela() {

    }
}