package in.nitheeshmk.arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
