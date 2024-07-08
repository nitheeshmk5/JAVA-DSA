package in.nitheeshmk.arrays.searching;

public class EvenDigits1295 {
    public static void main(String[] args) {
        int[] arr = {11,1,111,22,33};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(evenDigit(num)){
                count++;
            }
        }
        return count;
    }

    static boolean evenDigit(int num){
        int digits = 0;
        while(num > 0){
            num = num / 10;
            digits++;
        }
        return digits % 2 == 0;
    }
}
