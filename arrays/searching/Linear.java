package in.nitheeshmk.arrays.searching;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 0;

        Boolean res = LinearSeach(arr,target);
        System.out.println(res);
    }

    static Boolean LinearSeach(int[] arr,int tar){
        if (arr.length == 0){
            return false;
        }
        for(int i : arr){
            if (tar == i){
                return true;
            }
        }
        return false;
    }
}

