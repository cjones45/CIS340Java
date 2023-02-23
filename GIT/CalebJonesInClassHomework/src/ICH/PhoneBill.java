//*************************************************************************** 
//*  
//* CIS 340                  Spring 2023                  Caleb Jones 
//*  
//*                     Programming Assignment: 
//*  
//* 				Class description (can be multiple lines) 
//*   		This is my Submission for the 
//*  
//*  
//*                         Date Created 
//*  						(**/**/2023)
//*                         File Name:  PhoneBill.java
//*  
//****************************************************************************	

package ICH;
import javax.swing.*;


public class PhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare all variables and constants
		int minutes = 0;
		String name = "";
		final double BASE_HOURLY_CHARGE = 19.99;
		final double BASE_CONTRACT_CHARGE = 16.95;
		String tempString;
		double output = 1;
		int people = 1;
		int mode;
		//User Inputs
		
		
		
		// Display input dialog box
		
		name = JOptionPane.showInputDialog(null,"Please enter your name");
		tempString = JOptionPane.showInputDialog("Please enter the minutes: ");
		minutes= Integer.parseInt(tempString);
		tempString = JOptionPane.showInputDialog("Please enter the number of participants (4 Maximum): ");
		people= Integer.parseInt(tempString);
		
		//Contract
		if(people >4 || people <1) {
			JOptionPane.showMessageDialog(null,"Invalid Input Homie. Im out.");
			System.exit(0);
		}
		if(people ==1) {
			mode = 0;
			//Hourly
			if(minutes <= 200) {
				output = BASE_HOURLY_CHARGE;
			}else if (minutes > 200 && minutes<=350) {
			output = BASE_HOURLY_CHARGE + (minutes -20)* 0.1;
			}else if(minutes>350) {
				output = BASE_HOURLY_CHARGE + (350-200)*0.1+ (minutes -350 )*.12;
				
			}
		}else {
			mode= 1;
			if(people ==1) {
				output = BASE_CONTRACT_CHARGE;
			}else if(people ==2) {
				output = BASE_CONTRACT_CHARGE + BASE_CONTRACT_CHARGE *0.5;
			}else if(people==3) {
				output = BASE_CONTRACT_CHARGE + BASE_CONTRACT_CHARGE *0.5 + BASE_CONTRACT_CHARGE *0.10;
				
			}else if(people ==4) {
				output = BASE_CONTRACT_CHARGE + BASE_CONTRACT_CHARGE *0.5 + BASE_CONTRACT_CHARGE *0.10 + BASE_CONTRACT_CHARGE *0.05;
			}
			
		}
		
		
		switch(mode) {
		
		case 0:
			JOptionPane.showMessageDialog(null,new JTextArea("ayo... "+ name + " \nYour bill is $" + String.format("%.2f", output) + "    \nThats what you get for using the hourly price"));
			break;
		case 1:
			JOptionPane.showMessageDialog(null,new JTextArea("ayo... "+ name + " \nYour bill is $" + String.format("%.2f", output) + "    \nThats what you get for using the contract plan"));
			break;
		
		}
	
			}
		

	}


