package day41_Inheritance.Task02;
/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */
public class checkingAccount extends BankAccount{

    public void withDraw(int amout){
        balance -=amout;

    }
}
