package in.nitheeshmk.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userData = inp.nextLine();
        System.out.println(userData.equals(myReverse(userData)));
    }

    static String myReverse(String data) {
        StringBuilder sb = new StringBuilder(data);
        sb.reverse();
        return sb.toString();
    }
}
