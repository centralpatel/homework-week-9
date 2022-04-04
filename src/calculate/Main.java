package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {

        char ch;
        int ans;
        Scanner cal = new Scanner(System.in);
        Calculator obj = new Calculator();

        while (true) {

            System.out.println("Enter first Number : ");
            int num = cal.nextInt();

            System.out.println("Enter second Number : ");
            int num1 = cal.nextInt();

            System.out.println("Enter symbol");
            ch = cal.next().charAt(0);

            obj.CalculateResult(num, num1, ch);

            System.out.println("Would you like to do more calculation please 'Y' or 'N'");
            char more = cal.next().charAt(0);

            if (more == 'N'|| more == 'n') {
                break;
            }
        }

    }
}
