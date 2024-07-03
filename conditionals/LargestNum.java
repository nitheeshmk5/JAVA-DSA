package in.nitheeshmk.conditionals;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

//        int max = a;
//        if (b > max){
//            max = a;
//        }
//        if (c > max){
//            max = c;
//        }

        int max = Math.max(c , Math.max(a,b));
        System.out.println(max);
    }
}