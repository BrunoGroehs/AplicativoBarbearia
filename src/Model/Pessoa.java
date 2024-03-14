/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno Groehs
 */
abstract public class Pessoa {
    protected static int contador = 0;
    protected int id;
    protected String nome;
    protected char sexo; 
    protected Date dataNascimento;
    protected String telefone;
    protected String email;
    protected String rg;

    public Pessoa(String nome) {
        this.id = ++contador;
        this.nome = nome;
    }

    public Pessoa(String nome, char sexo, String data, String telefone, String email, String rg) {
        this.id = ++contador;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }
    
}

