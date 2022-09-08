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
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;
    
    //constructor

    public Prova() {
        this("", 0.0, "");
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }
    
    //encapsulation

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    //methods
    public void nivelProva() {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o nome:");
        setNome(e.next());
        
        System.out.println("Digite os pontos:");
        setPontos(e.nextDouble());
        
        if(pontos <= 100) {
            setNivel("Nível 1");
        }
        
        else if((pontos > 100) && (pontos < 200)) {
            setNivel("Nível 2");
        }
        
        else {
            setNivel("Nível 3");
        }
    }
    
    public void listarResultado() {
        System.out.println("Nome: " + getNome() +
                "\nPontos: " + getPontos() + 
                "\nNível: " + getNivel());
    }
}
