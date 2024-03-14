/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno Groehs
 */
public class AgendaHelper implements  IHelper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        //pega a tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        //Percorrer a lista para adiciona no table
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDiaData(),
                agendamento.getHoraData(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencheBoxCliente(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJBoxClientes().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencheBoxServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJBoxServicos().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }    
    }
    public Cliente obterCliente() {
        return (Cliente)view.getJBoxClientes().getSelectedItem();
    }
    public Servico obterServico() {
        return (Servico)view.getJBoxServicos().getSelectedItem();
    }
    
    public void setarServico(float valor){
        view.getJTextCampoValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        float valor = Float.parseFloat(view.getjTextCampoValor().getText());
        String data = view.getjTextData().getText();
        String hora = view.getjTextHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getJTextCampoValor().setText("");
        view.getjTextData().setText("");
        view.getjTextHora().setText("");
        view.getjTextObservacao().setText("");
    }
    
    
    
}
