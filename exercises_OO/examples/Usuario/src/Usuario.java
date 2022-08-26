/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec_aluno
 */
public class Usuario {
    //DECLARAR OS ATRIBUTOS
    private String nome;
    private String login;
    private String senha;
    
    //Construir os atributos para serem visualizados por outras classes
    //CRIANDO CONSTRUTOR E INICIALIZANDO OS ATRIBUTOS VAZIOS
    public Usuario() {
        //inicie com valor vazio, se fosse int seria 0
        this("","","");
    }

    //encapsulamento
    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
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
    
    //podia ser this.nome ali, pq ta na propria classe
    public void Mensagem() {
        System.out.println("Nome: " + getNome()
                + "\n Login: " + getLogin() 
                + "\n Senha: " + getSenha() );
    }
}
