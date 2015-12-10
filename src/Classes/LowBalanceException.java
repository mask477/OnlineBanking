package Classes;

class LowBalanceException extends Exception {
    @Override
    public String getMessage(){
        return "Insufficient Balance. try again with another amount";
    }
    public LowBalanceException(String msg) {
        super(msg);
    }
}