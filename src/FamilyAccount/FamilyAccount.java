package FamilyAccount;

public class FamilyAccount {

	public static void main(String[] args) {
		
		boolean isFlag = true;
		String accountDetail = "";
		int balance = 0;
		
		
		while(isFlag) {
			
			System.out.println("\n-------- Family account system --------\n");
			System.out.println("          1. Account detail");
			System.out.println("          2. Input income");
			System.out.println("          3. Input pay");
			System.out.println("          4. Logout \n");
			System.out.print("          Select(1-4):");
			
			char menuSelection = Utility.readMenuSelection();
			
			System.out.println();
			
			
			switch(menuSelection) {
			case '1':
//				System.out.println("1. Account detail \n");
				System.out.println("-------- Current account detail --------");
				System.out.println("type\ttotal\tvalue\tremark");
				System.out.println(accountDetail);
//				System.out.println("----------------------------------------\n");
				break;
			case '2':
//				System.out.println("2. Input income \n");
				System.out.println("Input income amount: ");
				int income = Utility.readNumber();
				balance += income;
				System.out.println("Input income remark: ");
				String remark2 = Utility.readString();
				
				accountDetail += "income\t" + balance + "\t" + income + "\t" + remark2 + "\n";
				
				System.out.println("Completed.");
				break;
			case '3':
//				System.out.println("3. Input pay \n");
				System.out.println("Input pay amount: ");
				int pay = Utility.readNumber();
				balance -= pay;
				System.out.println("Input pay remark: ");
				String remark3 = Utility.readString();
				
				accountDetail += "pay\t" + balance + "\t" + pay + "\t" + remark3 + "\n";
				
				System.out.println("Completed.");
				break;
			case '4':
//				System.out.println("4. Exit \n");
				System.out.println("Are you sure to exit(Y/N): \n");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y') {
					isFlag = false;
				}
				break;
			}
		}
		System.out.println("You are already exit.");
		
		
	}
	
}
