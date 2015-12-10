package Classes;

public class FixDepositSavingAccount extends SavingAccount{

    public FixDepositSavingAccount(String AccountID, String AccountNo, double Balance) {
        super(AccountID, AccountNo, Balance);
    }

    @Override
    double getProfit(double amount) {
        if (amount>limit){
            profit=amount*0.15;
            return profit;
        }
        return 0;
    }
}
