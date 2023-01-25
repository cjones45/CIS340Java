import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CalebJonesPA06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int towns = getIntegerInput(true,0,false, 1,"How many towns? ", "Invalid Input");
		int[][] data = new int[4][towns];
		for(int i = 0; i == towns;i++) {
			data[0][i] = i;
			
		}
		

	}
	
	
	
	
	public static int getIntegerInput(boolean lowerLimitFlag, int lowerLimit, boolean upperLimitFlag,  
			 int upperLimit, String prompt, String errorMsg) {
		boolean validInput = false;
		int input = 1;
		while(validInput == false) {
			String tempString = JOptionPane.showInputDialog(prompt);
			input = Integer.parseInt(tempString);
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
