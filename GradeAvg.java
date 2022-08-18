import java.util.Scanner;
public class GradeAvg {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		float n1, n2, n3, n4, n5, n6, avg1, avg2, sum;

		System.out.println("Enter the first grade: ");
		n1 = e.nextFloat();
		System.out.println("Enter the second grade: ");
		n2 = e.nextFloat();
		System.out.println("Enter the third grade: ");
		n3 = e.nextFloat();

		avg1 = (n1 + n2 + n3) / 3;
		
		System.out.println("Average of grades: " + avg1);

		System.out.println("Enter the 4th grade: ");
                n4 = e.nextFloat();
                System.out.println("Enter the 5th grade: ");
                n5 = e.nextFloat();
                System.out.println("Enter the 6th grade: ");
                n6 = e.nextFloat();
                
                avg2 = (n4 + n5 + n6) / 3;
		
		sum = (avg1 + avg2) / 2;

		System.out.println("Average of grades: " + avg2);
		System.out.println("Total average: " + sum);
	}
}
