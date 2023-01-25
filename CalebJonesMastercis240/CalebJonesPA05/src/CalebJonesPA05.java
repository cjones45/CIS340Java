import javax.swing.JOptionPane;

//*************************************************************************** 
		//*  
		//* CIS 240                  Spring 2022                  Caleb Jones 
		//*  
		//*                         Program Assignment PA05  
		//*  
		//* Class description (can be multiple lines) 
		//* The first part validates integer input
		//*   The second part has many methods that try to calculate a complicated bill
		//* 
		//*  
		//*  
		//*                         Date Created 
		//*  						(3/27/2022)
		//*                         File Name:  CalebJonesPA05 
		//*  
		//****************************************************************************
public class CalebJonesPA05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int route = getIntegerInput(true,1,true, 3," Which route? ", "Invalid Input");
		int passengers = getIntegerInput(true,1,false, 3," How many Passengers? ", "Invalid Input");
		
		
		int memberStatus = getIntegerInput(true,0,true, 1," Are you a member? ", "Invalid Input");
		int firstTime = getIntegerInput(true,0,true, 1,"Are you a first time user? ", "Invalid Input");
		int cupon = getIntegerInput(true,0,true, 1,"Do you have a cupon? ", "Invalid Input");
		
		double cuponDiscount = 5.00;
		double ftDiscount = 1;
		double memDiscount = 1;
		double tCharge = calculateTravelCharges(route,passengers);
		
		
		
		
		//Calc travel charges
		//check membership
		//check cupon
		//check first time
		//get total
		//sales tax
		
		if(passengers == 1) {
			if(memberStatus == 1) {
				tCharge = calculateTravelCharges(route);
			memDiscount = calculateMembershipDiscount(tCharge, .05);
			}else {
				memDiscount = 0.0;
			if(firstTime == 1) {
				tCharge = calculateTravelCharges(route);
				ftDiscount = calculateFirstTimeUserDiscount(tCharge,.1);
				
			}else {
				ftDiscount = 0.0;
			}
			if(cupon == 1) {
				tCharge = calculateTravelCharges(route);
				cuponDiscount = calculateCouponDiscount(tCharge, passengers);
			}else {
				cuponDiscount = 0.0;
			}
			}
			tCharge = calculateTravelCharges(route);
			JOptionPane.showMessageDialog(null,"Travel charges for a passenger on route " + route + ": " +calculateTravelCharges(route)+
					"\nMembership Discount: " +" $"+memDiscount + "\nCupon Discount: " + cuponDiscount
			 + " \nCharges After Discounts: " + (tCharge-memDiscount-ftDiscount-cuponDiscount +1) + "\nSales Tax: " 
					+ calculateSalesTax(tCharge, .075) +"\nFinal Charge: $ " + ((tCharge-memDiscount-ftDiscount-cuponDiscount) +calculateSalesTax(tCharge, .075)));
		}else if(passengers == 2 ) {
			if(memberStatus == 1) {
				tCharge = calculateTravelCharges(route, 2);
			memDiscount = calculateMembershipDiscount(tCharge, .05);
			}else {
				memDiscount = 0.0;
			if(firstTime == 1) {
				tCharge = calculateTravelCharges(route,2);
				ftDiscount = calculateFirstTimeUserDiscount(tCharge,.1);
				
			}else {
				ftDiscount = 0.0;
			}
			if(cupon == 1) {
				tCharge = calculateTravelCharges(route,2);
				cuponDiscount = calculateCouponDiscount(tCharge, passengers);
			}else {
				cuponDiscount = 0.0;
			}
			}
			tCharge = calculateTravelCharges(route);
			JOptionPane.showMessageDialog(null,"Travel charges for a passenger on route " + route + ": " +calculateTravelCharges(route,2)+
					"\nMembership Discount: " +" $"+memDiscount + "\nCupon Discount: " + cuponDiscount
			 + " \nCharges After Discounts: " + (tCharge-memDiscount-ftDiscount-cuponDiscount +1) + "\nSales Tax: " 
					+ calculateSalesTax(tCharge, .075) +"\nFinal Charge: $ " + ((tCharge-memDiscount-ftDiscount-cuponDiscount) +calculateSalesTax(tCharge, .075)));

		}else if(passengers > 2) {
			if(memberStatus == 1) {
				tCharge = calculateTravelCharges(route, passengers);
			memDiscount = calculateMembershipDiscount(tCharge, .05);
			}else {
				memDiscount = 0.0;
			if(firstTime == 1) {
				tCharge = calculateTravelCharges(route, passengers);
				ftDiscount = calculateFirstTimeUserDiscount(tCharge,.1);
				
			}else {
				ftDiscount = 0.0;
			}
			if(cupon == 1) {
				tCharge = calculateTravelCharges(route, passengers);
				cuponDiscount = calculateCouponDiscount(tCharge, passengers);
			}else {
				cuponDiscount = 0.0;
			}
			}
			tCharge = calculateTravelCharges(route, passengers);
			JOptionPane.showMessageDialog(null,"Travel charges for a passenger on route " + route + ": " +calculateTravelCharges(route, passengers)+
					"\nMembership Discount: " +" $"+memDiscount + "\nCupon Discount: " + cuponDiscount
			 + " \nCharges After Discounts: " + (tCharge-memDiscount-ftDiscount-cuponDiscount +1) + "\nSales Tax: " 
					+ calculateSalesTax(tCharge, .075) +"\nFinal Charge: $ " + ((tCharge-memDiscount-ftDiscount-cuponDiscount) +calculateSalesTax(tCharge, .075)));

		}
		
	}
	public static double calculateTravelCharges(int route_num, int num_of_passengers) {
		double charges = 0;
		if(num_of_passengers == 1) {
			calculateTravelCharges(route_num);
		}else if(num_of_passengers == 2) {
			if(route_num == 1) {
				charges = 60.0;
			}else if(route_num == 2) {
				charges = 53.12;
			}else if(route_num == 3) {
				charges =  63.17;
			}
		}else if(num_of_passengers > 2) {
			if(route_num == 1) {
				charges = num_of_passengers * 26.50;
			}else if(route_num == 2) {
				charges = num_of_passengers * 24.20;
			}else if(route_num == 3) {
				charges = num_of_passengers * 28.78;
		}
	}
		return charges;
	}
	public static double calculateTravelCharges(int route_num) {
		double out = 1;
		if(route_num == 1) {
			out = 35.0;
		}else if(route_num == 2) {
			out = 32.89;
		}else if(route_num == 3) {
			out =  38.0;
		}
		return out;
	}
	public static double calculateMembershipDiscount(double travelCharges, double discountRate) {
			return (discountRate * travelCharges);
	}
	
		public static double calculateCouponDiscount(double travelCharges, int numPassengers) {
			
			return 5.00;
		}
		public static double calculateFirstTimeUserDiscount(double travelCharges, double discountRate) {
			return (travelCharges-discountRate);
		}
		public static double calculateSalesTax(double travelCharges, double taxRate) {
			
				return travelCharges * taxRate;
		}
		

		
		
	public static int getIntegerInput(boolean lowerLimitFlag, int lowerLimit, boolean upperLimitFlag,  
			 int upperLimit, String prompt, String errorMsg) {
		boolean validInput = false;
		int input = 1;
		while(validInput == false) {
			String tempString = JOptionPane.showInputDialog(prompt);
			input = Integer.parseInt(tempString);
			if(lowerLimitFlag == true && upperLimitFlag == true) {
				if(input >= lowerLimit && input <= upperLimit) {
					validInput = true;
					return input;
				}else {
					JOptionPane.showMessageDialog(null, errorMsg,
						      "Invalid Input", JOptionPane.ERROR_MESSAGE);
				}
			}else if((lowerLimitFlag == true && upperLimitFlag == false)) {
				if(input >= lowerLimit) {
					validInput = true;
					return input;
				}else {
					JOptionPane.showMessageDialog(null, errorMsg,
						      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			}
			}else if((lowerLimitFlag == false && upperLimitFlag == true)) {
				if(input <= upperLimit) {
					validInput = true;
					return input;
				}else {
					JOptionPane.showMessageDialog(null, errorMsg,
						      "Invalid Input", JOptionPane.ERROR_MESSAGE);
			}
			}
				
}
		return input;
	}
	
}
	
