//*************************************************************************** 
		//*  
		//* CIS 240                  Spring 2022                  Caleb Jones 
		//*  
		//*                         Program Assignment ICE07  
		//*  
		//* Class description (can be multiple lines) 
		//* These classes manage the creation and upkeep of the account.
		//*   
		//* 
		//*  
		//*  
		//*                         Date Created 
		//*  						(4/11/2022)
		//*                         File Name:  CalebJonesICE07 
		//*  
		//****************************************************************************
import javax.swing.JOptionPane;
public class CalebJonesICE07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account newAccount;

		double numInput;
		String nameInput;
		nameInput = JOptionPane.showInputDialog("Please enter your name: ");
		numInput = getDoubleInput(true,0,false,0,"Are you making an initial deposit? enter 0 for no and the ammount for yes", "Invalid Input");
		if(numInput == 0) {
			newAccount = new Account(nameInput);
		}else {
			newAccount = new Account(nameInput,numInput);
		}
		double temp = getDoubleInput(true,0,false,0,"How much more would you like to deposit? Please enter an amount", "Invalid Input");
		if(temp == 0) {
			JOptionPane.showMessageDialog(null,"Your ballance is " + newAccount.getBalance());
		}else{
			newAccount.deposit(temp);
			JOptionPane.showMessageDialog(null,"Account Name: " + newAccount.getName() + "\nYour ballance is " + newAccount.getBalance());
		}
		temp = getDoubleInput(true,0,false,0,"How much do you want to withdraw from your account? ", "Invalid Input");
		if(temp == 0) {
			JOptionPane.showMessageDialog(null,"Account Name: " + newAccount.getName() + "\nYour ballance is " + newAccount.getBalance());
		}else {
			
			JOptionPane.showMessageDialog(null,"You withdrew $" + newAccount.withdraw(temp));
			JOptionPane.showMessageDialog(null,"Account Name: " + newAccount.getName() + "\nYour ballance is " + newAccount.getBalance());
		}

	}
	public static double getDoubleInput(boolean lowerLimitFlag, double lowerLimit, boolean upperLimitFlag,  
			 double upperLimit, String prompt, String errorMsg) {
		boolean validInput = false;
		double input = 1.0;
		while(validInput == false) {
			String tempString = JOptionPane.showInputDialog(prompt);
			input = Double.parseDouble(tempString);
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

	 class Account {
		private String name;
		private double balance;
	
		  public Account(String name) {
		   this.name = name;
		    this.balance = 0;
		  }
		  public Account(String name, Double deposit) {
			  this.name = name;
			  this.balance = deposit;
		  }
		  public void deposit (double amount) {
				balance += amount;
			}
		  public double withdraw (double amount) {
			  if(balance >= amount) {
				  balance = balance - amount;
				  return amount;
			  }else {
				  balance = 0;
			  return balance;
		  }
		  }
		  public double getBalance () {
			  return balance;
		  }
		  public String getName () {
			  return name;
		  }
	}
	

