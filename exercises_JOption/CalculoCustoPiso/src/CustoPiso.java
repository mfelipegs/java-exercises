
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
public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoporArea;
    private double custoTotalComodo;

    public CustoPiso() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoporArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoporArea = precoporArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoporArea() {
        return precoporArea;
    }

    public void setPrecoporArea(double precoporArea) {
        this.precoporArea = precoporArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores() {
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite"
                + " o comprimento do cômodo, em metros: ")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite"
                + " a largura do cômodo: ")));
        setPrecoporArea(Double.parseDouble(JOptionPane.showInputDialog("Digite"
                + " o preço por área: ")));
    }
    
    public void calcularPrecoArea() {
        setCustoTotalComodo(getComprimentoComodo() * getLarguraComodo() * getPrecoporArea());
    }
    
    public void mostrarValores() {
        JOptionPane.showMessageDialog(null,"VALORES DE CUSTO DO PISO"
                 + "\nComprimento do cômodo: " + getComprimentoComodo()
                 + "\nLargura: " + getLarguraComodo()
                 + "\nPreço por área: " + getPrecoporArea()
                 + "\nCUSTO TOTAL DO CÔMODO: " + getCustoTotalComodo()
         );
    }
    
    
}
