//*************************************************************************** 
//*  
//* CIS 240                  Spring 2022                  Caleb Jones 
//*  
//*                         Program Assignment Exam1  
//*  
//* Class description (can be multiple lines) 
//*   This is my Submission for the coding portion of the exam
//*  
//*  
//*                         Date Created 
//*  						(2/16/2022)
//*                         File Name:  CalebJonesExam1 
//*  
//****************************************************************************
import java.util.Scanner;
public class CalebJonesExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number between 100 and 200:");
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt();
		int output;
		
		
		
		
			if(input < 100 || input > 200) {
				System.out.println("Your number is outside the program.");
				System.out.println("Exiting Program");
				System.exit(0);
			}else {
			output = input % 2 ;
			if(output == 0) {
				System.out.println("You entered " + input + " which is an even number.");
			}else {
				System.out.println("You entered " + input + " which is an odd number.");
			}
			}
		

	}

}
