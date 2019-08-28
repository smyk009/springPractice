package abstractFactoryDesignPattern;

public class CurrentAccount implements Account {

	@Override
	public void getAccountType() {
		System.out.println("Current Account");

	}

}
