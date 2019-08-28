package abstractFactoryDesignPattern;

public class FactoryMain {
	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory accountFactory = factoryProducer.getFactory("ACCOUNT");
		Account savingAccount = accountFactory.getAccount("Saving Account");
		savingAccount.getAccountType();
//		Account currentAccount = accountFactory.getAccount("Current Account");
//		currentAccount.getAccountType();
	}

}
