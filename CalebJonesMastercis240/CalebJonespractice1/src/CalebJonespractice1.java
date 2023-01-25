
public class CalebJonespractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[5];
		//get input from console
		myArray[0]=3;
		myArray[1]=18;
		myArray[2]=-2;
		myArray[3]=9;
		myArray[4]=8;
		averageValue(myArray);

	}
	 public static void averageValue (int [] input) {
		 int total = 0;
		 int count = 0;
			for(int i = 0;i <= input.length;i++) {
				input[i] += total;
				System.out.println("test");
			}
			total = total /5;
			System.out.println(total);
			
			
			for(int i = 0;i <= input.length;i++) {
				if(input[i] > total) {
				count++;
			}
				System.out.println(count);
			}
	 }
}
