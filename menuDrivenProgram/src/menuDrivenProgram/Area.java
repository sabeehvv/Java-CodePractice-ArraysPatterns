package menuDrivenProgram;

import java.util.Scanner;

public class Area {

	Scanner input=new Scanner(System.in);
	
	void circle(){
		int radius;
		System.out.println("Enter the radius");
		radius=input.nextInt();
		float pi = (float) 3.14,area;
		area=pi*radius*radius;
		System.out.println("Area of the circle is :"+area);
	}
	
	void square() {
		int length;
		System.out.println("Enter the length");
		length=input.nextInt();
		int area=length*length;
		System.out.println("Area of the square is :"+area);
	}
	
	void rectangle() {
		int length,width;
		System.out.println("Enter the length");
		length=input.nextInt();
		System.out.println("Enter the width");
		width=input.nextInt();
		int area=width*length;
		System.out.println("Area of the rectangle is :"+area);
	}
	
	void triangle() {
		int base,hight;
		System.out.println("Enter the Base length");
		base=input.nextInt();
		System.out.println("Enter the Hight");
		hight=input.nextInt();
		float area=(float) (0.5*base*hight);
		System.out.println("Area of the triangle  is :"+area);
	}
}
