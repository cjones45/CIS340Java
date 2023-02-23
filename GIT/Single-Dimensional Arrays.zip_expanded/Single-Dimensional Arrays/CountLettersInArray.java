

import javax.swing.JOptionPane;

public class CountLettersInArray {
  /** Main method */
  public static void main(String[] args) {

	// Declare and create an array
	  char[] chars = new char[100];

	    // Create lowercase letters randomly and assign
	    // them to the array
	    for (int i = 0; i < chars.length; i++)
	      chars[i] = RandomCharacter.getRandomLowerCaseLetter(); // this method randomly gives a lower case letter



    // Display the array
	    String output = "";
	    JOptionPane.showMessageDialog(null,"The lowercase letters are:");
	 // Display the characters in the array 20 on each line
	    for (int i = 0; i < chars.length; i++) {
	      if ((i + 1) % 20 == 0)
	        output+=chars[i] + "\n";
	      else
	        output+= chars[i] + " ";
	    }

	    JOptionPane.showMessageDialog(null,output);


    // Count the occurrences of each letter
    int[] counts = new int[26];
    // For each lowercase letter in the array, count it
    for (int i = 0; i < chars.length; i++)
      counts[chars[i] - 'a']++;

    // Display counts
    output = "";
    JOptionPane.showMessageDialog(null,"The occurrences of each letter are:");
    for (int i = 0; i < counts.length; i++) {
        if ((i + 1) % 10 == 0)
          output+=counts[i] + " " + (char)(i + 'a') +"\n";
        else
          output+=counts[i] + " " + (char)(i + 'a') + " ";
      }

    JOptionPane.showMessageDialog(null,output);
  }


}
