package exceptionhandling;

public class ThrowKeys {
	public static void Age(int age) 
	{
		if (age < 18)
		{
			throw new ArithmeticException("Acces denied must be atleast 18");
		}else
		{
			 System.out.println("Person is eligible to watch  Movie!!");
		}
	}

	{
		System.out.println("Acces granted to watch Movie");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age(21);
	}

	}
