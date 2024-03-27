/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDeDados;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Bruno Groehs
 */
public class Banco {
    
    private static Banco instancia = new Banco(); // Instância única do Banco (singleton)
    private ArrayList<Usuario> usuarios;
    private ArrayList<Cliente> clientes;
    private ArrayList<Servico> servicos;
    private ArrayList<Agendamento> agendamentos;
    
    // Construtor da classe Sistema
    public Banco() {
        usuarios = new ArrayList<>();
        clientes = new ArrayList<>();
        servicos = new ArrayList<>();
        agendamentos = new ArrayList<>();
        iniciaObjetos();
    }
    //usa esse metodo para retornar o banco sem precisar inicializar toda hora
    public static Banco getInstancia() {
        return instancia;
    }
    
    // Método para adicionar um usuário ao ArrayList de usuários
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    // Método para adicionar um cliente ao ArrayList de clientes
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }
    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }
    
    // Método para obter a lista de usuários
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    // Método para obter a lista de clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }
    public void imprimeClientes(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    
    
    
    public boolean verificaUsuarioNomeSenha(Usuario usuario) {
    for (Usuario u : usuarios) {
        if (u.getNome().equals(usuario.getNome()) && u.getSenha().equals(usuario.getSenha())) {
            return true;
        }
    }
    return false;
}
    public void iniciaObjetos(){
        // Adicionar usuários (isso pode ser feito aqui ou em outro momento)
        Usuario usuario = new Usuario("", "");
        
        Cliente cliente1 = new Cliente("12345-678", "cliente1@example.com", "João Silva");
        Cliente cliente2 = new Cliente("54321-876", "cliente2@example.com", "Maria Oliveira");
        Cliente cliente3 = new Cliente("98765-432", "cliente3@example.com", "Pedro Souza");
        Cliente cliente4 = new Cliente("13579-246", "cliente4@example.com", "Ana Santos");
        Cliente cliente5 = new Cliente("64237-951", "cliente5@example.com", "Luiza Pereira");
        Cliente cliente6 = new Cliente("24680-135", "cliente6@example.com", "Rafaela Costa");
        Cliente cliente7 = new Cliente("86420-975", "cliente7@example.com", "Lucas Ferreira");
        Cliente cliente8 = new Cliente("97531-864", "cliente8@example.com", "Mariana Almeida");
        Cliente cliente9 = new Cliente("36912-483", "cliente9@example.com", "Gustavo Lima");
        Cliente cliente10 = new Cliente("48369-123", "cliente10@example.com", "Carla Vieira");


        Servico servico1 = new Servico("Barba Simples", 30);
        Servico servico2 = new Servico("Barba Completa", 45);
        Servico servico3 = new Servico("Barba com Hot Towel", 50);
        Servico servico4 = new Servico("Penteado", 40);
        Servico servico5 = new Servico("Hidratação Capilar", 50);
        Servico servico6 = new Servico("Reflexologia", 60);
        Servico servico7 = new Servico("Limpeza de Pele", 70);
        Servico servico8 = new Servico("Design de Barba", 30);
        Servico servico9 = new Servico("Aplicação de Botox Capilar", 80);
        Servico servico10 = new Servico("Selagem Capilar", 100);


        Agendamento agendamento1 = new Agendamento(cliente1, servico1, 10, "13/03/2024 10:00");
        Agendamento agendamento2 = new Agendamento(cliente2, servico2, 15, "15/03/2024 15:30");
        Agendamento agendamento3 = new Agendamento(cliente3, servico3, 12, "17/03/2024 14:00");
        Agendamento agendamento4 = new Agendamento(cliente4, servico4, 11, "19/03/2024 11:30");
        Agendamento agendamento5 = new Agendamento(cliente5, servico5, 14, "21/03/2024 09:45");
        Agendamento agendamento6 = new Agendamento(cliente6, servico6, 16, "23/03/2024 16:15");
        Agendamento agendamento7 = new Agendamento(cliente7, servico7, 13, "25/03/2024 12:30");
        Agendamento agendamento8 = new Agendamento(cliente8, servico8, 10, "27/03/2024 11:00");
        Agendamento agendamento9 = new Agendamento(cliente9, servico9, 11, "29/03/2024 13:45");
        Agendamento agendamento10 = new Agendamento(cliente10, servico10, 15, "19/03/2024 15:00");
        Agendamento agendamento11 = new Agendamento(cliente1, servico1, 14, "02/04/2024 10:30");
        Agendamento agendamento12 = new Agendamento(cliente2, servico2, 16, "03/04/2024 14:45");
        Agendamento agendamento13 = new Agendamento(cliente3, servico3, 15, "05/04/2024 11:15");
        Agendamento agendamento14 = new Agendamento(cliente4, servico4, 13, "07/04/2024 09:00");
        Agendamento agendamento15 = new Agendamento(cliente5, servico5, 12, "09/04/2024 12:45");
        Agendamento agendamento16 = new Agendamento(cliente6, servico6, 11, "11/04/2024 16:30");
        Agendamento agendamento17 = new Agendamento(cliente7, servico7, 15, "13/04/2024 13:00");
        Agendamento agendamento18 = new Agendamento(cliente8, servico8, 16, "15/04/2024 11:30");
        Agendamento agendamento19 = new Agendamento(cliente9, servico9, 14, "17/04/2024 10:15");
        Agendamento agendamento20 = new Agendamento(cliente10, servico10, 13, "19/04/2024 15:45");


        
        adicionarUsuario(usuario);
        
        adicionarCliente(cliente1);
        adicionarCliente(cliente2);
        adicionarCliente(cliente3);
        adicionarCliente(cliente4);
        adicionarCliente(cliente5);
        adicionarCliente(cliente6);
        adicionarCliente(cliente7);
        adicionarCliente(cliente8);
        adicionarCliente(cliente9);
        
        adicionarServico(servico1);
        adicionarServico(servico2);
        adicionarServico(servico3);
        adicionarServico(servico4);
        adicionarServico(servico5);
        adicionarServico(servico6);
        adicionarServico(servico7);
        adicionarServico(servico8);
        adicionarServico(servico9);
        
        adicionarAgendamento(agendamento1);
        adicionarAgendamento(agendamento2);
        adicionarAgendamento(agendamento3);
        adicionarAgendamento(agendamento4);
        adicionarAgendamento(agendamento5);
        adicionarAgendamento(agendamento6);
        adicionarAgendamento(agendamento7);
        adicionarAgendamento(agendamento8);
        adicionarAgendamento(agendamento9);
        adicionarAgendamento(agendamento10);
        adicionarAgendamento(agendamento11);
        adicionarAgendamento(agendamento12);
        adicionarAgendamento(agendamento13);
        adicionarAgendamento(agendamento14);
        adicionarAgendamento(agendamento15);
        adicionarAgendamento(agendamento16);
        adicionarAgendamento(agendamento17);
        adicionarAgendamento(agendamento18);
        adicionarAgendamento(agendamento19);
        adicionarAgendamento(agendamento20);
        
        
    }
}
