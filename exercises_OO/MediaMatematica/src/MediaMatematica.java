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
public class MediaMatematica {
    private double numero1;
    private double numero2;
    private double media;
    private String nome;
    
    //constructor

    public MediaMatematica() {
    this(0,0,0,"");
    }

    public MediaMatematica(double numero1, double numero2, double media, String nome) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.media = media;
        this.nome = nome;
    }
    
    //encapsulation

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //methods
    public void calcularMedia() {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        setNome(e.next());
        System.out.println("Digite a nota 1: ");
        setNumero1(e.nextDouble());
        System.out.println("Digite a nota 2: ");
        setNumero2(e.nextDouble());
        
        setMedia((getNumero1() + getNumero2())/2);
        
        System.out.println("Aluno: " + getNome()
                        + "\n Media: " + getMedia());
    }
    
}
