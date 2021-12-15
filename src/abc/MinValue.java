package abc;

public class MinValue {

	public static void main(String[] args) {
		int a[] = {5,4,7,6,8,4,35,48,5,2,8}; 
		int result = 0;
		for (int i=0;i<(a.length)-1;i++) {
			int min = a[0];
			if (min<a[i+1]) {
				result = a[i];
			}
		}
	   System.out.println(result);

	}

}
