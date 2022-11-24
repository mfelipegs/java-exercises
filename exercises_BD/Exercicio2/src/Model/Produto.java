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
public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;

    
    private Conexao con = new Conexao();

    public Produto() {
        this(0, "", "");
    }

    public Produto(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto(){           
      String sql= "INSERT INTO ex2_Produto(codigo, nomeProduto, descricao) VALUES(" + this.getCodigo() + ", '" 
            + this.getNomeProduto() + "', '" + this.getDescricao() + "')";
      con.executeSQL(sql);
      JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
    
    public ResultSet consultar(){
       String sql= "Select * from ex2_Produto";
       ResultSet tabela = con.RetornarResultset(sql);
       return tabela; 
    }
    
    public void excluir(){
        String sql;
        sql= "DELETE FROM ex2_Produto WHERE codigo = "+ this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
    }
    public void alterar(){
        String sql;
        sql="UPDATE ex2_Produto SET nomeProduto = '" + this.getNomeProduto() 
            + "', descricao = '" + this.getDescricao() 
            + "' WHERE codigo = " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso"); 
    }
}
