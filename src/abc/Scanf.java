package abc; 
import java.util.*;

public class Scanf {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in); 
		System.out.print("Enter Your name here: ");
		String input = name.nextLine(); 
		
		System.out.print("Your Age"); 
		int age = name.nextInt();
		System.out.println(input+" "+age);

	}

}
