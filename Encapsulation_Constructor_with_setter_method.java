class Bankaccountt{
	private String accountholder;
	private int balance;
	
	Bankaccountt(String name,int amount){
		accountholder = name;
		if(amount >= 0) {
			balance = amount;
		}
		else {
			balance = 0;
			System.out.println("Invalid balance!!");
		}
	}
		public void deposit(int amount) {
			if(amount>0) {
				balance +=amount;	
			}
			else {
				System.out.println("Invalid deposit amount");
			}
		}
			public void withdraw(int amount) {
				if(amount>0 && amount <=balance) {
					balance -= amount; 
				}
				else {
					System.out.println("Insufficient balance!!");
				}
			}
		
		public String getAccountholder() {
			return accountholder;
		}
		public int getAmount() {
			return balance;
		}
	
}
public class Encapsulation_Constructor_with_setter_method {

	public static void main(String[] args) {
		Bankaccountt acc = new Bankaccountt("Raghul ⚡", 5000);

        System.out.println("Holder: " + acc.getAccountholder());
        System.out.println("Initial Balance: " + acc.getAmount());

        acc.deposit(2000);
        System.out.println("After Deposit: " + acc.getAmount());

        acc.withdraw(1000);
        System.out.println("After Withdraw: " + acc.getAmount());

        acc.withdraw(7000); 

	}

}
