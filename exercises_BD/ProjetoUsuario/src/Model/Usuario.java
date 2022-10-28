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
    private String login;
    private String senha;
    private String telefone;
    
    Conexao con = new Conexao();
   
    public Usuario() {
        this(0, "", "", "");
    }

    public Usuario(int codigo, String login, String senha, String telefone) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
   
    public void cadastrarUsuario(){           
      String sql= "INSERT INTO usuario(Codigo, Telefone,Login,Senha)VALUES "+
                "("+ this.getCodigo()+",'"+this.getTelefone()+"','"+this.getLogin()+
                "','"+ this.getSenha()+"' )";
      con.executeSQL(sql);
      JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
        
    public ResultSet consultar(){
       ResultSet tabela;
       tabela = null;
       String sql= "Select * from usuario";
       tabela = con.RetornarResultset(sql);
       return tabela; 
    }

    public void excluir(){
        String sql;
        sql= "DELETE FROM usuario WHERE Codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso...");
    }
    public void alterar(){
        String sql;
        sql="UPDATE usuario SET Telefone='"+ this.getTelefone()+"',Login='" + 
            this.getLogin()+"',Senha='"+this.getSenha()+"'WHERE Codigo=" + 
            this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso..."); 
    }
}
