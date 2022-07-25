package loop;

public class doWhileTest {
	
	public static void main(String[] args) {
		
		// 0-100的偶数，求和
		int i = 1;
		int sum = 0;
		int count = 0;
		
		do {
			if(i % 2 == 0) {
				System.out.println(i);
				sum = sum + i;
				count++;
			}
			i++;
		} while(i <= 100);		

		System.out.println("sum is: " + sum);
		System.out.println("count is: " + count);
		
	}
}
