package wk4;
import java.io.FileNotFoundException;
import java.io.*;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

// In Class Programming Practice 
// Created by Dr. Abdunabi

public class PhoneBill {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Declare variables 
		int minutes = 0, custType = 0, noOfParticipants = 0, noOfCustomers = 0, custId=0;
		String name = "", custTypeStr = ""; 
		String output="Phone Bills:" +
				"\nRate" + "\tNumber" + "\tName" + "\tMinutes" + "\tParticipants" + "\tbill";
		double bill = 0;
			
		final double BASE_Go_CHARGE = 19.99;
		final double BASE_CONTRACT_CHARGE = 16.95;
		
		// Declare arrays
		String[] custInfoArr;
		double[] billArr;
		
		 // Input the number of customers
		int choice = 0;
		
		while (choice == JOptionPane.YES_OPTION) {
		try { 
			noOfCustomers =
		 Integer.parseInt(JOptionPane.showInputDialog("Input Nunmber of Customers"));
		  
		  if (noOfCustomers < 1) 
			   throw new NumberFormatException();
		  
		 choice = 1;  
		} catch (NumberFormatException ex) { 
			
			JOptionPane.showMessageDialog(null,"Invalid number of Customer Input?");
			choice = JOptionPane.showConfirmDialog(null, "Would You Like to Continue!");
			
			if (choice !=0)
				System.exit(0);
		  }// end try-catch
		}// end while
		
		// Create 2 arrays of size "noOfCustomers"
		custInfoArr = new String[noOfCustomers];
		billArr = new double[noOfCustomers];
		
		// read customer data and compute the bill for "numOfCustomers"
		for (int i =0; i < noOfCustomers; i++ ) {
			
			// Input customer id
			while(true) {							
			try {
			String custIdStr = JOptionPane.showInputDialog("Input Customer ID");
			
			if (custIdStr.length()!=6)
				throw new NumberFormatException();
			
			custId = Integer.parseInt(custIdStr); 
			
			break;
			
			} catch (NumberFormatException ex) {
				   JOptionPane.showMessageDialog(null, "Invalid Cust ID Input Format?");
				 
			} // end try-catch
			}// end while
			
							
		// Input customer name
		while(true) {
		name = JOptionPane.showInputDialog("Input Name");
		if (name.isEmpty()) 
			JOptionPane.showMessageDialog(null, "Invalid Input Format");
		else 
			break;
		
		}// end while
		
				
		// Input the customer type
		while (true) {
		try {
		custType = Integer.parseInt(JOptionPane.showInputDialog("Input Customer Type:" +
		  "\n0 - Go Bill" + "\n1 - Contract Bill"));
		
		if ( (custType != 0) && (custType != 1))
			throw new NumberFormatException();
		
		break;
		
		} catch (NumberFormatException ex) {
			   JOptionPane.showMessageDialog(null, "Invalid Input Format?");
			   
		} // end try-catch
		}// end while
		
			
		
		switch (custType) {
		case 0: // Go Bill - Input customer minutes
			    custTypeStr = "Go Bill";
			    //reset number of participants
			    noOfParticipants = 0;
			    while (true) {
			    try {
				String minStr = JOptionPane.showInputDialog("Input Minutes");
				minutes = Integer.parseInt(minStr);
				
				if (minutes < 0)
					throw new NumberFormatException();
				
				break;
				
				} catch (NumberFormatException ex) {
				   JOptionPane.showMessageDialog(null, "Invalid Input Format?");
				  
				 } // end try-catch
			    }// end while
				
				if (minutes < 200)
					bill = BASE_Go_CHARGE;
				else if ( (minutes >= 200) && (minutes < 350))
					bill = BASE_Go_CHARGE + (minutes - 200) * 0.1;
				else
					bill = BASE_Go_CHARGE + (350 - 200) * 0.1 
					+ (minutes - 350) * .12; 
				 
				// add value to array at index i
				break;
		
		case 1: // Contract Bill - Input number of participants 
			custTypeStr = "Contract Bill";
			// reset minutes
			minutes = 0;
			while (true) {
			try {
				
				String noStr = JOptionPane.showInputDialog("Input Number of Participants:");
				noOfParticipants = Integer.parseInt(noStr);
				
				if ( (noOfParticipants > 4) || (noOfParticipants < 1 ) ) 
						 throw new  NumberFormatException();
				
				break;
				} catch (NumberFormatException ex) {
				   JOptionPane.showMessageDialog(null, "Invalid Input Format?");
				  
				 }// end try-catch
			}// end while	
							
				if (noOfParticipants == 1)
					bill = BASE_CONTRACT_CHARGE;
				else if (noOfParticipants == 2)
					bill = BASE_CONTRACT_CHARGE + (BASE_CONTRACT_CHARGE * 0.05);
				else if (noOfParticipants == 3)
					bill = BASE_CONTRACT_CHARGE + (BASE_CONTRACT_CHARGE * 0.05) +
							(BASE_CONTRACT_CHARGE * 0.1); 
				else 
					bill = BASE_CONTRACT_CHARGE + (BASE_CONTRACT_CHARGE * 0.05) +
					(BASE_CONTRACT_CHARGE * 0.1) + (BASE_CONTRACT_CHARGE * 0.15); 	
				
				   break;
				
		}// end of switch
		
		// fill the arrays with data at index i
		custInfoArr[i] = "\n" + custTypeStr + "\t" + custId + "\t" + name +
				"\t" + minutes + "\t" + noOfParticipants + "\t"; 
		billArr[i] = bill;
	}// for
		
		// // program output before sorting
		// Update the output with the customer info array and fill it with customer data
		output+="\nBefore Sorting:";
		for (int i = 0; i< billArr.length; i++)
			output+=custInfoArr[i] + String.format("%.2f", billArr[i]);
		
		// program output before sorting
		JOptionPane.showMessageDialog(null, new JTextArea(output));	
				
				
		// Sorting both arrays using the selection sort based on bill value
		
		
		
		
       // program output after sorting
	   // Create customer info array and fill it with customer data
	    output+="\nAfter Sorting:";
		for (int i = 0; i< billArr.length; i++)
				output+=custInfoArr[i] + String.format("%.2f", billArr[i]);
		// program output after sorting
		JOptionPane.showMessageDialog(null, new JTextArea(output));
			
		
	   
		// write data to file	
         // create a file object
		
	 	 // Create a PrintWriter to write data to a file
	    
	     // Write data to a file
	    
    	 // Close the file
	    
	    
	    // confirmation message
	    JOptionPane.showMessageDialog(null, "Comppleted writing data to file \'bills_output.txt\'");
	
	}// end of method main
} //end of class PhoneBill
