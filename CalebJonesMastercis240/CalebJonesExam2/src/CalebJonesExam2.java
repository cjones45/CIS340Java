//*************************************************************************** 
//*  
//* CIS 240                  Spring 2022                  Caleb Jones 
//*  
//*                         Program Assignment Exam2  
//*  
//* Class description (can be multiple lines) 
//*   This is my Submission for the coding portion of the exam
//*  
//*  
//*                         Date Created 
//*  						(3/9/2022)
//*                         File Name:  CalebJonesExam2 
//*  
//****************************************************************************
import javax.swing.JOptionPane;


public class CalebJonesExam2 {

	public static void main(String[] args) {
		int input;
		boolean inputFinished = false;
		String tempString;
		int countEven=0;
		int countOdd=0;
		int max = 1;
		int min = 0;
	// TODO Auto-generated method stub


		while(inputFinished == false) {
			tempString = JOptionPane.showInputDialog("Please enter a number: ");
			input= Integer.parseInt(tempString);
		
			if(input > 0) {
				if(input > max) {
					max = input;
				}
				if(min > input) {
					min = input;
				}
				 if(isOdd(input)==true) {
					 countOdd = countOdd + 1;
				 }else {
					 countEven = countEven + 1;
				 }
				 
				}else if(input <=0) {
					inputFinished = true;
				// other forms of input validation
				}else if((double)input > 0|| (double)input > 0){
					JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.",
					      "Invalid Input", JOptionPane.ERROR_MESSAGE);
				}

	}
		if(min == 0) {
			min = 1;
		}
		JOptionPane.showMessageDialog(null,"You picked " + countEven + " even numbers, and " + countOdd + " odd numbers! \n "
				+ "Your maximum entry was " + max + " Your minimum entry was " + min);
	}
	public static boolean isOdd(int input) {
		int testNum = input % 2;
		if(testNum == 1) {
			return true;
		 }else {
			 return false;
		 }
	}
}
	


