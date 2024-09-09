package in.nitheeshmk.arrays.searching.binary;

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3,3,3};
        System.out.println(search(arr,1));
    }
    static int search(int[] arr, int tar){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == tar){
                return mid;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }

            if(arr[start] <= arr[mid])
            {
                if(arr[start] <= tar && tar <= arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] <= tar && tar <= arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
