//Encapsulation Program using getter setter for ATM Machine
class Bank
{
    double bankBalance;
    void setBalance(double balance)
    {
        if(balance > 0) bankBalance += balance;
        else System.out.println("Amount is invalid intial deposit failer balance is 0");
    }
    double getBalance()
    {
        return bankBalance;
    }
    void withdrawAmount(double amount)
    {
        if(amount < 0 || amount >= bankBalance)
        {
            System.out.println("Invalid amount, Please Try Again!");
            return;
        }
        bankBalance -= amount;
        System.out.println("$"+amount+" debited, New Balance is "+bankBalance);
    }
    void depositAmount(double amount)
    {
        if(amount < 0)
        {
            System.out.println("Invalid amount, Please Try Again!");
            return;
        }
        bankBalance += amount;
        System.out.println("$"+amount+" Credited, New Balance is "+bankBalance);
    }
}
public class Main{
    public static void main (String[] args) {
        Bank jeeva = new Bank();
        //Initial time activation 
        jeeva.setBalance(2000);
        System.out.println("Your bank balance is $"+jeeva.getBalance());
        jeeva.withdrawAmount(-200);
        System.out.println("Your bank balance is $"+jeeva.getBalance());
        jeeva.depositAmount(120200);
        System.out.println("Your bank balance is $"+jeeva.getBalance());
    }
}
