public class Exception_07 {
    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(500000);
    try{
        System.out.println("Số dư ban đầu: " + bankAccount.getBalance() + " VNĐ");
        bankAccount.findOut(700000);
    } catch (InsufficientFundsException e){
        System.out.println("Giao dịch không thể thực hiện"+ e.getMessage());
    }
}
}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void findOut(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("\nSố dư không đủ để thực hiện giao dịch");
        }
        balance -=amount;
        System.out.println("Rút thành công "+ amount+" VNĐ. Số dư còn lại là: "+ balance);
    }
}
