//*************************************************************************** 
		//*  
		//* CIS 240                  Spring 2022                  Caleb Jones 
		//*  
		//*                         Program Assignment PA04  
		//*  
		//* Class description (can be multiple lines) 
		//*   This class takes input of ints and string and calculates a tuition
		//*   bill based on the input.
		//* 
		//*  
		//*  
		//*                         Date Created 
		//*  						(3/06/2022)
		//*                         File Name:  CalebJonesPA04 
		//*  
		//****************************************************************************
import javax.swing.JOptionPane;
public class CalebJonesPA04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String online = "Online";
		final String onCampus = "On-campus";
		String schoolChoice = " ";
		int courseNumber = 9000;
		String coursesReg = "";
		int totalCredits = 0;
		double generalFee = 0;
		double hInsurancefee = 0;
		double courseFee = 0;
		double totalTuitionfee = 0;
		String tempString;
		final String class100 = "100";
		final String class150 = "150";
		final String class250 = "250";
		final String class300 = "300";
		boolean validInput = false;
		
		while(validInput == false) {
		 tempString = JOptionPane.showInputDialog("Do you attend 'Online' or 'On-campus'? ");
		//Select online or on campus AND check for bad input
		 switch(tempString) {
		 case "Online":
			 schoolChoice = online;
			 validInput = true;
			 break;
		 case "online":
			 schoolChoice = online;
			 validInput = true;
			 break;
		 case "ONLINE":
			 schoolChoice = online;
			 validInput = true;
			 break;
		 case "On campus":
			 schoolChoice = onCampus;
			 validInput = true;
			 break;
		 case "ON CAMPUS":
			 schoolChoice = onCampus;
			 validInput = true;
			 break;
		 case "ON-CAMPUS":
			 schoolChoice = onCampus;
			 validInput = true;
			 break;
		 case "On-campus":
			 schoolChoice = onCampus;
			 validInput = true;
			 break;
		 default:
			JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
		 }
		}
		 //get and verify class # input until 0 is typed
		 
		 while(courseNumber != 0) {
		 tempString = JOptionPane.showInputDialog("Please enter the course number: ");
		 courseNumber = Integer.parseInt(tempString);
		 
		 if(schoolChoice == online) {
			 if(courseNumber==100) {
				 coursesReg = coursesReg.concat(class100 + "\n");
				 totalCredits = totalCredits +3;
				 courseFee += 2800;
			 }else if(courseNumber==150) {
				 coursesReg = coursesReg.concat(class150 + "\n");
				 totalCredits = totalCredits +4;
				 courseFee += 4000;
			 }else if(courseNumber==250) {
				 coursesReg = coursesReg.concat(class250 + "\n");
				 totalCredits = totalCredits +3;
				 courseFee += 3200;
			 }else if(courseNumber==300) {
				 coursesReg = coursesReg.concat(class300 + "\n");
				 totalCredits = totalCredits +4;
				 courseFee += 4500;
			 }else if(courseNumber==0) {
				 //exit loop
			 }else {
				 JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.",
					      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 }
		 }else if(schoolChoice == onCampus) {
			 if(courseNumber==100) {
				 coursesReg = coursesReg.concat(class100 + "\n");
				 totalCredits = totalCredits +3;
				 courseFee += 3000;
			 }else if(courseNumber==150) {
				 coursesReg = coursesReg.concat(class150 + "\n");
				 totalCredits = totalCredits +4;
				 courseFee += 4100;
			 }else if(courseNumber==250) {
				 coursesReg = coursesReg.concat(class250 + "\n");
				 totalCredits = totalCredits +3;
				 courseFee += 3450;
			 }else if(courseNumber==300) {
				 coursesReg = coursesReg.concat(class300 + "\n");
				 totalCredits = totalCredits +4;
				 courseFee += 4700;
			 }else if(courseNumber==0) {
				 //exit loop
			 }else {
				 JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.",
					      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 }
			 
		 }
		 }
		 //calculate fees for online
		 if(schoolChoice == online) {
			 if(totalCredits <9) {
				 generalFee= totalCredits * 89.34;
				 hInsurancefee = 589.32;
			 }else if(totalCredits >= 9) {
				 generalFee = 804.06;
				 hInsurancefee = 897.65; 
			 }
			//calculate fees for online (same as before just with 10% increase)
		 }else if(schoolChoice == onCampus) {
			 if(totalCredits <9) {
				 generalFee= (totalCredits * 89.34);
				 hInsurancefee = 589.32;
				 //in person adjustment
				 generalFee = generalFee + (generalFee * .1);
				 hInsurancefee = hInsurancefee + (hInsurancefee * .1);
			 }else if(totalCredits >= 9) {
				 generalFee = 804.06;
				 hInsurancefee = 897.65; 
				 //in person adjustment
				 generalFee = generalFee + (generalFee * .1);
				 hInsurancefee = hInsurancefee + (hInsurancefee * .1);
			 }
		 }
		 //calculate total
		 totalTuitionfee = generalFee+hInsurancefee+courseFee;
		 String formathInsurancefee = String.format("%.2f", hInsurancefee);
		 String formatcourseFee = String.format("%.2f", courseFee);
		 String formattotalTuitionfee = String.format("%.2f", totalTuitionfee);
		 
		 //show output with all information
		 JOptionPane.showMessageDialog(null,"Type of student: " + schoolChoice
			     +"\n \n Courses registered: \n "+ coursesReg +" \n Total number of credits: " + totalCredits + "\n General Fee: $"+ generalFee 
			     + "\n Health insurance fee: $" + formathInsurancefee+ "\n Course fee: $"+ formatcourseFee +"\n\n Total tuition fee: $"+ formattotalTuitionfee);
		

	}

}
