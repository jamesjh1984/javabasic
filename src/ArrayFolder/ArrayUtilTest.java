package ArrayFolder;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        // generate a random int array
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }
        System.out.print("Random array => ");
        System.out.print(Arrays.toString(arr));
        System.out.println();

        int maxInt = arrayUtil.getMax(arr);
        System.out.println("maxInt => " + maxInt);

        int minInt = arrayUtil.getMin(arr);
        System.out.println("minInt => " + minInt);

        int sumInt = arrayUtil.getSum(arr);
        System.out.println("sumInt => " + sumInt);

        int avgInt = arrayUtil.getAvg(arr);
        System.out.println("avgInt => " + avgInt);



    }

}
