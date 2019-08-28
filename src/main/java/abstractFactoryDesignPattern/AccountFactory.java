package abstractFactoryDesignPattern;

public class AccountFactory implements AbstractFactory {

	final String CURRENT_ACCOUNT = "Current Account";
	final String SAVING_ACCOUNT = "Saving Account";

	public Account getAccount(String accountType) {
		if (CURRENT_ACCOUNT.equals(accountType)) 
			return new CurrentAccount();
		else if (SAVING_ACCOUNT.equals(accountType))
			return new SavingAccount();
		return null;

	}

	@Override
	public Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}
}
