package ArrayFolder;

import ObjectFolder.ObjectUtil;

/**
 * 自定义数组工具类
 */
public class ArrayUtil {


    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }



    // 求数组最大值
    public int getMax(int[] arr) {

        int maxValue = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    // 求数组最小值
    public int getMin(int[] arr) {

        int minValue = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        return minValue;
    }

    // 求数组总和
    public int getSum(int[] arr) {

        int sum = arr[0];

        for(int i=1; i<arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }



    // 求数组平均值
    public int getAvg(int[] arr) {

        int sum = arr[0];
        int avg = 0;

        for(int i=1; i<arr.length; i++) {
            sum += arr[i];
        }
        avg = sum/arr.length;

        return avg;
    }

    // 反转int数组
    public void reverse(int[] arr) {

        // array reverse #1
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

    }

    // 反转String数组
    public void reverse(String[] arr) {

        // array reverse #1
        for(int i=0; i<arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }


        // array reverse #2
//		for(int i=0,j=arr1.length-1; i<j; i++,j--) {
//			String temp = arr1[i];
//			arr1[i] = arr1[j];
//			arr1[j] = temp;
//		}

    }

    // 复制数组
    public int[] copy(int[] arr) {
        return null;
    }




    // 1. 冒泡排序
    public static void popSort(int[] arr) {
        System.out.println("1. popSort...");

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {

                    swap(arr, j, j+1);

                    // int temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;
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
                    ArrayUtil.swap(data, low, high);
                } else {
                    break;
                }
            }
            ArrayUtil.swap(data, begin, high);

            subSort(data, begin, high - 1);
            subSort(data, high + 1, end);
        }
    }
    public static void quickSort(int[] data) {

        System.out.println("2. quickSort...");

        subSort(data, 0, data.length - 1);
    }






    // 数组遍历输出
    public void print(int[] arr) {

    }

    // 查找指定数组元素
    public int getIndex(int[] arr, int dest) {

        return arr[dest];
    }




}
