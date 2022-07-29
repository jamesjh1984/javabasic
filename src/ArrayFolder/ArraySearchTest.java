package ArrayFolder;

public class ArraySearchTest {

	public static void main(String[] args) {
	

        // 1. 线性查找
		// String[] arr1 = new String[]{"AA","BB","CC","DD","EE","FF","GG"};
        // String destString = "MM";
        // boolean isFlag = true;
		
		// for(int i=0; i<arr1.length; i++) {

        //     if(destString.equals(arr1[i])){
        //         System.out.print("Has found this element, index is: " + i + "\n");
        //         isFlag = false;
        //         break;
        //     }			
		// }
        // if(isFlag) {
        //     System.out.print("Sorry, do not find it...");
        // }




        // 2. 二分法查找，前提必须是有序的
        int[] arr2 = new int[]{-98,-66,-37,0,12,56,78,99,187,256};
        int desInt = 200;
        int beginIndex = 0;// 起始索引
        int endIndex = arr2.length - 1; // 末尾索引
        boolean isFlag2 = true;

        while(beginIndex <= endIndex) {
            int middleIndex = (beginIndex + endIndex)/2;

            if(desInt == arr2[middleIndex]){
                System.out.print("Has found this element, index is: " + middleIndex + "\n");
                isFlag2 = false;
                break;
            } else if(arr2[middleIndex] > desInt) {
                endIndex = middleIndex - 1;
            } else {
                beginIndex = middleIndex + 1;
            }
        }        
        if(isFlag2) {
            System.out.print("Sorry, do not find it...");
        }
    }
}    
