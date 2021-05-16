package BMIcalculator;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		float x,y,z;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		x = input.nextFloat();
		System.out.println("Enter your height: ");
		y = input.nextFloat();
		z = (x / (y/100 * y/100));
		System.out.println("Your BMI is: "+z);
		
		if(z <= 18.5) 
		System.out.println("You are under weight..");	
		else if(z <= 24.9)
			System.out.println("You are healthy weight..");
		else if(z <= 29.9)
			System.out.println("You are over weight..");
		else
			System.out.println("You are obese...");
		
	
		input.close();
		

	}

}
