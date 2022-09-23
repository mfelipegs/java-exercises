
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
public class Percurso {
    private double kmPercorrida;
    private double valorCombustivel;
    private double valorPedagio;

    
    public Percurso() {
        this(0.0,0.0,0.0);
    }

    public Percurso(double kmPercorrida, double valorCombustivel, double valorPedagio) {
        this.kmPercorrida = kmPercorrida;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    
    public void cadastrarPercurso() {
        setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem percorrida: ")));
        setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustível: ")));
        setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedágio: ")));
    }
    
    public void listarPercurso() {
         JOptionPane.showMessageDialog(null,"PERCURSO"
                 + "\nQuilometragem percorrida: " + getKmPercorrida()
                 + "\nValor do combustível: " + getValorCombustivel()
                 + "\nValor do pedágio: " + getValorPedagio()
         );
    }
    
    
}
