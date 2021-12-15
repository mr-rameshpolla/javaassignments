package abc;

public class ArraysTopic {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5}; 
		String emp[] = {"E415222","E2525544","E555652","E442225"};
		for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);

	}
		for (int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		} 
		
		for (String i: emp) {
			System.out.println(i);
		}

}
}