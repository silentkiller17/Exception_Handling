package exceptionhandling;

public class Exception_Pg_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int[] numbers = {1,2,3};
    	   System.out.println(numbers[2]);
    	   int a=10;
    	   int b=5;
    	   int c=a/b;
    	   System.out.println(c);
	}
       catch(Exception e) {
    	   System.out.println("Some Error in code" +e);
       }
       finally {
    	   System.err.println("finally block");
       }

	}
	}
