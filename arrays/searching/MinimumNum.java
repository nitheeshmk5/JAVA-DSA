package in.nitheeshmk.arrays.searching;

public class MinimumNum {
    public static void main(String[] args) {
        int[] arr = {10,9,4,5,6,1};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int minimum = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
