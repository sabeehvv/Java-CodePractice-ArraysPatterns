import java.util.Scanner;

public class GradeAverage {
	
	public static void main(String ar[]) {
	
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the mark Scored by the students\n\nWritten Test\t=");
			float Written=s.nextInt();
			System.out.print("\nLab Exam\t=");
			float Lab=s.nextInt();
			System.out.print("\nAssingments\t=");
			float Assignments=s.nextInt();
			
			//written test counts 70%,  lab exams 20% and assignments 10%
			
			float OverallGrade=((Written*70)/100)+((Lab*20)/100)+((Assignments*10)/100);
			
			System.out.println("\nGrade of the student is\t="+OverallGrade);
		}
		
	}

}
