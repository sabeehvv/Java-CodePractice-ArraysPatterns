package menuDrivenProgram;

import java.util.Scanner;

public class MyClass extends Area {
	
	static Scanner input1=new Scanner(System.in);

	public static void main(String[] args) {
		
		MyClass obj1=new MyClass();
		System.out.println("Enter your choice : \n1. Circle \n2. Square \n3. Rectangle \n4. Triangle");
		int choice=input1.nextInt();
		switch(choice) {
		case 1:obj1.circle();break;
		case 2:obj1.square();break;
		case 3:obj1.rectangle();break;
		case 4:obj1.triangle();break;
		default :System.out.println("Enter the correct Number");
		}
		
		
		
		
	}
}
