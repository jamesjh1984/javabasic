package ArrayFolder;

import java.util.Arrays;

public class ArraySortingTest {


    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }



     // 1. 冒泡排序
    private static void popSort(int[] data) {
        
        System.out.println("1. popSort...");

        for(int i=0; i<data.length-1; i++) {
            for(int j=0; j<data.length-1-i; j++) {
                if(data[j] > data[j+1]) {

                    swap(data, j, j+1);

                    // int temp = data[j];
                    // data[j] = data[j+1];
                    // data[j+1] = temp;
                }
            }		
		}
    }





    // 2. 快速排序
    private static void subSort(int[] data, int begin, int end) {
        if(begin < end) {
            int base = data[begin];
            int low = begin;
            int high = end + 1;
            while(true) {
                while(low < end && data[++low] - base <=0);
                while(high > begin && data[--high] - base >=0);
                if(low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, begin, high);

            subSort(data, begin, high - 1);
            subSort(data, high + 1, end);
        }
    }
    private static void quickSort(int[] data) {

        System.out.println("2. quickSort...");

        subSort(data, 0, data.length - 1);
    }





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
        // popSort(arr);



        // 2. 快速排序，20世纪十大算法之一
        // quickSort(arr);

        

        // 3. Arrays.sort
        System.out.println("3. Arrays.sort...");
        Arrays.sort(arr);



        System.out.print("Sorted array => ");
        System.out.print(Arrays.toString(arr));

    }
}    
