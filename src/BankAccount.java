public class BankAccount
{
    public static void main(String[] args)
{
    //declare a variable called balance to hold the amount bob has right now
    double balance = 2175.37;

    balance -= 302.50; //minus
    balance += 50.03; //add
    balance -= balance / 2; //divide by half
    balance += 20.00; //add
    balance -= 1; //minus
    balance *= 2; //multiple the balance by 2
    balance += 1; //add

    //output new balance
    System.out.print( "Bob's new account balance is: " + balance);
    
}
}
