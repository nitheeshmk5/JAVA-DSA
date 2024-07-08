package in.nitheeshmk.arrays.searching;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {10,1,20}
        };
        int target = 20;
        String res = search(arr,target);
        System.out.println(res);
    }
    static String search(int[][] arr,int tar){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {     // IMPORTANT : arr[row].length
                if(arr[i][j] == tar ){
                    return "["+i + " , " + j + "]";
                }
            }
        }
        return "False";
    }
}
