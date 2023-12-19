package incomeTax;

import java.util.Scanner;

public class IncomeTax {
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the annual income\t=");
			float income=s.nextInt();
			

//Annual Income Tax percentage, 
//Up to 2.5 Lakhs = No Tax
//Above 2.5 Lakhs to 5 Lakhs = 5%
//Above 5 Lakhs to 10 Lakhs = 20%
//Above 10 Lakhs to 50 Lakhs = 30%


			int Tax = 0;
			float PersonalTax;
			if(income<=250000) {
				Tax=1;
			}
			else if(income<=500000) {
				Tax=2;
			}
			else if(income<=1000000) {
				Tax=3;
			}
			else if(income<=5000000) {
				Tax=4;
			}
			
			switch(Tax) {
			case 1:System.out.println("Income tax amount\t=NILL");
			break;
			case 2:PersonalTax=(income*5)/100;
			System.out.println("Income tax amount\t="+PersonalTax);
			break;
			case 3:PersonalTax=(income*20)/100;
			System.out.println("Income tax amount\t="+PersonalTax);
			break;
			case 4:PersonalTax=(income*30)/100;
			System.out.println("Income tax amount\t="+PersonalTax);
			break;
			default :System.out.println("Not defined");
			}

}}}
