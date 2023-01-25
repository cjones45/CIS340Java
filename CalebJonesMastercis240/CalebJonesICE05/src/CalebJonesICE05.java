//*************************************************************************** 
//*  
//* CIS 240                  Spring 2022                  Caleb Jones 
//*  
//*                         Program Assignment ICE05  
//*  
//* Class description (can be multiple lines) 
//*   This class calculates the monthly payment for a loan at a given interest rate and loan period 
//*    (in years). 
//*  
//*  
//*                         Date Created 
//*  						(3/07/2022)
//*                         File Name:  CalebJonesICE05 
//*  
//****************************************************************************
import javax.swing.JOptionPane;

public class CalebJonesICE05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempString;
		double totalLoan = 0;
		boolean validLoan = false;
		boolean validYear = false;
		boolean validIntRate = false;
		double intRate = 0;
		int years = 0;
		double fixIntRate = 0;

		
		
		while(validLoan = true) {
				tempString = JOptionPane.showInputDialog("Please enter total loan ammount: ");
				totalLoan= Double.parseDouble(tempString);
				//input validation
				if(totalLoan > 0 && totalLoan <999999999.99) {
					validLoan = true;
					break;
					}else {
						validLoan = false;
						JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.",
							      "Invalid Input", JOptionPane.ERROR_MESSAGE);
						
					}
		}
			
				
				
				while(validYear = true) {
					tempString = JOptionPane.showInputDialog("How many years for the loan? ");
					years= Integer.parseInt(tempString);
					
					if(years >= 0 && years <500) {
						validYear = true;
						break;
							}else {
								validYear = false;
								JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.",
									      "Invalid Input", JOptionPane.ERROR_MESSAGE);
								
							}
				}
			
				while(validIntRate = true) {
					tempString = JOptionPane.showInputDialog("What is the annual interest rate? ");
					intRate= Double.parseDouble(tempString);
					fixIntRate= intRate/100;
				if(fixIntRate >= 0 && fixIntRate < 1) {
					validIntRate = true;
					break;
						}else {
							validIntRate = false;
							JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.",
								      "Invalid Input", JOptionPane.ERROR_MESSAGE);
							
						}
				}
				String formatMonthlyPayment = String.format("%.2f",calculateMonthlyPayment(totalLoan,years,fixIntRate));
		
				JOptionPane.showMessageDialog(null,"For a " + years + " year loan, with a "+ intRate + "% interest rate, your monthly payment will be $"
						+ formatMonthlyPayment);
			
		}
	
				
	
	
public static double calculateMonthlyPayment(double totalLoan, int years, double fixIntRate) {
	
	double n = 12 * years;
	double perIntRate = fixIntRate/12;
	double discountFactor = (Math.pow((1 + perIntRate), n) - 1) / (perIntRate * Math.pow((1 + perIntRate), n));
	double monthlyPayment = totalLoan/discountFactor;
	
	
	return monthlyPayment;

}
}