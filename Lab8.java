class LessBalanceExecption extends Exception {
    public LessBalanceExecption(double amount) {
        super("Withdraw amount (" + amount + "Rs) is not possible.");
    }
}

class Amount {
    double balance;
    static final double MIN_BALANCE = 500;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws LessBalanceExecption {
        if (amount > this.balance || (balance - amount) < MIN_BALANCE) {
            throw new LessBalanceExecption(amount);
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Lab8 {
    public static void main(String[] args) throws LessBalanceExecption {
        Amount obj1 = new Amount();

        obj1.deposit(1000);
        System.out.println("Current Balance: " + obj1.getBalance());
        obj1.withdraw(500);
        System.out.println("Balance after withdrawing: " + obj1.getBalance());
    }
}