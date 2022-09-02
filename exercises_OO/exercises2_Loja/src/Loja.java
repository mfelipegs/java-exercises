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
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;
    
    //constructor

    public Loja() {
        this("","",0,0,0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }
    
    //encapsulamento

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    //metodos
    public void inserirDadosLoja() {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite a razão social da loja:");
        setRazaoSocial(e.next());
        
        System.out.println("Digite o CPF do cliente:");
        setCpfCliente(e.next());
        
        System.out.println("Digite o valor da compra:");
        setValorCompra(e.nextDouble());
        
        System.out.println("Digite a quantidade de itens da compra:");
        setQtdItensComp(e.nextDouble());
        
        
    }
    
    public double calcularCompraLoja() {
        setValorTotalCompra(getValorCompra() * getQtdItensComp());
        
        return getValorTotalCompra();
    }
    
    public String mostrarDadosLoja() {
        return("Razão social: " + getRazaoSocial()
                + "\nCPF do cliente: " + getCpfCliente()
                + "\nValor: R$" + getValorCompra()
                + "\nQuantidade de itens comprados: " + getQtdItensComp()
                + "\nVALOR TOTAL: R$" + getValorTotalCompra());
    }
    
}
