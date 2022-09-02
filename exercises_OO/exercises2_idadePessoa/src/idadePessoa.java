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
public class idadePessoa {
    private int ano;
    private int idade;
    
    //constructor

    public idadePessoa() {
        this(0,0);
    }

    public idadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }
    
    //encapsulamento

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //metodos
    public void calcularIdade() {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento:");
        setAno(e.nextInt());
        
        setIdade(2022 - getAno());
    }
    
    public String mostrarIdade() {
        return("A idade é de " + getIdade());
    }
    
}
