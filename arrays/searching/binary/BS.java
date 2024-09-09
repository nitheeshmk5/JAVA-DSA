package in.nitheeshmk.arrays.searching.binary;

public class BS {
    public static void main(String[] args) {
        int[] myArr = { 1,2,3,7,8,10 };
        System.out.println(BSearch(myArr , 1));
    }
    static int BSearch(int[] arr, int tar){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < tar){
                start = mid + 1;
            } else if (arr[mid] > tar) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return 1;
    }
}
