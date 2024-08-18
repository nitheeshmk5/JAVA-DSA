package in.nitheeshmk.strings;

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        String a = "Nitheesh";
        String b = "Nitheesh";

        System.out.println(a == b);

        String a1 = new String("Nitheesh");
        String a2 = new String("Nitheesh");
        // strings are immutable !
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        String add = "1.1.1.1";
        add = add.replace("." ,"[]");
        System.out.println(add);
    }
}
