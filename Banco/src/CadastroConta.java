public class CadastroConta {
    private int number;
    private String holder;
    private double balance;


    public CadastroConta(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public CadastroConta(int number, String holder, double primeiroDeposito) {
        this.number = number;
        this.holder = holder;
        deposit(primeiroDeposito);
    }


    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString() {
        return  "Account"
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}

