package factoryDesignPattern;

public class AccountFactory {

	final String CURRENT_ACCOUNT = "Current Account";
	final String SAVING_ACCOUNT = "Saving Account";

	public Account getAccount(String accountType) {
		if (CURRENT_ACCOUNT.equals(accountType)) 
			return new CurrentAccount();
		else if (SAVING_ACCOUNT.equals(accountType))
			return new SavingAccount();
		return null;

	}
}
