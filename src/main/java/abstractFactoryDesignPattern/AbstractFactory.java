package abstractFactoryDesignPattern;

public interface AbstractFactory {

	abstract Bank getBank(String bankName);
	abstract Account getAccount(String accountType);
}
