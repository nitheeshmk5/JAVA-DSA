package in.nitheeshmk.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swap(arr,start,end);  // Two pointer method
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr ,int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
