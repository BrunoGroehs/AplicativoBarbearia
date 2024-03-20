/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Servico;
import View.CadastroServico;

/**
 *
 * @author Bruno Groehs
 */
public class ServicoHelper implements IHelper{
    private final CadastroServico view;

    public ServicoHelper(CadastroServico view) {
        this.view = view;
    }

    @Override
    public Servico obterModelo() {
        String descricao = view.getJservicoCadastro().getText();
        float valor = Float.parseFloat(view.getjValorCadastro().getText());
        Servico servico = new Servico(descricao, valor);
        return servico;
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
