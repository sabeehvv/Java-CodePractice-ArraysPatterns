package paternPrinting;

import java.util.Scanner;

public class Paternsample {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Limit");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=i;j<=num;j++) {
				System.out.print(" ");}
				for(int h=1;h<=i;h++) {
						System.out.print("*");}
				for(int h=1;h<i;h++) {
					System.out.print("*");}
			System.out.println();}}

}