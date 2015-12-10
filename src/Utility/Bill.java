package Utility;

public class Bill {
    protected String BillID, customerName, duedate;
    protected boolean payStatus;
    double BillAmount;
    
    Bill(String BillID,String customerName, String duedate,boolean payStatus, double amount){
        this.BillID=BillID;
        this.customerName=customerName;
        this.duedate=duedate;
        this.payStatus=payStatus;
        this.BillAmount=amount;
    }
    boolean getPayStatus(){
        return payStatus;
    }
    void setPayStatus(boolean newStatus){
        payStatus=newStatus;
    }
    String getBillID(){
        return BillID;
    
    }
}
