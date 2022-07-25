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
	 * ���ڽ���˵���ѡ�񣬶�ȡ���̣��������1-4�е������ַ����򷵻أ�����ֵΪ�û������ַ���
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
	 * ���ڽ������룬�Ӽ��̶�ȡһ��������4λ���ȵ�������������ֵ��
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
	 * ���ڽ������룬�Ӽ��̶�ȡһ��������8λ���ȵ�������������ֵ��
	 */
	public static String readString() {
		String str = readKeyBoard(8);					
		return str;
	}
	
	
	
	
	/*
	 * ����ȷ��ѡ�񣬶�ȡ����Y��N������ֵ��
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
