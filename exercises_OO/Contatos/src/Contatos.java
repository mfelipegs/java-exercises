/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec_aluno
 */
import java.util.Scanner;
public class Contatos {
    //DECLARACAO DE ATRIBUTOS
    private String nome;
    private String endereco;
    private String cidade;
    private String telefone;
    
    //CONSTRUTOR
    public Contatos() {
        //"Inicie com valor vazio" (aspas porque é String, se fosse int, seria 0)
        this("","","","");
    }

    public Contatos(String nome, String endereco, String cidade, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
    }
    
    //ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //METODOS
    public void cadastrarDados() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        setNome(ent.next());
        System.out.println("Digite o endereço: ");
        setEndereco(ent.next());
        System.out.println("Digite o telefone: ");
        setTelefone(ent.next());
        System.out.println("Digite a cidade: ");
        setCidade(ent.next());
        
    }
    
    public void mostrarDados() {
        System.out.println("Nome: " + getNome()
                            + "\n Endereço: " + getEndereco()
                            + "\n Telefone: " + getTelefone()
                            + "\n Cidade: " + getCidade() );
    }
}
