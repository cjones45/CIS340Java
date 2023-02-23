

import javax.swing.JOptionPane;

public class InsertionSort {

	public static void main(String args[]) {

    double[] list= {15,4,6,8,17,22,3,1,45,2,9,14,29,34};

    String output = "";
    for (int i = 1; i < list.length; i++) {
    	output+= list[i] + "  ";
    }

    JOptionPane.showMessageDialog(null,"Array before sorting:\n" +output);

    for (int i = 1; i < list.length; i++) {
      /** insert list[i] into a sorted sublist list[0..i-1] so that
           list[0..i] is sorted. */
      double currentElement = list[i];
      int k;
      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
        list[k + 1] = list[k];
      }

      // Insert the current element into list[k+1]
      list[k + 1] = currentElement;
    }

    output = "";
    for (int i = 1; i < list.length; i++) {
    	output+= list[i] + "  ";
    }

    JOptionPane.showMessageDialog(null,"Array after sorting:\n" +output);
  }
}
