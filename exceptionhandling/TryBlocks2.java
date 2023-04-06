package exceptionhandling;

public class TryBlocks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = 70 / 0;
			System.out.println(n);
		} catch (ArithmeticException e) {
			System.out.println("exception occurs");
		} catch (Exception e1) {
			System.out.println("We can divide by zero " + e1);
		}
	}

}
