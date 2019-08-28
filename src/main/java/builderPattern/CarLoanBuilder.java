package builderPattern;

public class CarLoanBuilder implements LoanBuilder{
	Loan loan;
	
	public CarLoanBuilder() {
		super();
		this.loan = new Loan();
	}

	@Override
	public void loanApply() {
		System.out.println("Car Load Applied Successful");
		
	}

	@Override
	public void loanStatus() {
		System.out.println("Car Loan Approved");
		
	}
	
	

}
