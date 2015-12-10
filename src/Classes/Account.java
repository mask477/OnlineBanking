package Classes;

import java.io.Serializable;

abstract class Account implements Serializable{
    private String AccountID, AccountNo;
    protected double Balance;
    
    Account(String AccountID, String AccountNo, double Balance){
        this.AccountID = AccountID;
        this.AccountNo = AccountNo;
        this.Balance = Balance;
    }
    
    String getAccountID(){
        return AccountID;
    }
    String getAccountNo(){
        return AccountNo;
    }
    double getBalance(){
        return Balance;
    }
    
    boolean validateBalance(double Amount){
        if (Amount > Balance)
            return false;
        return true;
    }
    
    void AddBalance(double Amount){
        this.Balance += Amount;
    }
    
    void subBalance(double Amount)throws Exception{
        this.Balance -= Amount;
    }
}
