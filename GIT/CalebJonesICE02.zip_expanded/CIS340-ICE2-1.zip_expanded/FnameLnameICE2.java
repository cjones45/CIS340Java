package ICEs;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FnameLnameICE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare variables and constants
		int gallons = 0;
		double value = 0;
		String custName = null;
		int custNumber = 0;
		int custType=0;
		String customerTypeStr; //newly added 
		final double BASE_CHARGE_SINGLE_FAMILY = 13.21 ;
		final double BASE_CHARGE_DUPLEX = 15.51  ;
		String output="Customer Type\tCustomer Number\tCustomer Name\tGallons\tBill Value";
		int noOfCustomers=0;
		int cont = JOptionPane.YES_OPTION;
		
		//obtain number of customers, unlimited attempts
		
		cont = JOptionPane.YES_OPTION;
		while (cont == JOptionPane.YES_OPTION) {
		try {	
			
			noOfCustomers=Integer.parseInt(
						JOptionPane.showInputDialog(null,"Enter the number of customers: "));
			
			if (noOfCustomers<1)
				throw new Exception();
			break;
			
		}catch (Exception ex) {
			
			cont = JOptionPane.showConfirmDialog(null, "Invalid Customer Number Input?" + "\nWould you like to continue?");
			if (cont != JOptionPane.YES_OPTION) 
				System.exit(0);
		
		}//end try-catch	
	}//end while
		
	
		String[] custTypeArr = new String[noOfCustomers];
		String [] custNameArr = new String[noOfCustomers];
		int [] custNumArr = new int[noOfCustomers];
		double [] gallonsArr = new double[noOfCustomers];
		double [] billArr = new double[noOfCustomers];
		
		
		
		// read customers data and fill the arrays with that data
		for(int i=0;i<noOfCustomers;i++) {
		
		//input customer rate, unlimited attempts
		//To Complete
		while(true) {	
		try {
		custType=Integer.parseInt(
				JOptionPane.showInputDialog(null,
						"Enter Customer Rate: "
						+ "\n1-Single Family"
						+ "\n2-Duplex"));
		if(custType!=1 && custType!=2)
			throw new Exception(); //control goes to catch clause
		
		break;
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Invalid Customer Rate."
					+ "\nIt must be 1 or 2");
		}// end catch
		}// end while
		
		// add customer type to the custTypeArr array at index i
		//To Complete
		if (custType == 1)
			customerTypeStr = "Single Family";
		else 
			customerTypeStr = "Duplex";
		
		//Obtain user input customer number, unlimited attempts
		//To Complete
		while(true) {
		try {
		custNumber=Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter customer number: "));
		if(String.valueOf(custNumber).length()!=6)
			throw new Exception(); //control goes to catch clause
		break;
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, 
					"Please enter a valid 6-digit customer number!",
					"ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
			
		}// end catch
		}// end while
		
		
		// input customer name, unlimited attempts
		//To Complete
		while(true) {
		custName=JOptionPane.showInputDialog(null,
				"Enter customer name: ");
		if(custName.isEmpty())
			JOptionPane.showMessageDialog(null, 
					"Please enter a valid customer name!\nIt cannot be empty!","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
		else
			break;
		}// end while
		
		
				
		// input number of gallons, unlimited attempts
		//To Complete
		while(true) {
		try {
			gallons=Integer.parseInt(JOptionPane.showInputDialog(
					null, "Enter number of gallons: "));
			if(gallons < 0) 
				throw new Exception(); // control goes to the catch clause
			
		break;
		} catch (Exception ex){
			JOptionPane.showMessageDialog(null, 
					"Please enter a valid value for gallons!\n"
					+ "It cannot be negative!","ERROR MESSAGE",
					JOptionPane.ERROR_MESSAGE);
			
		}// end catch
		}// end while
		
			
		// compute customer bill
		switch (custType) {
		case 1: if (gallons <= 7000)
			 			value = BASE_CHARGE_SINGLE_FAMILY + 
			 			gallons * 2.04 / 1000;
			 	else if (gallons <= 13000)
			 			value = BASE_CHARGE_SINGLE_FAMILY + 
			 			7000 * 2.04 / 1000 + (gallons - 7000) * 2.35 / 1000;
			 	else 
			  		value = BASE_CHARGE_SINGLE_FAMILY + 
			  		7000 * 2.04 / 1000 + 6000 * 2.35 / 1000 + 
			  		(gallons - 13000) * 2.70 / 1000;
										
				break;
		case 2: if (gallons <= 9000)
				 	value = BASE_CHARGE_DUPLEX + gallons * 
				 	1.97 / 1000;
				else if (gallons <= 13000)
					value = BASE_CHARGE_DUPLEX + 9000 * 1.97 / 1000 + 
					(gallons - 9000) * 2.26 / 1000;
				else 
					value = BASE_CHARGE_DUPLEX + 9000 * 1.97 / 1000 +
					4000 * 2.26 / 1000 + (gallons - 13000) * 2.60 
					/ 1000;
					
		}// end switch
		
		   //To Complete
		   // add value to the billArr array and custInfoArr at index i
			
			
		
		}//end for loop
		
		
		//To Complete
		//	display the program output using the array data
		// Use for loop to read data from the arrays and add them to variable output format
		// To Complete
		
		
		//To Complete
		// find the maximum bill value
		// Add the maximum bill value info to the output, using the index value
		
		//To Complete
		// find the minimum bill value
		// Add the minimum bill value info to the output, using the index value
		
		// Display the program output with statistics 
		JOptionPane.showMessageDialog(null, new JTextArea(output),"WATER BILL CALCULATOR",JOptionPane.INFORMATION_MESSAGE); 
		
				
	}// end main

}// end class
