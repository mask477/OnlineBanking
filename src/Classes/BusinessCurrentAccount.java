package Classes;

public class BusinessCurrentAccount extends CurrentAccount{

    public BusinessCurrentAccount(String AccountID, String AccountNo, double Balance) throws LowBalanceException {
        super(AccountID, AccountNo, Balance);
        if (Balance<30000){
            throw new LowBalanceException("Account no "+super.getAccountNo()+" have low balance");  
        }
    }
}
