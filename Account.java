//   1.3)create class Account

public class Account {
    double balance;
    double deposit;
    double withdraw;
    double amount;
    //Default constructor
    Account()
    {
      this.balance=0;
    }
    //Parameterized constructor
    Account(double deposit, double withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;
    }
     //Method for amount Deposit
    public void deposit(double a)
    {
       amount += this.deposit +a;
        System.out.println("Deposit amount "+a);
    }
    //Method for amount Withdraw
    public void withdraw(double a){
    if(this.amount<a){
        System.out.println("Insufficient Balance ");
    }else{
        this.amount -= a;
        System.out.println("Withdraw amount :"+a);
    }
    }
    //Method to Display Balance
    public void displayBalance(){
       double balance = (this.amount- withdraw);
        System.out.println("Balance is "+ balance);
    }
}

class Account_Main {
    public static void main(String[] args) {
        Account acc =new Account(30000,5000);

        acc.deposit(10000);
        acc.displayBalance();
        acc.withdraw(5000);
        acc.displayBalance();

    }
}

