package abstractFactoryDesignPattern;

public class FactoryProducer {
	
	private static final String BANK = "BANK";
	private static final String ACCOUNT = "ACCOUNT";
	
	public static AbstractFactory getFactory(String factory) {
		if(BANK.equals(factory))
			return new BankFactory();
		else if(ACCOUNT.equals(factory))
			return new AccountFactory();
		return null;
	}

}
