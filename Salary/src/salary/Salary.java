/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

/**
 *
 * @author fatec_aluno
 */
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double mw, qtdsal, es;

		System.out.println("Enter the minimum wage:");
		mw = e.nextDouble();
		System.out.println("Enter the employee salary:");
		es = e.nextDouble();
		
		qtdsal = es/mw;
		
		if(qtdsal <= 1) {
		System.out.println("The employee earns " + qtdsal + " minimum age.");
		}

		else {
			System.out.println("The employee earns " + qtdsal + " minimum ages.");
		}
	}

}
