package Package1;

public class BankAccount {
    private int Account_number;
    private String Account_name;
    private double Account_balance;

    public BankAccount(int Account_number,String Account_name, double Account_balance){
this.Account_number= Account_number;
this. Account_name= Account_name;
this.Account_balance= Account_balance;
    }

    public void depositAmmount(int amount){
        System.out.println(Account_balance+amount);
    }

    public void withdrawAmmount(int amount2){
        System.out.println(Account_balance-amount2);
    }
}
