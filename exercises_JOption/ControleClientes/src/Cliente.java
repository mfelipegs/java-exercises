
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
public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private double rendaMensal;
    private double limiteCredito;

    public Cliente() {
        this(0, "", "", "", 0.0, 0.0);
    }

    public Cliente(int id, String nome, String endereco, String email, double rendaMensal, double limiteCredito) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.rendaMensal = rendaMensal;
        this.limiteCredito = limiteCredito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    public void cadastrarCliente() {
        setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente: ")));
        setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        setEndereco(JOptionPane.showInputDialog("Digite o endereço do cliente: "));
        setEmail(JOptionPane.showInputDialog("Digite o e-mail do cliente: "));
        setRendaMensal(Double.parseDouble(JOptionPane.showInputDialog("Digite"
                + " a renda mensal do cliente: ")));
    }
    
    public void listarCliente() {
        JOptionPane.showMessageDialog(null,"CLIENTE"
                + "\nID: " + getId()
                + "\nNome: " + getNome()
                + "\nEndereço: " + getEndereco()
                + "\nEmail: " + getEmail()
                + "\nRenda mensal: " + getRendaMensal()
                );
    }
    
    public void calcularLimiteCredito() {
        setLimiteCredito(getRendaMensal()*0.40);
        JOptionPane.showMessageDialog(null,"Limite de crédito do cliente: " + getLimiteCredito());
    }
    
    
}

