package ArrayFolder;

/**
 * 自定义数组工具类
 */
public class ArrayUtil {


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

    // 反转数组
    public void reverse(int[] arr) {

    }

    // 复制数组
    public int[] copy(int[] arr) {
        return null;
    }

    // 数组排序
    public void sort(int[] arr) {

    }

    // 数组遍历输出
    public void print(int[] arr) {

    }

    // 查找指定数组元素
    public int getIndex(int[] arr, int dest) {
        return 0;
    }




}
