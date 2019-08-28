package factoryDesignPattern;

public class FactoryMain {
	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		Account savingAccount = accountFactory.getAccount("Saving Account");
		savingAccount.getAccountType();
		Account currentAccount = accountFactory.getAccount("Current Account");
		currentAccount.getAccountType();
	}

}
