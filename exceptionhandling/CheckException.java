package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name ");
		System.out.println("Enter your age ");
		System.out.println("Enter your percentage ");
		try {
			String name = br.readLine();
			int age = Integer.parseInt(br.readLine());
			float percentage=Float.parseFloat(br.readLine());
			System.out.println("My name is:" + name);
			System.out.println("My age is:" + age);
			System.out.println("My percentage are:" + percentage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
