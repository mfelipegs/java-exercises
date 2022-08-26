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
public class Dobro {
    private double numero;
    private double calculo;
    
    //constructor

    public Dobro() {
        this(0,0);
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }
    
    //encapsulamento

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    //methods
    public void calcularDobro() {
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        setNumero(e.nextDouble());
        setCalculo(numero * 2);
        System.out.println("Cálculo do dobro: " + getCalculo());
        
    }
    
    
    
}
