package javaProject;

public class ArthimeticOperators {
	
	//Declare variables
		 double num1;
		 int num2;
		
		//Create Methods
		 
		 void addTwoNumbers() {
			 double sum = num1+num2;
			 System.out.println("Sum of two numbers is " +sum);
		 }
		 
		 void subtractTwoNumbers() {
			 double diff = num1-num2;
			 System.out.println("Difference of two numbers is " +diff);
		 }
		 
		 void multiplyTwoNumbers() {
			 double product = num1*num2;
			 System.out.println("Product of two numbers is " +product);
		 }
		 
		 void divideTwoNumbers() {
			 double quotient = num1/num2;
			 double remainder =num1%num2;
			 System.out.println("Quotient of "+num1+ " and " +num2 + " is " +quotient);
			 System.out.println("Remainder of "+num1+ " and " +num2 + " is " +remainder);
		 }
		 
		 void incrementTheNumber() {
			 int i=10;
			 i++;
			 System.out.println("The increment of number is " +i);
		 }
		 
		 void decrementTheNumber() {
			 int i=18;
			 i--;
			 System.out.println("The increment of number is " +i);
		 }
		 
		 void calculateYearAfter5Years() {
			 int Year = 2023;
			 Year+=5;
			 System.out.println("Year after 5 years will be " +Year);
		 }
		 
		 void checkTheMultiplyOperator() {
			 int x = 20;
			 x*=5;
			 System.out.println("Product of X will be " +x);
		 }


}
