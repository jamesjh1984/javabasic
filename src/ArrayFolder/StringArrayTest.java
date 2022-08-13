package ArrayFolder;

public class StringArrayTest {

	public static void main(String[] args) {
		
		String[] arr1 = new String[]{"AA","BB","CC","DD","EE","FF","GG"};
		

		// array reverse #1
		for(int i=0; i<arr1.length/2; i++) {
			String temp = arr1[i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = temp;
		}

		
		
		// array reverse #2
//		for(int i=0,j=arr1.length-1; i<j; i++,j--) {
//			String temp = arr1[i];
//			arr1[i] = arr1[j];
//			arr1[j] = temp;
//		}
		
		
		
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
	}

		
}
