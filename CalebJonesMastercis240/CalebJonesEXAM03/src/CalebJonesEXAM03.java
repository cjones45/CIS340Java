
public class CalebJonesEXAM03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		intArray[0]=92;
		intArray[1]=-4;
		intArray[2]=11;
		intArray[3]=120;
		intArray[4]=43;
		
		double[] dubArray = new double[6];
		dubArray[0]=4.5;
		dubArray[1]=-3.14;
		dubArray[2]=18;
		dubArray[3]=3204.72;
		dubArray[4]=8645;
		dubArray[5]=2.7;


	}
	
	public static void arrayMagic (double [] values) {
		double min = values[0];
		double max = 0;
		double temp = 0;
		int locationMin = 0;
		int locationMax = 0;
		for(int i = 0; i < values.length-1;i++) {
			if(min > values[i]) {
				locationMin = i;
				values[i] = min;
			}
			if(max < values[i]) {
				locationMax = i;
				values[i] = max;
			}
		}
		//swap
		temp = values[locationMax];
		values[locationMax] = values[locationMin];
		values[locationMin] = temp;
		
	}
		
	public static void arrayMagic (int [] values) {
		for(int i = 0; i < values.length-1;i++) {
			int temp = values[i+2];
			values[i+2] = values[i];
			values[i] = temp;
		}
	}
	public int arrayMagic (String [] values) {
		int count = 0;
		for(int i = 0; i < values.length-1;i++) {
			count++;
			
		}
		return count;
	}
	
}
