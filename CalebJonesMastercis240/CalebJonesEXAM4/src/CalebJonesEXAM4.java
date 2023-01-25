//*************************************************************************** 
		//*  
		//* CIS 240                  Spring 2022                  Caleb Jones 
		//*  
		//*                         EXAM 4  
		//*  
		//* Class description (can be multiple lines) 
		//* This is my submission for the exam 4 program portion
		//*   
		//* 
		//*  
		//*  
		//*                         Date Created 
		//*  						(5/2/2022)
		//*                         File Name:  CalebJonesEXAM4 
		//*  
		//****************************************************************************
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class CalebJonesEXAM4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int studentCount = 0;
		double averageScore = 0;
		String topScoreName = " ";
		String lowScoreName = " ";
		double lowScore = 1;
		double topScore = 1;
		double tempScore = 0;
		String tempName;
		int tempId;
		int a = 0,b = 0,c = 0,d = 0,f = 0;
		
		FileInputStream fileByteStream = null;
		File input = new File("student.txt");
		Scanner sc = new Scanner(input);
	     
	      fileByteStream = new FileInputStream("students.txt");
	      sc = new Scanner(fileByteStream);

	     
		while (sc.hasNextLine()) {
			tempName = sc.nextLine();
			studentCount++;
			tempId = sc.nextInt();
			tempScore = sc.nextDouble();
			averageScore += tempScore;
			
			if(topScore < tempScore) {
				topScore = tempScore;
				tempName = topScoreName;
			}else if(lowScore > tempScore) {
				lowScore = tempScore;
				tempName = lowScoreName;
			}
			if(tempScore < 50) {
				f++;
			}else if(tempScore <= 65) {
				d++;
			}else if(tempScore <= 75) {
				c++;
			}else if(tempScore <= 85) {
				b++;
			}else if(tempScore >= 90) {
				a++;
			}
		}
		averageScore = averageScore / studentCount;
		
		FileOutputStream fileStream = new FileOutputStream("output.txt");
		
	
		PrintWriter out = new PrintWriter(fileStream);
		
		out.println("The records of " + studentCount + " students were read.");
		out.println("The average score was " + averageScore + ".");
		out.println(topScoreName+" had the highest score of " + topScore + ".");
		out.println(lowScoreName+" had the highest score of " + lowScore + ".");
		out.println("The grade distribution is as follows: ");
		out.println(a + "A");
		out.println(b + "B");
		out.println(c + "C");
		out.println(d + "D");
		out.println(f + "F");
	
	
		out.close();

	}

}
