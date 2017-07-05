
package com.assignment1_3;
/*
 * This class will produce the difference between bitwise and logical AND
 */
import java.util.Scanner;
public class CompareBitwiseLogicalAnd {			//This class will produce the difference between bitwise and logical AND
	public static void main(String[] args) {
		
		
		System.out.println("Enter the first input for bitwise AND and Logical AND (00,01,10,11) : ");	//Asking user to give the input
		Scanner byteFi=new Scanner(System.in);	//taking input from the user
		byte bitwiseAnd1=byteFi.nextByte();		//storing input in the variable
	
		
		System.out.println("Enter the second input for bitwise AND and Logical AND (00,01,10,11) Operation: ");	//Asking user to give the input
		Scanner byteSi=new Scanner(System.in);	//taking input from the user
		byte bitwiseAnd2=byteSi.nextByte();		//storing input in the variable
		
		
		System.out.println("Enter the first input for Logical AND (true/false): ");		//Asking user to give the input
		Scanner boolfi=new Scanner(System.in);	//taking input from the user
		boolean boolIn1=boolfi.nextBoolean();	//storing input in the variable
		
		System.out.println("Enter the second input for Logical AND (true/false): ");	//Asking user to give the input
		Scanner boolsi=new Scanner(System.in);	//taking input from the user
		boolean boolIn2=boolsi.nextBoolean();	//storing input in the variable
		
		byteSi.close();						//closing the Scanner
		byteFi.close();						//closing the Scanner
		boolfi.close();						//closing the Scanner
		boolsi.close();						//closing the Scanner
		
		int bitwiseAnd= bitwiseAnd1 & bitwiseAnd2;										// the logic for bitwise AND operation.
		System.out.println("Value of Bitwise AND operation between binaryNum1 and binaryNum2 is: "+bitwiseAnd); //output for bitwise AND operation		
		
		boolean logicalAnd=boolIn1 & boolIn2; // logic for logical AND operation.
		System.out.println("Value of Logical AND operation between Two Boolean inputs: "+logicalAnd); 			//output for logical AND operation
	
	}

}
