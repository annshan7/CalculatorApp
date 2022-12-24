package Calculator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//Calculator Calc = new Calculator();
		//Calc.displayHeader();
		
		
		//System.out.println("Calculator");
		int t;
		
		float a;
		float b;
		float result=0;
				
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Do you want to do addition/substraction/multiplication or divison");
		System.out.println("Enter 1 for Addition \n"+ "Enter 2 for Substraction \n"+"Enter 3 for Multiplication \n"+"Enter 4 for Divison\n");
		
		t = sc.nextInt();
		
		if( t <= 0 || t > 4) {
			
			System.out.println("Please enter correct number between 1 to 4");
		}
		else {
		
		    System.out.println("Enter the first number:");
			a= (float)sc.nextInt();
			
			System.out.println("Enter the second number:");
			b= (float)sc.nextInt();
			
			Calculator Calc = new Calculator();
			 switch(t)
			 {
			 case 1:
			    result= Calc.addCal(a,b);		 
			    break;
			 
			 case 2:
			    result= Calc.subCal(a,b);
				break;
			
			 case 3:
				result= Calc.mulCal(a,b);
			    break;   
			 case 4:
				result= Calc.divCal(a,b);
			    break;      
			 
			 default:
			        System.out.println("Unknown Number");
			 }
			 System.out.println("The Output =" +" " + result);
	
		}
		
	}

}


