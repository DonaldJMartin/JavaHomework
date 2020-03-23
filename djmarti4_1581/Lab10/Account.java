public class Account {

    private static  int count;
    private String name;
    private String pin;
    private int id;
    private double balance;

    Account(String name, String pin) {

        this.name = name;
        this.pin = pin;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isPin(String pin) {
        if(pin.equals(this.pin)) {
            return true;
        }
        return false;
    }

    public double withdraw(double withdraw) {
        if(withdraw > 0 && balance >= withdraw) {
            balance = balance - withdraw;
        }
        return balance;
    }

    public String toString() {
        String s = "Name: %s, Account ID: %d, Balance: %.02f";
        return s ;
}


}
