/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec_aluno
 */
public class Cliente {
    private int codigoCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String emailCliente;

    Conexao con = new Conexao();
    
    public Cliente() {
        this(0, "", "", "");
    }

    public Cliente(int codigoCliente, String nomeCliente, String telefoneCliente, String emailCliente) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    //METODO CADASTRAR OS DADOS
    public void cadastrar() {
        String sql;
        sql = "INSERT INTO Clientes(codigoCliente, nomeCliente, telefoneCliente, emailCliente) "
                + "VALUES( " + this.getCodigoCliente() + " ,'" + this.getNomeCliente() + "', '" + this.getTelefoneCliente() + "', '" + this.getEmailCliente() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Gravado com Sucesso...");
    }
    
    //METODO CONSULTAR DADOS, com retorno
    public ResultSet consultar() {
        ResultSet tabela;
        tabela = null;
        
        String sql = "SELECT * FROM Clientes";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
}
