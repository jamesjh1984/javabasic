package ArrayFolder;

public class TwoDimArrayTest {

	public static void main(String[] args) {

		// one dimension array
		int[] arr1 = new int[]{1,2,3};
		
		// two dimensions array
		int[][] arr2 = new int[][]{{1,2,3},{4,5,6},{7,8}};
		

		// first row + second column
		System.out.println("int arr2[0][1]: " + arr2[0][1]);
		
		
		// length
		System.out.println("int arr2.length: " + arr2.length);
		System.out.println("int arr2[0].length: " + arr2[0].length);
		System.out.println("int arr2[2].length: " + arr2[2].length);



		System.out.println();
		System.out.println("----- for loop -----");

		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println("int arr2["+i+"]["+j+"]: " + arr2[i][j]);				
			}
			System.out.println();
		}
			
		
		
	}

}
