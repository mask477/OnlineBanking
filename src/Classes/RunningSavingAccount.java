package Classes;

public class RunningSavingAccount extends SavingAccount{

    public RunningSavingAccount(String AccountID, String AccountNo, double Balance) {
        super(AccountID, AccountNo, Balance);
    }

    @Override
    double getProfit(double amount) {
        if (amount>limit){
            profit = amount*0.10;
            return profit;
        }
        return 0;
    }
}
