/*  helper
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Agendamento;
import View.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno Groehs
 */
public class MenuHelper implements IHelper{
    private final MenuPrincipal view;
    
    public MenuHelper(MenuPrincipal view){
        this.view = view;
    }
    
    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void preencherTabela(ArrayList<Agendamento> agendamentosHoje) {
        //pega a tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableClientesHoje().getModel();
        tableModel.setNumRows(0);
        //Percorrer a lista para adiciona no table
        for (Agendamento agendamento : agendamentosHoje) {
            tableModel.addRow(new Object[]{
                agendamento.getCliente().getNome(),
                agendamento.getHoraData(),
                agendamento.getServico(),
                agendamento.getValor(),
            });
        }
    }
    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
