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
public class Venda {
    private int codigo;
    private String nomeVendedor;
    private String produtoVendido;

    
    private Conexao con = new Conexao();

    public Venda() {
        this(0, "", "");
    }

    public Venda(int codigo, String nomeVendedor, String produtoVendido) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.produtoVendido = produtoVendido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }
    
    public void cadastrarVenda(){           
      String sql= "INSERT INTO ex3_Venda(codigo, nomeVendedor, produtoVendido) VALUES(" + this.getCodigo() + ", '" 
            + this.getNomeVendedor() + "', '" + this.getProdutoVendido() + "')";
      con.executeSQL(sql);
      JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
    
    public ResultSet listarVenda(){
       String sql= "Select * from ex3_Venda";
       ResultSet tabela = con.RetornarResultset(sql);
       return tabela; 
    }
    
    public void excluirVenda(){
        String sql;
        sql= "DELETE FROM ex3_Venda WHERE codigo = "+ this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
    }
    public void alterarVenda(){
        String sql;
        sql="UPDATE ex3_Venda SET nomeVendedor = '" + this.getNomeVendedor() 
            + "', produtoVendido = '" + this.getProdutoVendido() 
            + "' WHERE codigo = " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso"); 
    }

}
