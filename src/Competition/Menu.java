package Competition;

import java.util.Scanner;

public class Menu  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations opera = new Operations();
        opera.login();
        System.out.println("Please select a options");

        String[] menu = {"1. Register competitors","2. Start the competition","3. Logout","4. Exit"};
        int options;

        do {
            System.out.println("*****************");
            for (String menus:menu){
                System.out.println(menus);
            }
            options=scanner.nextInt();
            switch (options){
                case 1:
                    opera.register();
                    //opera.printAll(menu);
                    break;
                case 2:
                    opera.start();
                    break;
                case 3:
                    opera.login();
                    break;
                case 4:
                    System.out.println("Bye, Thank you");
                    break;
                default:
                    System.out.println("Warning");

            }
        }while (options!=4);




    }
}
