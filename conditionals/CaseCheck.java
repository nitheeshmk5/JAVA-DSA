package in.nitheeshmk.conditionals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        // int as = ch;

//        if (as < 97){
//            System.out.println("It is Capital letter");
//        }
//        else{
//            System.out.println("Its in LowerCase");
//        }
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        } else
            System.out.println("Some error !");
        }
}


