package Assignment3;

class Account{
	private String accountHolderName;
	private double balance;
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance<0) {
			System.out.println("WARNING: Shouldnot accept Negative values");
			}
		else {
			this.balance = balance;
			
		}
	}
	public void display() {
		System.out.println("Holder Name: "+accountHolderName+"  "+"Account Balance: "+ balance);

	}
}	 
public class Q12_EncapsulationValidationLogic {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.getAccountHolderName();
		obj.setAccountHolderName("Revathy");
		obj.getBalance();
		obj.setBalance(10000);
		obj.display();
		System.out.println();
		
		Account obj1 = new Account();
		obj1.getAccountHolderName();
		obj1.setAccountHolderName("Akhil");
		obj1.getBalance();
		obj1.setBalance(-200);
		obj1.display();
		}
}
