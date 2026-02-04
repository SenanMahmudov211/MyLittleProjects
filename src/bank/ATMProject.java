package bank;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {

        System.out.println("Welcome to ATM");
        System.out.println("****************");
        System.out.println("Please select a options");

        String[] menu = {"1. BALANCE","2. DEPOSIT","3. WITHDRAW","4. TRANSACTIONS","5. EXIT"};
        Scanner scanner =new Scanner(System.in);
        Account account =new Account(30);
        int option;
        double amount;
        do {
            System.out.println("**************");
            for (String menus:menu){
                System.out.println(menus);
            }
            option=scanner.nextInt();
            switch (option){
                case 1:
                    account.showBalance();
                break;
                case 2:
                    System.out.println("Enter deposit amount");
                    amount=scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount");
                    amount=scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 4:
                   account.showTransactions();
                    break;
                case 5:
                    System.out.println("Bye, Thank you");
                    break;
                default:
                    System.out.println("Warning");


            }
        }while (option!=5);
    }
}
