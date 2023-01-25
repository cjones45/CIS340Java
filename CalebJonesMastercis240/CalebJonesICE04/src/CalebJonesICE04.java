//*************************************************************************** 
//*  
//* CIS 240                  Spring 2022                  Caleb Jones 
//*  
//*                         Program Assignment ICE04  
//*  
//* Class description (can be multiple lines) 
//*   This class is my submission for the in class exercise.
//*   This class plays a game of rock paper scissors with the user.
//*  
//*  
//*                         Date Created 
//*  						(2/23/2022)
//*                         File Name:  CalebJonesICE04 
//*  
//****************************************************************************
import java.util.Random;

import javax.swing.JOptionPane;
public class CalebJonesICE04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		final int rock = 0;
		final int scissors = 1;
		final int paper = 2;
		String tempString;
		int guess;
		String cGuessTxt = " ";
		String guessTxt = " ";
		String name;
		int rounds;
		int computerChoice; 
		boolean humanwins = false;
		boolean tie = false;
		boolean gameover = false;
		int cWins=0;
		int hWins=0;
		int ties = 0;
		
		Random randomNumber = new Random();
		
		computerChoice = randomNumber.nextInt(3);
		
		
		
		name = JOptionPane.showInputDialog("Please enter your name:");
		tempString = JOptionPane.showInputDialog("How many rounds would you like to play?");
		 rounds = Integer.parseInt(tempString);
		
		 
		 //for(int i = 0;i>=rounds;i++); {
			while(gameover==false) {
			 tempString = JOptionPane.showInputDialog("Enter your guess: ");
			 guess = Integer.parseInt(tempString);
			 if(computerChoice == scissors && guess == paper) {
				 humanwins = true;
			 }else if(computerChoice == scissors && guess == rock) {
				  humanwins = true;
			 }else if(guess==computerChoice) {
				 humanwins= false;
				  tie= true;
			 }else if(computerChoice == rock && guess ==paper) {
				 humanwins=true;
			 }else if(computerChoice == rock && guess ==scissors) {
				 humanwins=false;
			 }else if(computerChoice == paper && guess ==rock) {
				 humanwins=false;
			 }else if(computerChoice == paper && guess ==scissors) {
				 humanwins=true;
			 }
			 if(guess == paper) {
				 guessTxt = "Paper";
			 }else if(guess == scissors) {
				 guessTxt = "Scissors";
			 }else if(guess == rock) {
				 guessTxt = "Rock";
			 }
			 if(computerChoice == paper) {
				 cGuessTxt = "Paper";
			 }else if(computerChoice == scissors) {
				 cGuessTxt = "Scissors";
			 }else if(computerChoice == rock) {
				 cGuessTxt = "Rock";
			 }
			 
			 if(humanwins==false) {
				 JOptionPane.showMessageDialog(null,name+" chose "+ guessTxt + ". Computer picked " + cGuessTxt+". Computer wins this round.");
				 cWins++;
			 }else if(humanwins==true) {
				 JOptionPane.showMessageDialog(null,name+" chose "+ guessTxt + "Computer picked " + cGuessTxt+". " +name+ " wins this round.");
				 hWins++;
			 }else if(tie==true) {
				 JOptionPane.showMessageDialog(null,name+" chose "+ guessTxt + "Computer picked " + cGuessTxt+". No winners this round.");
				 ties++;
			 }
			 
			 if(hWins + cWins == rounds) {
				 gameover = true;
			 }else {
				 gameover=false;
			 }
		 }if(cWins>hWins) {
			JOptionPane.showMessageDialog(null,"Final Results: \n Games Played: " + 
				     rounds +"\n"+name +" won " + hWins + " rounds \n Computer won: "+ cWins + " rounds. \n There were "
					+ ties+ " tie games \n Overall winner was the Computer haha");
		 }else {
			 JOptionPane.showMessageDialog(null,"Final Results: \n Games Played: " + 
				     rounds +"\n"+name +" won " + hWins + " rounds \n Computer won: "+ cWins + " rounds. \n There were "
					+ ties+ " tie games \n Overall winner was " + name + "!");
		 }
		 

	}

}
