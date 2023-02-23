package wk5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PhoneBill {
	
	
	
	final static double BASE_Go_CHARGE = 19.99;
	final static double BASE_CONTRACT_CHARGE = 16.95;

	public static void main(String[] args) throws FileNotFoundException {
		
		//Declare variables 
		int minutes = 0, custType = 0, noOfParticipants = 0, noOfCustomers = 0, custId=0;
		String name = ""; 
		String output="Phone Bills:" +
				"\nRate" + "\tNumber" + "\tName" + "\tMinutes" + "\tParticipants" + "\tbill";
		double bill = 0;
			
		// Declare arrays
		String[] namesArr, typesArr;
		int[] minutesArr, numberArr, contractArr;
		double[] billArr;
		
		 // Input the number of customers
		 noOfCustomers = DataEntries.intInput("Input No of Customers");
		
		// Create  arrays of size "numOfClients (n)"
				namesArr = new String[noOfCustomers];
				typesArr = new String[noOfCustomers];
				minutesArr = new int[noOfCustomers];
				contractArr = new int[noOfCustomers];
				numberArr = new int[noOfCustomers];
				billArr = new double[noOfCustomers];

		
		for (int i =0; i < noOfCustomers; i++ ) {
			
			// input data for customer i
			JOptionPane.showMessageDialog(null, "Input Data For Customer " + (i+1));

			// Input customer id
			custId = DataEntries.intInputSize(6, "Input Customer ID");
			
			
			// add value to array at index i
			numberArr[i] = custId;
				
		// Input customer name
		 name = DataEntries.strInput("Input Customer Name");
			
		// add value to array at index i
		namesArr[i] = name;
		
		// Input the customer type
		custType = DataEntries.intInputChoice(0, 1, "Input Customer Type:" +
				  "\n0 - Go Bill" + "\n1 - Contract Bill");
						
		// switch statement
		switch (custType) {
		case 0: // Input customer minutes
			    
			    minutes = DataEntries.intInput("Input Number of Minutes");
								 
			    // fill arrays with data at index i
			    typesArr[i] = "Go Bill";
				minutesArr[i] = minutes;
				billArr[i] = goBill(minutes);
				break;
		
		case 1: // Input number of participants 
			
			noOfParticipants = DataEntries.intInputRange(1, 4, "Input Number of Participants"); 
			    // fill arrays with data at index i
			    typesArr[i] = "Contract Bill";	
				contractArr[i] = noOfParticipants;
				billArr[i] = contractBill(noOfParticipants);
			    break;
				
		}// end of switch
		
	}// for
		
		// prepare the program output
		for (int i = 0; i< billArr.length; i++)
			output+="\n" + typesArr[i] + "\t" + numberArr[i] + "\t" + namesArr[i] +
			"\t" + minutesArr[i] + "\t" + contractArr[i] + "\t" + String.format("%.2f", billArr[i]);
		
		// call method to display the program output
		displayBill(output);
		
		// Create customer info array and fill it with customer data
		String[] custInfoArr = new String[billArr.length];
		for (int i = 0; i< custInfoArr.length; i++)
			custInfoArr[i] = typesArr[i] + "\t" + numberArr[i] + "\t" + namesArr[i] +
			"\t" + minutesArr[i] + "\t" + contractArr[i];
		
		// Call method to sort both arrays using the selection sort based on bill value
		sortBill(billArr, custInfoArr);
        
			
       // call method to display and return the program output after sorting
	   output = displayBill(billArr, custInfoArr, output);
	   
	    
	  // call method to write the output data to a file	
          writeToFile(output);

	}// end of method main
	
	// added methods
	
	// method 1 - Computes the Go Bill
	private static double goBill(int minutes) {
		double bill;
		if (minutes < 200)
			bill = BASE_Go_CHARGE;
		else if ( (minutes >= 200) && (minutes < 350))
			bill = BASE_Go_CHARGE + (minutes - 200) * 0.1;
		else
			bill = BASE_Go_CHARGE + (350 - 200) * 0.1 
			+ (minutes - 350) * .12; 
		
		return bill;
				
	}//end method goBill() 

	// Method 2 - Computes the Construct Bill
	public static double contractBill(int participants) {
		double bill;
		if (participants == 1)
			bill = BASE_CONTRACT_CHARGE;
		else if (participants == 2)
			bill = BASE_CONTRACT_CHARGE + (BASE_CONTRACT_CHARGE * 0.05);
		else if (participants == 3)
			bill = BASE_CONTRACT_CHARGE + (BASE_CONTRACT_CHARGE * 0.05) +
					(BASE_CONTRACT_CHARGE * 0.1); 
		else 
			bill = BASE_CONTRACT_CHARGE + (BASE_CONTRACT_CHARGE * 0.05) +
			(BASE_CONTRACT_CHARGE * 0.1) + (BASE_CONTRACT_CHARGE * 0.15); 	
		
		
		return bill;
	}// end contractBill()
	
	// method 3 - display the program output
	public static void displayBill(String out) {
		// display the program output using  JOptionPane
		JOptionPane.showMessageDialog(null, new JTextArea(out));
		
	}// end method displayBill
	
	// method 4 - Overloaded method to display the program output
	public static String displayBill(double[] billArr, String[] custInfoArr, String output) {
	    // program output after sorting
		for ( int i = 0; i< billArr.length; i++)
			output+=custInfoArr[i] + String.format("%.2f", billArr[i]);
		JOptionPane.showMessageDialog(null, new JTextArea(output));
		
		// display the program output
		JOptionPane.showMessageDialog(null, new JTextArea(output));
		    
	    
	    // return the output
	    return output;
		
	}// end overloaded method displayBill()
	
	// method 5 - sorts two arrays: billArr and custInfoArr
	public static void sortBill(double[] billArr, String[] custInfoArr) {
		int i =0;
		for (i = 0; i < billArr.length - 1; i++) {
		      // Find the minimum in the list[i..list.length-1]
		      double currentMin = billArr[i];
		      String currentMinInfo = custInfoArr[i];
		      int currentMinIndex = i;

		      for (int j = i + 1; j < billArr.length; j++) {
		        if (currentMin > billArr[j]) {
		          currentMin = billArr[j];
		          currentMinInfo = custInfoArr[i];
		          currentMinIndex = j;
		        }
		      }

		      // Swap list[i] with list[currentMinIndex] if necessary;
		      if (currentMinIndex != i) {
		    	  billArr[currentMinIndex] = billArr[i];
		    	  billArr[i] = currentMin;
		    	  
		    	  
		    	  custInfoArr[currentMinIndex] = custInfoArr[i];
		    	  custInfoArr[i] = currentMinInfo;
		      }
		    }
		// use the code from the previous PhoneBill project
		
	}// end method sortBill
	
	// method 5 writes the program data to a file
	public static void writeToFile(String output) {
		
		// write data to file	
        // create a file object
		
	 	
		
		// Create a PrintWriter to write data to a file
	    
	    
	    // Write data to a file
	    


    	 // Close the file
	    
	    
	    
	    // confirmation message
	    JOptionPane.showMessageDialog(null, "Comppleted writing data to file \'bills_output.txt\'");
		
	}// end writeToFile()
	
} //end of class PhoneBill
