package builderPattern;

public class BuilderPatternMain {

	public static void main(String[] args) {	
		LoanManager loanManager = new LoanManager(new CarLoanBuilder());
		loanManager.buildLoan();

	}

}
