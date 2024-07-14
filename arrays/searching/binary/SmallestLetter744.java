package in.nitheeshmk.arrays.searching.binary;

public class SmallestLetter744 {
    public static void main(String[] args) {
        char[] letters = { 'c','f','j' };
        char target = 'f';
        char ans = smallLetter(letters,target);
        System.out.println(ans);
    }
    static char smallLetter(char[] arr,char tar){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(tar > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
