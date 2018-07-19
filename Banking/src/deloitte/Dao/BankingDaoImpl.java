package deloitte.Dao;

public class BankingDaoImpl implements BankingDao {
private double balance;
private String login = "Deloitte";
private String pass = "del123";
@Override
public void depositAmount(double amount) {
	// TODO Auto-generated method stub
	 balance+= amount;
}

@Override
public double getBalance() {
	// TODO Auto-generated method stub
	return balance;
}

@Override
public void withdrawAmount(double amount) {
	// TODO Auto-generated method stub
	 balance-= amount;
}

@Override
public boolean Validate(String log, String password) {
	if(login.equals(log)&&pass.equals(password))
	{
		return true;
	}
	return false;
}

}
