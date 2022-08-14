package ObjectFolder;

public class ObjectUtil {

    // 使用递归方法，计算1-100之间的和
    public int getSum(int n) {
        if(n == 1) {
            return n;
        } else {
            return n + getSum(n - 1);
        }
    }



    public void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public void swap(String i, String j) {
        String temp = i;
        i = j;
        j = temp;
    }




}
