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
