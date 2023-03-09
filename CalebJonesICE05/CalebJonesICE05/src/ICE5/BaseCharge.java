//*************************************************************************** 
//*  
//* CIS 340                  Spring 2023                  Caleb Jones 
//*  
//*                     Programming Assignment: 
//*  							BaseCharge.java
//* 				Class description (can be multiple lines) 
//*   		This is my Submission for the CalebJonesICE05 
//*  
//*  							 :)
//*                         Date Created 
//*  						(Mar 9, 2023)
//*                         File Name:  BaseCharge.java
//*  							
//****************************************************************************
package ICE5;

public interface BaseCharge {
	public	static final double BASE_CHARGE_SINGLE_FAMILY = 13.21;
	public	static final double BASE_CHARGE_DUPLEX = 15.51;
	
	
	
	
	public void computeBill(); 
		// the code of this method is implemented in the sub-classes
	
}
