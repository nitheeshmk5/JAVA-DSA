package in.nitheeshmk.patterns;

public class Simple {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n ; i++) {
            // logic
            int spaces = n - i;
            //System.out.println(spaces);
            for (int gap = spaces; gap < n; gap++) {
                System.out.print(" ");
            }
            //System.out.print(i);
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
