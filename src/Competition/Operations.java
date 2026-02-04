package Competition;

import java.util.Scanner;

public class Operations extends Person {
    Scanner scanner = new Scanner(System.in);

    public void register() {
        System.out.println("How many people will participate in the competition?");
        int persons = scanner.nextInt();
        scanner.nextLine();

        while (persons != 0) {
            System.out.println("Enter name");
            String pname = scanner.nextLine();
            System.out.println("Enter surname");
            String psurname = scanner.nextLine();
            System.out.println(pname + " " + psurname);
            persons--;
        }

        System.out.println("The participants in the competition were successfully registered.");

    }

    public void start() {
        System.out.println("The race started");

        System.out.println("Who do you think is the chosen one?");
        int secretrandom = (int) (Math.random() * 6);
        int guess;
        guess = scanner.nextInt();
        if (guess == secretrandom) {
            System.out.println("Congratulations");

        } else {
            System.out.println("You failed");
            System.out.println("Correct answer " + secretrandom);
        }

    }

    public void login() {
        Person p = new Person();
        System.out.println("Hello, Welcome to Competition");
        System.out.println("Please login system");

        System.out.println("Enter your username");
        String name = scanner.nextLine();
        p.setUsername(name);
        System.out.println("Enter your password");
        int psw = scanner.nextInt();
        scanner.nextLine();
        p.setPassword(psw);
        System.out.println("Succesfully login");
    }
}




