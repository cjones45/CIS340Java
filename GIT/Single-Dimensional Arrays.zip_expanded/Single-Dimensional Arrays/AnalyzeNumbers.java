

import javax.swing.JOptionPane;

public class AnalyzeNumbers {
  public static void main(String[] args) {

	  String message;
	    String input;


	    // Prompt the user to guess the number
	 	 message= "Enter the number of items: ";
	    // get the answer from user
	     input = JOptionPane.showInputDialog(message);

	  // convert answers to int
	  int n =   Integer.parseInt(input);


       double[] numbers = new double[n];
    double sum = 0;


    for (int i = 0; i < n; i++) {

    	message= "Enter Item " + (i+1) + " value:";
	    // get the answer from user
	     input = JOptionPane.showInputDialog(message);

      numbers[i] = Double.parseDouble(input);
      sum += numbers[i];
    }

    double average = sum / n;

    int count = 0; // The numbers of elements above average
    for (int i = 0; i < n; i++)
      if (numbers[i] > average)
        count++;

    JOptionPane.showMessageDialog(null,"Average is " + average);
    JOptionPane.showMessageDialog(null,"Number of elements above the average is "
      + count);
  }
}