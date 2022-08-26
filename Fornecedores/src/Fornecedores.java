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
public class Fornecedores {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;
    
    //constructor

    public Fornecedores() {
    this("","","");
    }

    public Fornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }
    
    //encapsulamento

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    //methods
    public void cadastrarFornecedor() {
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite o nome do fornecedor: ");
        setNomeFornecedor(e.next());
        System.out.println("Digite o nome do produto: ");
        setNomeProduto(e.next());
        System.out.println("Digite a descrição do produto: ");
        setDescricaoProduto(e.next());
    }
    
    public void listarFornecedor() {
        System.out.println("Fornecedor: " + getNomeFornecedor()
                            + "\n Nome do produto: " + getNomeProduto()
                            + "\n Descrição do produto: " + getDescricaoProduto() );
    }
    
}
