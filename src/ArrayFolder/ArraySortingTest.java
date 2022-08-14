package ArrayFolder;

import java.util.Arrays;

public class ArraySortingTest {



	public static void main(String[] args) {
	
        // generate a random int array
        int[] arr = new int[20];
        
        for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
		}
		System.out.print("Random array => ");
        System.out.print(Arrays.toString(arr));
		System.out.println();



        
        // 1. 冒泡排序, 
//        ArrayUtil.popSort(arr);



        // 2. 快速排序，20世纪十大算法之一
        ArrayUtil.quickSort(arr);

        

        // 3. Java自带Arrays.sort
//        System.out.println("3. Arrays.sort...");
//        Arrays.sort(arr);



        System.out.print("Sorted array => ");
        System.out.print(Arrays.toString(arr));

    }
}    
