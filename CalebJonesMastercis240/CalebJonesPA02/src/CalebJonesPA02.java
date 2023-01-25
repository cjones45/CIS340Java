
		//*************************************************************************** 
		//*  
		//* CIS 240                  Spring 2022                  Caleb Jones 
		//*  
		//*                         Program Assignment PA02  
		//*  
		//* Class description (can be multiple lines) 
		//*   This class is my submission for the week 2 project, and takes input to calculate
		//*  the hat  calculates  the  total  manufacturing  cost  and  unit  cost  of  waterproof 
		//*  Bluetooth speakers.
		//*  
		//*  
		//*                         Date Created 
		//*  						(2/06/2022)
		//*                         File Name:  CalebJonesPA02 
		//*  
		//****************************************************************************

import javax.swing.JOptionPane;
import java.util.Scanner;
public class CalebJonesPA02 {

	public static void main(String[] args) {
	
			String tempString;
			final double WAGE = 25.0;
			double matCost;
			int numEmployees;
			double overHeadCost;
			int numUnits;
			double manuCost;
			double unitCost;
			double posibleRaise;
			
			
			 //Get Direct Material cost
			 tempString = JOptionPane.showInputDialog("Direct material cost: ");
			 matCost = Integer.parseInt(tempString);
			 
			//get the total number of employees
			 tempString = JOptionPane.showInputDialog("Total number of employees: ");
			 numEmployees = Integer.parseInt(tempString);
			 
			 //get the get overhead cost
			 tempString = JOptionPane.showInputDialog("Manufacturing overhead cost: ");
			 overHeadCost = Integer.parseInt(tempString);
			 
			//get the number of units
			 tempString = JOptionPane.showInputDialog("Number of units manufactured: ");
			 numUnits = Integer.parseInt(tempString);
			 
			//calculate the manufacturing costs
			 manuCost = matCost + WAGE *numEmployees + overHeadCost;
			 
			 //calculate the cost per unit
			 unitCost= manuCost / numUnits;
			 
			 
			//Print the result of the calculations
			 JOptionPane.showMessageDialog(null,"Output: \n Total manufacturing cost: "+ manuCost +"\n Number of units manufactured: " + 
		     numUnits +"\n Cost per unit: " + unitCost);
			 
			 
			 //Program 2
			 
			 Scanner scn = new Scanner(System.in);
			 System.out.println("Direct material cost: ");
			 matCost = scn.nextInt(); 
			 
			 //reset number of employees
			 
			 System.out.println("Total number of employees: ");
			 numEmployees = scn.nextInt();
			 
			//reset the overhead costs
			 
			 System.out.println("Manufacturing overhead cost: ");
			 overHeadCost = scn.nextDouble();
			 
			//reset the number of units manufacturing
			 
			 System.out.println("Number of units manufactured: ");
			 numUnits = scn.nextInt();
			 
			//set the raise percent
			 
			 System.out.println("Percent raise being considered: ");
			 posibleRaise = scn.nextDouble();
			 
			 //calculate the percent the raise increases the cost
			 
			 	double percent = (posibleRaise / 100);
			    
			    double laborCostPerEmployee = WAGE + (25 * percent); 
					 manuCost = matCost + laborCostPerEmployee*numEmployees + overHeadCost; 
					 
					 unitCost = 22.39;
					 
					 //print out the formatted outputs
					 
					 System.out.println();
					 System.out.println("Increased direct labor cost per employee : " + String.format("%.2f",laborCostPerEmployee)); 
					 System.out.println("Total manufacturing cost : $" + String.format("%.2f",manuCost));  
					 System.out.println("Number of units manufactured : " + numUnits); 
					 System.out.println("Cost per unit : $" + unitCost);
					

	}

}
