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
public class Multiplicacao {
    private int valor;
    private int resultado;
    
    //constructor

    public Multiplicacao() {
        this(0,0);
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }
    
    //encapsulamento

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplicacao4() {
        //faz a liberação de entrada de dados utilizando o nome ent
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        setValor(ent.nextInt());
        setResultado(getValor() * 4);
    }
    
    //metodo com retorno String
    public String mostrarMultiplicacao() {
        return("A multiplicação do valor " + getValor() + 
               " x 4 = " + getResultado());
    }
    
    //metodo sem retorno
    public void mostrarMultiplicacaoV() {
        System.out.println("A multiplicação do valor " + getValor() + 
               " x 4 = " + getResultado());
    }
}
