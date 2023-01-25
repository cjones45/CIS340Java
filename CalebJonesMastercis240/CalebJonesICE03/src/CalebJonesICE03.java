//*************************************************************************** 
//*  
//* CIS 240                  Spring 2022                  Caleb Jones 
//*  
//*                         Program Assignment ICE03  
//*  
//* Class description (can be multiple lines) 
//*   This class is my submission for the in class exercise. 
//*   
//*  
//*  
//*                         Date Created 
//*  						(2/14/2022)
//*                         File Name:  CalebJonesICE02 
//*  
//****************************************************************************
import javax.swing.JOptionPane;
public class CalebJonesICE03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempString;
		int customerRate;
		int customerNum;
		String customerName;
		double baseCharge;
		double vCharge;
		double numGallons;
		double billValue = 0;
		
		//get customer rate
		tempString = JOptionPane.showInputDialog("Enter Customer Type: \n 1 - Single Family \n 2 - Duplex ");
		 customerRate = Integer.parseInt(tempString);
		 
		 if(customerRate == 1 || customerRate == 2) {
			 System.out.println("works");
		 }else {
			 JOptionPane.showMessageDialog(null, "Invalid Customer Type. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		 }
		 

		 tempString = JOptionPane.showInputDialog("Enter Customer Number: ");
		 customerNum = Integer.parseInt(tempString);
		 if(customerNum >=100000 && customerNum <=999999) {
			 System.out.println("works");
		 }else {
			 JOptionPane.showMessageDialog(null, "Invalid Customer Number. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		 }
		 
		 
		
		 customerName = JOptionPane.showInputDialog("Enter customer name:");
		 if(customerName.length() >=1) {
			 System.out.println("works");
		 }else {
			 JOptionPane.showMessageDialog(null, "Invalid Customer Name. Exiting Program.",
				      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			 System.exit(0);
		 }
		 
		 
		 tempString = JOptionPane.showInputDialog("Enter number of Gallons: ");
		 numGallons = Integer.parseInt(tempString);
		 
		 
		 
		 
		 
		 if(customerRate == 1) {
			 baseCharge = 13.21;
			 if(numGallons > 0 || numGallons <= 7000) {
				 billValue = + baseCharge + (7000 * .00204); 
				 System.out.println("b1 " + billValue);
			 }if(numGallons >= 7001 || numGallons <= 13000) {
				 billValue =+ billValue + ((numGallons-7000)*0.00235);
				 System.out.println("b2 " + billValue);
			 }if(numGallons >= 13001) {
				 billValue += (numGallons-13000) * 0.00270;
				 System.out.println("b3 " + billValue);
			 }
			 String formatValue = String.format("%.2f", billValue);
		 }
		 
		 if(customerRate ==2){
			 baseCharge = 15.51;
			 if(numGallons > 0 || numGallons <= 9000) {
				 billValue = baseCharge + 9000 *  0.00197; 
			 }if(numGallons >= 9001 || numGallons <= 13000) {
				 billValue += (numGallons-9000)*0.00226;
			 }if(numGallons >= 13001) {
				 billValue += (numGallons-13000) *0.00260;
			 }
			 String formatValue = String.format("%.2f", billValue);
		 }
		 
		 if(customerRate == 1) {
			 JOptionPane.showMessageDialog(null,"WATER BILL - Single: \n Customer Number: " + 
				     customerNum +"\n Customer Name: " + customerName + "\n Gallons: "+ numGallons + "\n Bill Value: $" + billValue);
		 }else if(customerRate == 2) {
			 JOptionPane.showMessageDialog(null,"WATER BILL - Duplex: \n Customer Number: " + 
				     customerNum +"\n Customer Name: " + customerName + "\n Gallons: "+ numGallons + "\n Bill Value: $" + billValue);
		 }
		 
		 
	}

}
