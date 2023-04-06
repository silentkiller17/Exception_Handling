package exceptionhandling;

class InvalidDataException extends Exception
{
	String msg;
	
	public InvalidDataException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		
		return msg;
	}
	
}

public class StudentLogInException {
	void checkValid(String fname,String lname)throws InvalidDataException
	{
		if(fname.isEmpty() && lname.isEmpty())
		{
			throw new InvalidDataException("Student First and Last Name is missing");
		}
		else if(fname.isEmpty() )
		{
			
			throw new InvalidDataException("Student First Name is missing");

		}
		else if(lname.isEmpty() )
		{
			
			throw new InvalidDataException("Student Last Name is missing");

		}
		else
		{
			System.out.println("welcome  "+fname+" "+lname);
		}
		
	}
	public static void main(String[] args)  {
		Student s=new Student();
		s.setFname("Shital");
		s.setLname("Meshram");
		
	    StudentLogInException s1=new StudentLogInException();
	    try {
			s1.checkValid(s.getFname(),s.getLname());
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}