
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
public class Custos {
    private double totalPercurso;

    public Custos() {
        this(0.0);
    }

    public Custos(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
    
    public void calcularViagem(Percurso p) {
        this.totalPercurso = (p.getKmPercorrida() * p.getValorCombustivel()) + p.getValorPedagio();
        JOptionPane.showMessageDialog(null, "Total da viagem:" + this.totalPercurso);
    }
    
}
