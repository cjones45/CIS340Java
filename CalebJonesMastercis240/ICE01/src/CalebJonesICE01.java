//*************************************************************************** 
//*  
//* CIS 240                  Spring 2022                  Caleb Jones 
//*  
//*                         Program Assignment ICE01  
//*  
//* Class description (can be multiple lines) 
//*    A program that shows a water bill for 
//*  
//*  
//*                         Date Created 
//*  						(1/26/2022)
//*                         File Name:  CalebJonesICE01 
//*  
//****************************************************************************


import javax.swing.JOptionPane;

public class CalebJonesICE01 {

	public static void main(String[] args) { 
		final double BASE_CHARGE = 16.33;
		final double GALLON_RATE = 0.00253;
		 String tempString;
		 String customerName;
		 int customerNumber;
		 int gallons;
		 double waterBill;
		 
		// TODO Auto-generated method stub
		
		 
		
		
		 tempString = JOptionPane.showInputDialog("Enter customer number:");
		 customerNumber = Integer.parseInt(tempString);
		 
		 customerName = JOptionPane.showInputDialog("Enter customer name:");
		 
		 
		 
		 
		 tempString = JOptionPane.showInputDialog("Enter number of gallons");
		 gallons = Integer.parseInt(tempString);
		 
		 
	      
		 waterBill = BASE_CHARGE + gallons * GALLON_RATE;
		 String formatValue = String.format("%.2f", waterBill);
	      
	      
	      
	      JOptionPane.showMessageDialog(null,"WATER BILL: \n Customer Number: "+ customerNumber +"\n Customer Name: " + customerName 
	    		  +"\n Gallons: " + gallons + "\n Bill Value: $" + waterBill);
	   }
	
	}


