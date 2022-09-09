
import javax.swing.JOptionPane;


public class Caixa {
    private double saldo;
    
    
    //dando valor aos construtores, pressione M2 -> inserir código -> constructor

    public Caixa() {
        this(0.0);
    }

    public Caixa(double saldo) {
        this.saldo = saldo;
    }
    
    //encapsular os atributos M2 -> inserir código -> getter e setter

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //methods da classe caixa, lembre-se: methods são public
    public void entrar() {
        double valor; //declaração de variável comum, não atributo
        //PARA LER UM VALOR, DEVE-SE CONVERTER PARA DOUBLE (Double.parseDouble)
        //PARA USAR A CAIXA DE LEITURA DE DADOS, USAMOS JoptionPane.showInputDialog
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Entrada R$ : "));
        setSaldo(getSaldo() + valor); //saldo considerado como 0, por causa do constructor this
    }
    
    public void retirar() {
        double valoret; //declaração de variável comum, não atributo
        //PARA LER UM VALOR, DEVE-SE CONVERTER PARA DOUBLE (Double.parseDouble)
        //PARA USAR A CAIXA DE LEITURA DE DADOS, USAMOS JoptionPane.showInputDialog
        valoret = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Retirada R$ : "));
        setSaldo(getSaldo() - valoret); //saldo considerado como 0, por causa do constructor this
    }
}
