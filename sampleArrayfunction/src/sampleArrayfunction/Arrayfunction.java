package sampleArrayfunction;

import java.util.Scanner;

public class Arrayfunction {

	static int i,j;
	static int array[][]=new int [100][100];
	
	static void getArray(int size) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array values");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				array[i][j]=input.nextInt();
			}
		}
	}
	
	
	static void displayArray(int size) {
		System.out.println("Array elements are:\n");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(array[i][j]+"\t");
			}System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input2=new Scanner(System.in);
		System.out.println("Enter the size of array\n");
		int size=input2.nextInt();
		getArray(size);
		displayArray(size);
	}
}
