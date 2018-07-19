package deloitte;
import deloitte.Dao.BankingDao;
import deloitte.Dao.BankingDaoImpl;

public class BankingServiceImpl implements BankingService {	
	private BankingDao bDao;
	public BankingServiceImpl()
	{
		bDao = new BankingDaoImpl();
	}

	@Override
	public void depositAmount(double amount) {
		// TODO Auto-generated method stub
		bDao.depositAmount(amount);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return bDao.getBalance();
	}

	@Override
	public void withdrawAmount(double amount) {
		// TODO Auto-generated method stub
		bDao.withdrawAmount(amount);
	}

	@Override
	public boolean Validate(String login, String pass) {
		// TODO Auto-generated method stub
		return bDao.Validate(login,pass);
	}

}
