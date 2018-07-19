package deloitte;

public interface BankingService {

	void depositAmount(double amount);
	double getBalance();
	void withdrawAmount(double amount);
	boolean Validate(String login, String pass);
}
