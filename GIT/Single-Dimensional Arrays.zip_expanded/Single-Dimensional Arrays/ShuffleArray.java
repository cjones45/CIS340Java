import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rgen = new Random();  // Random number generator		
		
		int[] array = {2, 5, 6, 7, 9, 8, 3, 1, 10, 4};
 
		
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
 
		System.out.print("array elements after shuffeling: ");
		for(int s: array)
			System.out.print(s + " ");
		System.out.println();
		
		
		////////////////////////// Restricted shuffling, each number is shuffled one time
		
		String[] myList = {"Alice","Bob","Jon","Kiley","Albares","Willard", "Francine","Shinko","Gillian"};
		
		for (int i = myList.length-1; i >0 ; i--) {
			
			//generate an index j randomly with 0 <= j <= i
			int j= (int) (Math.random() * (i+1));
			
			// Swap myList[i] with myList[j]
			String temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
	    
		}
		
		System.out.print("myList elements after shuffeling: ");
		for(String s: myList)
			System.out.print(s + " ");

	}

}
