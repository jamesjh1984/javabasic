package loop;

public class forTest {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			System.out.printf("Hello World! + %d \n", i);
//		}	
		
		
		
		
		
		// 0-100的偶数，求和
		int sum = 0;
		int count = 0;
		for(int i=1; i<=100; i++) {
			if (i%2==0) {
				System.out.println(i);
				sum = sum + i;
				count++;
			}
		}
		System.out.println("sum is: " + sum);
		System.out.println("count is: " + count);
		
		
		
		
		
		
		// 9*9乘法表
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i + "*" + j + "=" + (i * j) + " ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
	}
	
}
