/* menuc
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BancoDeDados.Banco;
import Helper.MenuHelper;
import Model.Agendamento;
import View.Agenda;
import View.CadastroCliente;
import View.CadastroServico;
import View.CadastroUsuario;
import View.MenuPrincipal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Bruno Groehs
 */
public class MenuPrincipalController {
    private Banco banco;
    private Agendamento agendamento;
    private final MenuPrincipal view;
    private final MenuHelper helper;
    
    public MenuPrincipalController(MenuPrincipal view) {
        this.banco = Banco.getInstancia();
        this.view = view;
        this.helper = new MenuHelper(view);
    }
    
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    public ArrayList<Agendamento> buscaClienteHoje(){
        
        ArrayList<Agendamento> agendamentos =  banco.getAgendamentos();
        ArrayList<Agendamento> agendamentosHoje = new ArrayList<>();
        
        //pega o dia de Hoje
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataHoje = hoje.format(formato);
        
        for (Agendamento agendamento1 : agendamentos) {
            System.out.println(agendamento1.getDiaData());
            
            if(agendamento1.getDiaData().equals(dataHoje)){
                System.out.println(agendamento1.getDiaData());
                agendamentosHoje.add(agendamento1);
            }
            else{}
        }
        imprimeArrayTeste(agendamentosHoje);
        return agendamentosHoje;
    }
    public void atualizaTabelaClienteHoje(){
        
        helper.preencherTabela(buscaClienteHoje());
    }
    
    public void imprimeArrayTeste(ArrayList<Agendamento> agend){
        for (Agendamento agendamento1 : agend) {
            System.out.println(agendamento1.getCliente().getNome());            
        }
    }

    public void navegarParaCriaCliente() {
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.setVisible(true);
    }

    public void navegarParaCriaServico() {
        CadastroServico cadastroServico = new CadastroServico();
        cadastroServico.setVisible(true);
    }

    public void navegarParaAddUsuario() {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.setVisible(true);
    }

    public MenuPrincipal getView() {
        return view;
    }
    
}
