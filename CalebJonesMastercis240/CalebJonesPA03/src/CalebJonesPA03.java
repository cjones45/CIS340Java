//*************************************************************************** 
		//*  
		//* CIS 240                  Spring 2022                  Caleb Jones 
		//*  
		//*                         Program Assignment PA03  
		//*  
		//* Class description (can be multiple lines) 
		//*   This class is my submission for PA03. Program 1 calculates a bill with a discount involved
		//*   Program 2 calculates the time in different time zones in different states
		//*  
		//*  
		//*  
		//*                         Date Created 
		//*  						(2/20/2022)
		//*                         File Name:  CalebJonesPA03 
		//*  
		//****************************************************************************
import javax.swing.JOptionPane;
public class CalebJonesPA03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare Variables
		String tempString;
		double unitPrice;
		int unitsSold;
		double discountRate = 0;
		double priceNoDiscount = 0;
		double finalPrice=0.00;
		
		//Get input for price
		tempString = JOptionPane.showInputDialog("What is the unit price of the product sold? ");
		 unitPrice = Integer.parseInt(tempString);
		//Get input for units
		 tempString = JOptionPane.showInputDialog("Total number of units sold? ");
		 unitsSold = Integer.parseInt(tempString);
		 
		//Calculate the discount rate
		 if(unitsSold <100) {
			 discountRate = 0;
		 }else if(unitsSold >= 101 && unitsSold <= 250) {
			 discountRate = .1;
		 }else if(unitsSold >= 251 && unitsSold <= 500) {
			 discountRate = .15;
		 }else if(unitsSold > 500) {
			 discountRate = .20;
		 }
		//Format prices to 2 decimal places
		 priceNoDiscount = unitPrice * unitsSold;
		 String formatPriceNoDiscount = String.format("%.2f", priceNoDiscount);
		 
		 String formatUnitPrice = String.format("%.2f", unitPrice);
		 
		 finalPrice = priceNoDiscount - (discountRate * priceNoDiscount);
		 String formatFinalPrice = String.format("%.2f", finalPrice);
		 //Return Output
		 JOptionPane.showMessageDialog(null,"Unit Price: $"+ formatUnitPrice +"\n Total number of units: " + 
			     unitsSold +"\n Total price before discount: " + (formatPriceNoDiscount) + "\n Discount applied: " + (discountRate * 100) 
			    + "\n Total price after discount: " + formatFinalPrice);
		 
		 //Beginning of Program 2
		 //declate variables
		 int hour;
		 int minutes;
		 String state;
		 int hourChange = 0;
		 String timeZone = " ";
		 String dayText = " ";
		 int newHour = 0;
		 //get input and verify it is valid for hours
		 tempString = JOptionPane.showInputDialog("Enter the current hour in the mountain time zone (24-hour format): ");
		 hour = Integer.parseInt(tempString);
		 if(hour > 0 && hour <=24) {
			 System.out.println("Correct hour");
		 }else {
			 JOptionPane.showMessageDialog(null, "Invalid Hour. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		 }
		//get input and verify it is valid for Minutes
		 tempString = JOptionPane.showInputDialog("Enter the minutes: ");
		 minutes = Integer.parseInt(tempString);
		 if(minutes >= 0 && minutes <=59) {
			 System.out.println("Correct minutes");
		 }else {
			 JOptionPane.showMessageDialog(null, "Invalid Minutes. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		 }
		//get input and verify it is valid for State
		 state = JOptionPane.showInputDialog("Enter the destination state for time conversion (2 capital letters): ");
		 
		 switch (state) {
		  case "HI":
		    hourChange = -4;
		    timeZone = "Hawaii";
		    break;
		  case "AK":
			  hourChange = -2;
			  timeZone = "Bering";
		    break;
		    //Pacific Time Zone
		  case "CA":
			  hourChange = -1;
		      timeZone = "Pacific";
		    break;
		  case "ID":
			  hourChange = -1;
		      timeZone = "Pacific";
		    break;
		  case "NV":
			  hourChange = -1;
		      timeZone = "Pacific";
		    break;
		  case "OR":
			  hourChange = -1;
		      timeZone = "Pacific";
		    break;
		  case "WA":
			  hourChange = -1;
		      timeZone = "Pacific";
		    break;
		    //Mountain Time Zone
		  case "AZ":
		    hourChange=0;
		    timeZone = "Mountain";
		    break;
		  case "CO":
			    hourChange=0;
			    timeZone = "Mountain";
			    break;
		  case "MT":
			    hourChange=0;
			    timeZone = "Mountain";
			    break;
		  case "NM":
			    hourChange=0;
			    timeZone = "Mountain";
			    break;
		  case "UT":
			    hourChange=0;
			    timeZone = "Mountain";
			    break;
		  case "WY":
			    hourChange=0;
			    timeZone = "Mountain";
			    break;
		//Central Time Zone
		  case "AL":
		   hourChange=1;
		    timeZone = "Central";
		    break;
		  case"AR":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "IA":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "IL":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "IN":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "KS":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "KY":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "LA":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "MI":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "MN":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "MO":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "MS":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "ND":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "NE":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "OK":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "SD":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "TN":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "TX":
			   hourChange=1;
			    timeZone = "Central";
			    break;
		  case "WI":
			   hourChange=1;
			    timeZone = "Central";
			    break;
			    //Eastern Time Zone
		  case  "CT":
		    hourChange = 2;
		    timeZone = "Eastern";
		    break;
		  case  "DE":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "FL":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "GA":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "MA":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "MD":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "ME":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "NC":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "NH":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "NJ":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "NY":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "OH":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "PA":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "RI":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "SC":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "VA":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "VT":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  case  "WV":
			    hourChange = 2;
			    timeZone = "Eastern";
			    break;
		  default:
			    JOptionPane.showMessageDialog(null, "Invalid State. Exiting Program.",
			      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			       System.exit(0);
		}
		 //Calculate the time change between zones
		 if((hour+hourChange) >24) {
			 newHour=(hour+hourChange)-24;
			 dayText = "Tomorrow";
		 }else if((hour+hourChange) <=0) {
			 newHour= 24 - hour+hourChange;
			 dayText= "Yesterday";
		 }else {
			 dayText = "Today";
		 }
		 //Print output
		 JOptionPane.showMessageDialog(null,"The current time in "+state+ " is " + (newHour)+":"+minutes + " " +dayText);

	}

}
