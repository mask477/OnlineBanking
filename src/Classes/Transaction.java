package Classes;

public class Transaction {
    public void fundsTransfer(Account src, Account dest, double amount) throws Exception{
        boolean status=true;
        while (status){
            try {
                src.subBalance(amount);
                status=false;
            }catch(LowBalanceException e){
                System.out.println(e.getMessage());
            }
        }
        dest.AddBalance(amount);
    }
}
