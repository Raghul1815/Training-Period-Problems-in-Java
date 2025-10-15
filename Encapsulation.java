class BankAccount{
	private String accountHolder;
	private double amount;
	
	public void setAccountHolder(String name) {
		accountHolder = name;
		
	}
	public void setAmount(double a) {
		if(amount>=0)
		amount = a;
		else
			System.out.println("Invalid amount in the account");
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getAmount() {
		return amount;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		BankAccount bbt = new BankAccount();
		bbt.setAccountHolder("Raghul");
		bbt.setAmount(5000);
		
		System.out.println("User name : " + bbt.getAccountHolder());
		System.out.println("Amount having in the Account : "+ bbt.getAmount());

	}

}
