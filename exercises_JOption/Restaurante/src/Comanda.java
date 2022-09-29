
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
public class Comanda {
    private int mesa;
    private double valorConsumo;
    private double valorEstacionamento;
    private double valorCouvert;
    private double valorDescontoPromocional;
    private double valorTotal;

    public Comanda() {
        this(0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    public Comanda(int mesa, double valorConsumo, double valorEstacionamento, double valorCouvert, double valorDescontoPromocional, double valorTotal) {
        this.mesa = mesa;
        this.valorConsumo = valorConsumo;
        this.valorEstacionamento = valorEstacionamento;
        this.valorCouvert = valorCouvert;
        this.valorDescontoPromocional = valorDescontoPromocional;
        this.valorTotal = valorTotal;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public double getValorConsumo() {
        return valorConsumo;
    }

    public void setValorConsumo(double valorConsumo) {
        this.valorConsumo = valorConsumo;
    }

    public double getValorEstacionamento() {
        return valorEstacionamento;
    }

    public void setValorEstacionamento(double valorEstacionamento) {
        this.valorEstacionamento = valorEstacionamento;
    }

    public double getValorCouvert() {
        return valorCouvert;
    }

    public void setValorCouvert(double valorCouvert) {
        this.valorCouvert = valorCouvert;
    }

    public double getValorDescontoPromocional() {
        return valorDescontoPromocional;
    }

    public void setValorDescontoPromocional(double valorDescontoPromocional) {
        this.valorDescontoPromocional = valorDescontoPromocional;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void lancarGastos(){
        setMesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mesa: ")));
        setValorConsumo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor consumido: ")));
        setValorEstacionamento(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do estacionamento: ")));
        setValorCouvert(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do couvert")));
        setValorDescontoPromocional(0);
        setValorTotal(0);
    }
    
    public void verificarPromocao() {
        if(this.getValorConsumo()>100) { 
            this.setValorDescontoPromocional(this.valorConsumo*0.10);
            JOptionPane.showMessageDialog(null, "Há desconto");
        }
        else {
            JOptionPane.showMessageDialog(null, "Não há desconto disponível.");
        }
    }
    
    public void listarComanda(){
        JOptionPane.showMessageDialog(null, "Número da mesa: " + getMesa()
                                + "\nValor do consumo: " + getValorConsumo()
                                +"\nValor estacionamento:" + getValorEstacionamento()
                                +"\nValor couvert: " + getValorCouvert()
                                +"\nValor desconto promocional: "+ getValorDescontoPromocional()
                                +"\nValor total: " + getValorTotal());
    }
    
    public double totalizarComanda(){
        setValorTotal((getValorConsumo() + getValorEstacionamento() + getValorCouvert()) - getValorDescontoPromocional());
        return getValorTotal();
    }
    
}
