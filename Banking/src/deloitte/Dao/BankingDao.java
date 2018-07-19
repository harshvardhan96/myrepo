package deloitte.Dao;

public interface BankingDao {

	public void depositAmount(double amount);

	public double getBalance();

	public void withdrawAmount(double amount);

	public boolean Validate(String login, String pass);
}
