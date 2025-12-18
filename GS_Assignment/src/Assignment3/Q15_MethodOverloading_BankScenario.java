package Assignment3;

class LoanCalculator{
	public void calculateLoan(int amount) {
		System.out.println("Loan Amount: "+amount);
	}
	public void calculateLoan(int amount, double interestRate) {
		System.out.println("Loan Amount: "+amount+" "+"Interest Rate: "+interestRate);
	}
}
public class Q15_MethodOverloading_BankScenario {

	public static void main(String[] args) {
		LoanCalculator obj = new LoanCalculator();
		obj.calculateLoan(1000);
		obj.calculateLoan(1500, 7.5);
	}

}
