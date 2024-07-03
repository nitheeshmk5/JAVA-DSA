package in.nitheeshmk.conditionals;

import java.util.Scanner;

public class CountOccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int search = in.nextInt();
        int rem;
        int count = 0;

        while (num > 0){
            rem = num % 10;
            if (rem == search){
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);
    }
}
