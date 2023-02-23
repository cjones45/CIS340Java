

import javax.swing.JOptionPane;

public class Calculator {
  /** Main method */
  public static void main(String[] args) {
    // Check number of strings passed
   int [] numbers = {15,20};

   String message;
   String opt;



	 message= "\nDetermine the operator:  +, -, *, or / \n to perform on numbers \n"
	 + numbers[0] + " and " + numbers[1];
   // get the answer from user
    opt = JOptionPane.showInputDialog(message);



    // The result of the operation
    int result = 0;

    // Determine the operator
    switch (opt.charAt(0)) {
      case '+': result = numbers[0] + numbers[1];
                break;
      case '-': result = numbers[0] - numbers[1];
                break;
      case '.': result = numbers[0] * numbers[1];
                break;
      case '/': result = numbers[0] / numbers[1];
    }

    // Display result
    JOptionPane.showMessageDialog(null,numbers[0] + ' ' + numbers[1] + ' ' + opt.charAt(0)
      + " = " + result);
  }
}
