/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageindays;

/**
 *
 * @author fatec_aluno
 */
import java.util.Scanner;
public class AgeInDays {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int age, days;

		System.out.println("How old are you?");
		age = e.nextInt();

		days = age * 365;

		System.out.println("Your age in days: " + days);
	}
}
