//*************************************************************************** 
//*  
//* CIS 240                  Spring 2022                  Caleb Jones 
//*  
//*                         Program Assignment ICE02  
//*  
//* Class description (can be multiple lines) 
//*   This class is my submission for the in class exercise. 
//*   This program takes information from the user to calculate a water bill.
//*  
//*  
//*                         Date Created 
//*  						(2/02/2022)
//*                         File Name:  CalebJonesICE02 
//*  
//****************************************************************************

import javax.swing.JOptionPane;

public class CalebJonesICE02 {

	public static void main(String[] args) {
		
		//Declare variables for the program
		final double BASE_CHARGE = 16.33;
		final double GALLON_RATE = 0.00253;
		 String tempString;
		 String customerName;
		 int customerNumber;
		 int gallons;
		 double waterBill;
		 
	
		 //Get Customer Number
		 tempString = JOptionPane.showInputDialog("Enter customer number:");
		 customerNumber = Integer.parseInt(tempString);
		 
		 //Get Customer Name
		 
		 customerName = JOptionPane.showInputDialog("Enter customer name:");
		 
		 //Get amount of gallons used
		 
		 tempString = JOptionPane.showInputDialog("Enter number of gallons");
		 gallons = Integer.parseInt(tempString);
		 
		 //calculate final water bill and format it to dollars
	      
		 waterBill = BASE_CHARGE + gallons * GALLON_RATE;
		 String formatValue = String.format("%.2f", waterBill);
	      
	      
	      //display output message with all data
		 
	      JOptionPane.showMessageDialog(null,"WATER BILL: \n Customer Number: "+ customerNumber +"\n Customer Name: " + customerName 
	    		  +"\n Gallons: " + gallons + "\n Bill Value: $" + formatValues);

	}

}
