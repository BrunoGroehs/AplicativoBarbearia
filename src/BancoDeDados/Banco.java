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
        Usuario usuario1 = new Usuario("Manuela", "manuzinha");
        
        Cliente cliente1 = new Cliente("123456789", "João", "Silva");
        Cliente cliente2 = new Cliente("987654321", "Maria", "Santos");
        Cliente cliente3 = new Cliente("111222333", "Carlos", "Souza");
        Cliente cliente4 = new Cliente("444555666", "Ana", "Oliveira");
        Cliente cliente5 = new Cliente("777888999", "Pedro", "Ferreira");
        Cliente cliente6 = new Cliente("222333444", "Paula", "Ribeiro");
        Cliente cliente7 = new Cliente("555666777", "Fernando", "Gomes");
        Cliente cliente8 = new Cliente("888999000", "Laura", "Almeida");
        Cliente cliente9 = new Cliente("333444555", "Ricardo", "Cruz");
        Cliente cliente10 = new Cliente("666777888", "Mariana", "Martins");

        Servico servico1 = new Servico("Manicure", 30);
        Servico servico2 = new Servico("Pedicure", 45);
        Servico servico3 = new Servico("Corte de Cabelo", 60);
        Servico servico4 = new Servico("Coloração", 90);
        Servico servico5 = new Servico("Maquiagem", 45);
        Servico servico6 = new Servico("Depilação", 60);
        Servico servico7 = new Servico("Massagem Relaxante", 90);
        Servico servico8 = new Servico("Tratamento Facial", 60);
        Servico servico9 = new Servico("Escova Progressiva", 120);
        Servico servico10 = new Servico("Design de Sobrancelhas", 30);

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

        
        adicionarUsuario(usuario);
        adicionarUsuario(usuario1);
        
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
        
        
    }
}
