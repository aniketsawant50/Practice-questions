class Bank {
    private double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
    }

    void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit of ₹" + depositAmount + " successful");
    }

    void displayBalance() {
        System.out.println("Total Balance: ₹" + amount);
    }
}

public class Bank1{
    public static void main(String[] args) {
        Bank b = new Bank(10000);           // Initial balance
        b.withdraw(5000);                   // Withdraw ₹5000
        b.deposit(5000);                    // Deposit ₹5000
        b.displayBalance();                 // Display final balance
    }
}
