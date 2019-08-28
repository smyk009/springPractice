package abstractFactoryDesignPattern;

public class BankFactory implements AbstractFactory {

	@Override
	public Bank getBank(String bankName) {
		final String ICICI_BANK = "ICICI";
		final String YES_BANK = "YES";

		if (ICICI_BANK.equalsIgnoreCase(bankName)) {
			return new ICICIBank();
		} else if (YES_BANK.equalsIgnoreCase(bankName)) {
			return new YesBank();
		}
		return null;

	}

	@Override
	public Account getAccount(String accountType) {
		// TODO Auto-generated method stub
		return null;
	}

}
