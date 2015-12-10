package Utility;

public class MobileBill extends Bill{

    public MobileBill(String BillID, String customerName, String duedate, boolean payStatus, double amount) {
        super(BillID, customerName, duedate, payStatus, amount);
    }
    
}
