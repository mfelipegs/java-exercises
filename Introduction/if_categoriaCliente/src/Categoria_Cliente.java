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
public class Categoria_Cliente {
    private String nome;
    private double numeroConta;
    private double saldoMedio;

    public Categoria_Cliente() {
        this("", 0.0, 0.0);
    }

    public Categoria_Cliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    //encapsulamento
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    //metodos
    public void verificaSaldo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        setNome(s.next());
        System.out.println("Digite o número da conta: ");
        setNumeroConta(s.nextDouble());
        System.out.println("Digite o saldo médio: ");
        setSaldoMedio(s.nextDouble());
        
        if(getSaldoMedio() < 100) {
            System.out.println("Cliente comum");
        }
        else if(getSaldoMedio() > 1000 && getSaldoMedio() <= 2500) {
            System.out.println("Cliente prata");
        }
        else {
            System.out.println("Cliente Ouro");
        }
        
    }
    
    
    
    
}
