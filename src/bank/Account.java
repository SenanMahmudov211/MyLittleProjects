package bank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private double balance;
    private List<Transactions> transactions =new ArrayList<>();

    public Account(double balance){
        this.balance=balance;
    }
    public void showBalance(){
        System.out.println("Current balance: "+balance+" AZN");
    }
    public void deposit(double amount){
    balance+=amount;
    Transactions transactions1 = new Transactions(amount,TransactionType.DEPOSIT, LocalDateTime.now());
    transactions.add(transactions1);
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Enter less amount");

        }
        else {
            balance-=amount;
            Transactions transactions1 = new Transactions(amount,TransactionType.WITHDRAW, LocalDateTime.now());
            transactions.add(transactions1);
        }
    }
    public void showTransactions(){
        for (Transactions actions :transactions){
            System.out.println(actions);
        }
    }

}

