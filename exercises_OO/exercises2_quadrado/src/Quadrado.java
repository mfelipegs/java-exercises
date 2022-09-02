import java.util.Scanner;
public class Quadrado {
    private int numero;
    private int resultado;

    //constructor
    
    public Quadrado() {
        this(0,0);
    }

    public Quadrado(int numero, int resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }
    
    //encapsulamento

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void calcularQuadrado() {
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        setNumero(e.nextInt());
        setResultado(getNumero() * getNumero());
    }
    
    public String mostrarQuadrado() {
        return("O número " + getNumero() + 
               " ao quadrado é " + getResultado());
    }
    
}
