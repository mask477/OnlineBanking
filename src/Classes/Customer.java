package Classes;

import java.io.Serializable;

public class Customer implements Serializable {
    private String Name, NIC, AccountNo, UserID, Password;
    Account acc;
    
    Customer(String Name, String NIC, String AccountNo, String UserID, String Password){
       this.Name = Name;
       this.NIC = NIC;
       this.AccountNo = AccountNo;
       this.UserID = UserID;
       this.Password = Password;
    }
    public String getName(){
        return Name;
    }
    public String getNIC(){
        return NIC;
    }
    public String getAccountNo(){
        return AccountNo;
    }
    public String getUserID(){
        return UserID;
    }
    public String getPass(){
        return Password;
    }
}
