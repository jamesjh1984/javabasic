package FamilyAccount;

import java.util.Scanner;

public class Utility {

	private static Scanner scanner = new Scanner(System.in);

	
	
	private static String readKeyBoard(int limit) {
		
		String line = "";
		
		while(scanner.hasNext()) {
			line = scanner.nextLine();
			if (line.length() < 1 || line.length() > limit) {
				System.out.print("\nInput string length is not greater than (" + limit + "), please input again: ");
			}
			break;
		}
		return line;		
	}
	
	
	
	
	
	
	/*
	 * 用于界面菜单的选择，读取键盘，如果输入1-4中的任意字符，则返回，返回值为用户输入字符。
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.print("\nWrong select, please input again: ");
			} else break;
		}
		return c;
	}
	
	
	
	/*
	 * 用于金额的输入，从键盘读取一个不超过4位长度的整数，并返回值。
	 */
	public static int readNumber() {
		int n;
		for (;;) {
			String str = readKeyBoard(4);
						
			try {
				n = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				System.out.print("\nWrong number, please input again: ");
			}
		}
		return n;
	}
	
	
	

	
	/*
	 * 用于金额的输入，从键盘读取一个不超过8位长度的整数，并返回值。
	 */
	public static String readString() {
		String str = readKeyBoard(8);					
		return str;
	}
	
	
	
	
	/*
	 * 用于确认选择，读取键盘Y或N，返回值。
	 */
	public static char readConfirmSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if (c != 'Y' || c != 'N') {
				break;
			} else {
				System.out.print("Wrong select, please input again: ");
			};
		}
		return c;
	}	
	
	
	
	
}
