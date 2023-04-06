package exceptionhandling;

public class ClassNotFoundExceptionEx {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	
		try {
			Class.forName("exceptionhandlings.CheckExceptions");
			ClassLoader.getSystemClassLoader().loadClass("exceptionhandlings.CheckExceptions");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Not Found "+ e);
		}
		
	}

}