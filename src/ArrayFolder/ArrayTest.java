package ArrayFolder;

public class ArrayTest {

	public static void main(String[] args) {
				
		// int array initֵ
		int[] arr1 = new int[4];

		// short array initֵ
		short[] arr2 = new short[4];

		// float array initֵ
		float[] arr3 = new float[4];

		// char array initֵ
		char[] arr4 = new char[4];

		// boolean array initֵ
		boolean[] arr5 = new boolean[4];
		
		
		
		for(int i=0; i<arr1.length; i++) {
			
//			System.out.println("int arr1[" + i + "]: " + arr1[i]);
			System.out.printf("int arr1[%d]: %d \n",i, arr1[i]);
						
//			System.out.println("short arr2[" + i + "]: " + arr2[i]);
			System.out.printf("short arr2[%d]: %d \n",i, arr2[i]);
			
//			System.out.println("float arr3[" + i + "]: " + arr3[i]);
			System.out.printf("float arr3[%d]: %f \n",i, arr3[i]);
			
//			System.out.println("char arr4[" + i + "]: " + arr4[i]);
			System.out.printf("char arr4[%d]: %c \n",i, arr4[i]);
			
//			System.out.println("boolean arr5[" + i + "]: " + arr5[i]);
			System.out.printf("boolean arr5[%d]: %b \n",i, arr5[i]);
			
			
			System.out.println();			
		}


		
		
		/*
		 * 1. generate a random int array, include 10 elements
		 * 2. calculate all elements max, min, sum, average value 
		 * 3. all int number is greater than 10
		 */
		
		// 1. define a int array, include 10 elements, ransom int number
		int[] arr6 = new int[10];
		
		for(int i=0; i<arr6.length; i++) {
			arr6[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
			System.out.print("arr6[" + i + "]: " + arr6[i] + "\t");
		}
		System.out.println();
		

		// length
		System.out.println("int arr6.length: " + arr6.length);
		
		
		
		// 2. calculate all elements max, min, sum, average value 
		int maxValue = arr6[0];
		int indexMax = 0;
		
		int minValue = arr6[0];
		int indexMin = 0;

		int sum = arr6[0];
		int avg = 0;
		
		for(int i=1; i<arr6.length; i++) {	
			sum += arr6[i];
			
			if(maxValue < arr6[i]) {
				maxValue = arr6[i];				
				indexMax = i;
			} else if (minValue > arr6[i]) {
				minValue = arr6[i];
				indexMin = i;				
			}
		}
		System.out.println("maxValue = arr6[" + indexMax + "]: " + maxValue);
		System.out.println("minValue = arr6[" + indexMin + "]: " + minValue);
		System.out.println("sum: " + sum);
		System.out.println("average: " + sum/arr6.length);
		
		
		
	}
	
}
