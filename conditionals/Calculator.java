package in.nitheeshmk.conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operator : ");
            char op = in.next().trim().charAt(0);
            int ans = 0;

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.print("Enter two numbers : ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if (op == '+'){
                    ans = n1+n2;
                }
                if (op == '-'){
                    ans = n2 - n1;
                }
            } else if (op == 'x' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid !");
            }
            System.out.println(ans);
        }
    }
}
