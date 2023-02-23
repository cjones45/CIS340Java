

import javax.swing.JOptionPane;

public class LinearSearch {
  /** The method for finding a key in the list */
	public static void main(String args[]) {

		double[] list= {15,4,6,8,17,22,3,1,45,2,9,14,29,34};
		String message;
		String opt;



			 message= "Enter integer key:";
		   // get the answer from user
			 int key = Integer.parseInt(JOptionPane.showInputDialog(message));
	int index = -1;
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        index =  i;
    }



 	if (index < 0 )
 		JOptionPane.showMessageDialog(null, "key cannot be found");
 	else
 		JOptionPane.showMessageDialog(null, "key is found at index " + index);
  }
}
