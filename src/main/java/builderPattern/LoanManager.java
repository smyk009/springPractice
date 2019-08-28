package builderPattern;

public class LoanManager {
	
	private LoanBuilder loanBuilder;
	
	public LoanManager(LoanBuilder loanBuilder) {
		this.loanBuilder = loanBuilder;
	}
	
	public void buildLoan() {
		this.loanBuilder.loanApply();
		this.loanBuilder.loanStatus();
	}

}
