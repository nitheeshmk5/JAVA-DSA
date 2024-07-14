package in.nitheeshmk.arrays.searching.binary;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,10,12,23};
        int target = 11;
        int ans = ceil(nums,target);
        System.out.println(ans);
    }
    static int ceil(int[] arr,int tar){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(tar > arr[mid]){
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return arr[end];
    }
}
