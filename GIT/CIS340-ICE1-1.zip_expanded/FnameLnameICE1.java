package ICEs;

import javax.swing.JOptionPane;

public class FnameLnameICE1 {

	public static void main(String[] args) {
		
		// declare variables and constants
		int gallons = 0;
		double value = 0;
		String custName = null;
		int custNumber = 0;
		int custType=0;
		String output="WATER BILL";
		String tempString;
		
		// constants for single-family & duplex base charges
		final double BASE_CHARGE_SINGLE_FAMILY = 13.21 ;
		final double BASE_CHARGE_DUPLEX = 15.51  ;
		
		
		// input customer Rate/Type
		// To Complete: add input validation, and customer number must be 1 or 2 (done)
		try {
			custType=Integer.parseInt(
					JOptionPane.showInputDialog(null,"Enter Customer Rate: "
							+ "\n1-Single Family"
							+ "\n2-Duplex"));
			if(custType == 1 || custType == 2) {
				 System.out.println("works");
			 }else {
				 JOptionPane.showMessageDialog(null, "Invalid Customer Type. Exiting Program.",
					      "Invalid Input", JOptionPane.ERROR_MESSAGE);
				 System.exit(0);
			 }
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Invalid Customer Type. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
		}//end
				
		 
					
		
		
		// input customer number
		// To Complete: Add input validation, the number must be 6 digits	(done)
		try {
					custNumber=Integer.parseInt(
							JOptionPane.showInputDialog(null,"Enter customer number: "));
					 custNumber = Integer.parseInt(tempString);
					 if(custNumber >=100000 && custNumber <=999999) {
						 System.out.println("works");
					 }else {
						 JOptionPane.showMessageDialog(null, "Invalid Customer Number. Exiting Program.",
							      "Invalid Input", JOptionPane.ERROR_MESSAGE);
						 System.exit(0);
					 }
		}
		
			
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Invalid Customer Number. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		}//end
		
		// input customer name
		// To Complete: Add input validation, the name must not be empty (done)
		try {
			custName=JOptionPane.showInputDialog(null,"Enter customer name: ");
			 if(custName.length() >=1) {
				 System.out.println("Valid Input");
			 }else {
				 JOptionPane.showMessageDialog(null, "Invalid Customer Name. Exiting Program.",
					      "Invalid Input", JOptionPane.ERROR_MESSAGE);
				 System.exit(0);
			 }
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Invalid Customer Name. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		}
		
		
		
		// input number of gallons
		// To Complete: Add input validation, the number must not be below 0
		try {
			gallons=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of gallons: "));
			if(gallons >= 0) {
				 System.out.println("works");
			 }else {
				 JOptionPane.showMessageDialog(null, "Invalid Gallon Number. Exiting Program.",
					      "Invalid Input", JOptionPane.ERROR_MESSAGE);
				 System.exit(0);
			 }
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Invalid Gallon Number. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		}
		
		// compute customer bill
		
		
		switch (custType) {
		case 1: // To Complete: compute the water bill value for single-family
			if(gallons > 0 || gallons <= 7000) {
				output+= BASE_CHARGE_SINGLE_FAMILY + (7000 * .00204);
			}else if(gallons >= 7001 || gallons <= 13000){
				output+= BASE_CHARGE_SINGLE_FAMILY + ((gallons-7000)*0.00235);
			}else if(gallons >= 13001){
				output+= BASE_CHARGE_SINGLE_FAMILY +(gallons-13000) * 0.00270;;
			}
			
			
		
			//output+=" -Single-Type Rate:\n-----------------------------------\n";
			
				break;
		case 2: // To Complete: compute the water bill value for duplex
			if(gallons > 0 || gallons <= 9000) {
				output+= BASE_CHARGE_DUPLEX + 9000 *  0.00197;
			}else if(gallons >= 9001 || gallons <= 13000){
				output+= (gallons-9000)*0.00226;
			}else if(gallons >= 13001){
				output+= (gallons-13000) *0.00260;
			}
			
			//output+=" - Duplex rate:\n----------------------------\n";
		
		}// end of switch statement
		
		
		// display the program output
		output+="Customer Number: "+custNumber+"\nCustomer Name: "+custName+
				"\nGallons: "+gallons+"\nBill Value: $"+String.format("%.2f", value);
		JOptionPane.showMessageDialog(null, output);

	}// end of main
}// end of class
