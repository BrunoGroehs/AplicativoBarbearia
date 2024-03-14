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
}
