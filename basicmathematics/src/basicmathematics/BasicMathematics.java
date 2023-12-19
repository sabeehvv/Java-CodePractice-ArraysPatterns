package basicmathematics;

import java.util.Scanner;

public class BasicMathematics {

	@SuppressWarnings("resource")
	public static void main(String ar[]) {
		Scanner num = new Scanner(System.in);
			System.out.println("Enter 2 numbers");
			
			Functions Object=new Functions();
			
			Object.num1=num.nextInt();
			Object.num2=num.nextInt();
			Functions.display();
			System.out.println("Select your choice \n1 :Addition \n2 :Substraction \n3 :Multiplication \n4 :Devision");
			
			int select=num.nextInt();
			switch(select){
			case 1:Object.Addition();break;
			case 2:Object.Substraction();break;
			case 3:Object.Multiplication();break;
			case 4:Object.Division();break;
			default :
			break;
			}

			Object.Display();
			
		}
		
}
