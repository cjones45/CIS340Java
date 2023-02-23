

import javax.swing.JOptionPane;

public class SelectionSort {

	public static void main(String args[]) {

	double[] list = {2.3,55.0, 19.5,23.0,11.9, 18.5,16,9,14.2, 10.4, 45.8, 34.9};
	 int i= 0;
	    String output = "";
	    while (i<list.length){
	    	output+= list[i] + " ";
	    	i++;
	    }

	    JOptionPane.showMessageDialog(null,"Array before sorting:\n" + output);

    for (i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      double currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }

    i= 0;
    output = "";
    while (i<list.length){
    	output+= list[i] + "  ";
    	i++;
    }

    JOptionPane.showMessageDialog(null,"Array after sorting:\n"+ output);
  }
}
