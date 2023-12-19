package primeNumber;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String ar[]){
		Scanner num1=new Scanner(System.in);
		System.out.println("enter a number");
		int num=num1.nextInt();
		int i;
		int flag=0;
		for(i=2;i<num;i++){
			if(num%i==0){flag=1;
			}break;
		}
		if(flag==0) {
			System.out.println("entered number is prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
