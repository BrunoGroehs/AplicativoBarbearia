/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;



/**
 *
 * @author Bruno Groehs
 */
public class Agendamento {
    protected static int contador = 0;
    protected int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(Cliente cliente, Servico servico, float valor, String date) {
        this.id = ++contador;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
           
        try {
            this.data = (Date) new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Agendamento(Cliente cliente, Servico servico, float valor, String data, String observacao) {
        this(cliente,servico,valor,data);
        this.id = ++contador;
        this.observacao = observacao;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Agendamento.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    public String getHoraData() {
        return new SimpleDateFormat("HH:mm").format(data);
    }
    public String getDiaData() {
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
