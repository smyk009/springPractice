package builderPattern;

public class PersonalLoanBuilder implements LoanBuilder {
	Loan loan;
	
	public PersonalLoanBuilder() {
		super();
		this.loan = new Loan(); 
	}

	@Override
	public void loanApply() {
		System.out.println("Personal Load Applied Successful");
		
	}

	@Override
	public void loanStatus() {
		System.out.println("Personal Loan Approved");
		
	}

}
