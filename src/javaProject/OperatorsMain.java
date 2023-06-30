package javaProject;

public class OperatorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate the Class
				ArthimeticOperators ao = new ArthimeticOperators();
				
				// Assign Value to Variables
				ao.num1 = 7.12;
				ao.num2 = 5;
				
				//Invoke the Methods 
				
				ao.addTwoNumbers();
				ao.subtractTwoNumbers();
				ao.multiplyTwoNumbers();
				ao.divideTwoNumbers();
				
				System.out.println("\n");
				
				ao.incrementTheNumber();
				ao.decrementTheNumber();
				
				ao.calculateYearAfter5Years();
				ao.checkTheMultiplyOperator();
				
				System.out.println("\n");
				
				//Reassigning the Values
				System.out.println("Reassigning the values ");
				ao.num1 = 21.82;
				ao.num2 = 59;
				
				ao.addTwoNumbers();
				ao.subtractTwoNumbers();
				ao.multiplyTwoNumbers();
				ao.divideTwoNumbers();
				
				
			}

	}
