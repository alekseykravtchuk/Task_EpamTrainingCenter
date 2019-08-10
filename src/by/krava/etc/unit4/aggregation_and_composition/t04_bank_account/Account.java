package by.krava.etc.unit4.aggregation_and_composition.t04_bank_account;

class Account {

    private static long startId = 0;
    private long id;
    private double balance;
    private boolean isOpen = true;

    public Account(double balance) {
        this.balance = balance;
        this.id = ++startId;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getStatus() {
        String status = isOpen ? "Unlocked" : "Blocked";
        return String.format("Account %d %s.", id, status);
    }

    public void block(){
        isOpen = false;
    }

    public void unlock() {
        isOpen = true;
    }


}
