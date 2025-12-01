class Bankaccount{
	private String accountholder;
	private int balance;
	
	Bankaccount(String name,int amount){
		accountholder = name;
		if (amount >= 0)
		    balance = amount;
		else
		    System.out.println("Invalid amount!");

		balance = amount;
	}
	public String getAccountholder() {
		return accountholder;
	}
	public int getBalance() {
		return balance;
	}
}
public class Encalsulation_Construction {

	public static void main(String[] args) {
		Bankaccount bbt = new Bankaccount("Raghul",5000);
		
		System.out.println("Name : " + bbt.getAccountholder());
		System.out.println("Balance amount : " + bbt.getBalance());
	}

}
