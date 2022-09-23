
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec_aluno
 */
public class Produto {
    private int id;
    private String descricao;
    private int estoqueDisponivel;
    private double precoUnitario;

    public Produto() {
        this(0, "", 0, 0.0);
    }

    public Produto(int id, String descricao, int estoqueDisponivel, double precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.estoqueDisponivel = estoqueDisponivel;
        this.precoUnitario = precoUnitario;
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

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public void cadastrarProduto() {
         setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto: ")));
        setDescricao(JOptionPane.showInputDialog("Digite a descrição do produto: "));
        setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque disponível do produto: ")));
        setPrecoUnitario(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário do produto: ")));
    }
    
    public void listarProduto() {
        JOptionPane.showMessageDialog(null,"CLIENTE"
                 + "\nID: " + getId()
                 + "\nDescrição: " + getDescricao()
                 + "\nEstoque disponível: " + getEstoqueDisponivel()
                + "\nPreço unitário: " + getPrecoUnitario()
         );
    }
    
    public double pedido(int qtde) {
        
        return valorTotal;
    }
}
