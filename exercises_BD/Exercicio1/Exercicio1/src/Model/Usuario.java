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
public class Usuario {
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String email;
    
    Conexao con = new Conexao();
    
    public Usuario() {
        this(0, "", "", "", "");
    }

    public Usuario(int codigo, String nome, String login, String senha, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrarUsuario(){           
      String sql= "INSERT INTO ex1_Usuario(nome, email, login, senha) VALUES('" + this.getNome() + "', '" 
            + this.getEmail() + "', '" + this.getLogin() + "', '" + this.getSenha() + "')";
      con.executeSQL(sql);
      JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
    
    public ResultSet consultar(){
       String sql= "Select * from ex1_Usuario";
       ResultSet tabela = con.RetornarResultset(sql);
       return tabela; 
    }
    
    public void excluir(){
        String sql;
        sql= "DELETE FROM ex1_Usuario WHERE codigo = "+ this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
    }
    public void alterar(){
        String sql;
        sql="UPDATE ex1_Usuario SET nome = '" + this.getNome() + "', email = '" + this.getEmail() 
            + "', login = '" + this.getLogin() + "', senha = '" + this.getSenha() 
            + "' WHERE codigo = " + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso"); 
    }
    
}
