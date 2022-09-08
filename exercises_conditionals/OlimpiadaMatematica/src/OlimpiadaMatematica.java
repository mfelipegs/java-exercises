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
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notamenor;
    private double notamaior;
    
    //constructor

    public OlimpiadaMatematica() {
        this("","", 0.0, 0.0, 0.0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notamenor, double notamaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notamenor = notamenor;
        this.notamaior = notamaior;
    }
    
    //encapsulation

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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotamenor() {
        return notamenor;
    }

    public void setNotamenor(double notamenor) {
        this.notamenor = notamenor;
    }

    public double getNotamaior() {
        return notamaior;
    }

    public void setNotamaior(double notamaior) {
        this.notamaior = notamaior;
    }
    
    Scanner e = new Scanner(System.in);
    //methods
    public void calcularMedia() {
        System.out.println("Digite a nota menor:");
        setNotamenor(e.nextDouble());
        System.out.println("Digite a nota maior:");
        setNotamaior(e.nextDouble());
        
        setMedia((getNotamaior() + getNotamenor())/2);
        
    }
    
    public void verificarMedia() {
        System.out.println("Digite o nome:");
        setNome(e.next());
        System.out.println("Digite o endereço:");
        setEndereco(e.next());
        
        if(getMedia() > 9) {
            System.out.println("Aluno inscrito");
            System.out.println("Nome: " + getNome());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Média: " + getMedia());
        }
        
        else {
            System.out.println("Média insuficiente.");
            System.out.println("Nome: " + getNome());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Média: " + getMedia());
        }
        
    }
    
}
