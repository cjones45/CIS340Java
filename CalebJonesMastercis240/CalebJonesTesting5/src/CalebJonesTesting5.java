import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
public class CalebJonesTesting5 {
   public static void main(String args[]) throws Exception {
      //Creating the File object
      InputStream inputStream = new FileInputStream("C:/Users/calebjones/eclipse-workspace/MyFile.txt");
      //Creating a Scanner object
      Scanner sc = new Scanner(inputStream);
      //StringBuffer to store the contents
      StringBuffer sb = new StringBuffer();
      //Appending each line to the buffer
      while(sc.hasNext()) {
         sb.append(" "+sc.nextLine());
      }
      System.out.println(sb);
   }
}