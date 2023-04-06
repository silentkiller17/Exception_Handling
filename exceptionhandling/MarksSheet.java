package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarksSheet {
	 void displayMarks(int marks)
	{ try {
		if (marks > 0 && marks < 100) {
	        System.out.println("marks is: " + marks);
	      } 
	      else {
	        throw new Exception("marks is less than or equal to 0");
	      }
	}
		catch (Exception e) {
		      System.out.println("Exception caught: " + e);
		    }
		    finally
		    {
		    	System.out.println("I'm always executed");
		    }
	
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			  
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("enter marks");
		    
		    int marks=Integer.parseInt(br.readLine());
		   MarksSheet m=new MarksSheet();
		   m.displayMarks(marks);
		   
		    
		  }
}