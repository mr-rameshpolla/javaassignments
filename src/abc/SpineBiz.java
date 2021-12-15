

package abc; 
import java.util.*;


class Ramesh{
	public int Age(int age) {
		return age;
	}
}

public class SpineBiz {
	
		public int EmpDetails(int a, int b) {
			return a+b;
		}
	

	public static void main(String[] args) {
		SpineBiz obj = new SpineBiz();
		int result  = obj.EmpDetails(542,756); 
		System.out.println(result); 
		Ramesh obj2 = new Ramesh();
		int result2 = obj2.Age(24);
		System.out.println(result2);

	}

}
