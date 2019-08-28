package abstractFactoryDesignPattern;

public class SavingAccount implements Account {

	@Override
	public void getAccountType() {
		System.out.println("Savings Account");
	}

}
