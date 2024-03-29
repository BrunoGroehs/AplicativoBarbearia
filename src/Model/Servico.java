/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Bruno Groehs
 */
public class Servico {
    protected static int contador = 0;
    private int id;
    private String descricao;
    private float valor;
    
    
    public Servico(String descricao, float valor) {
        this.id = ++contador;
        this.descricao = descricao;
        this.valor = valor;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
}
