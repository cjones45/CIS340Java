

import javax.swing.JOptionPane;



public class LottoNumbers {
  public static void main(String args[]) {
    int [] number = {12,13,22,15,10,12,1,5,6,9,22,23,25,21,14,15,18,19,6,9,5,9,11,13,14};
    boolean[] isCovered = new boolean[25]; // default false
    // Read all numbers and mark corresponding element covered

    /*while (i <= (number.length)-1) {
        System.out.print(i );
        i++;
      }*/

    int i = 0;
    while (i <= (number.length)-1) {

      if ( number[i] >0)
      isCovered[number[i] - 1] = true;

      i++;
    }

    // Check if all covered
    boolean allCovered = true; // Assume all covered
    for (i = 0; i < 25; i++)
      if (!isCovered[i]) {
        allCovered = false; // Find one number is not covered
        break;
      }

    // Display result
    if (allCovered)
    	JOptionPane.showMessageDialog(null,"The tickets cover all numbers");
    else
    	JOptionPane.showMessageDialog(null,"The tickets don’t cover all numbers");
  }
}
