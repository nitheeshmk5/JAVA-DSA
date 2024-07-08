package in.nitheeshmk.arrays.searching;

public class MaxWealth1672 {
    public static void main(String[] args) {
        int[][] acc = {
                {1,2},
                {10,18},
                {10,10}
        };
        int res = maximumWealth(acc);
        System.out.println(res);
    }
    static int maximumWealth(int[][] accounts) {
        int max = accounts[0][0];
        for (int i = 0; i < accounts.length ; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
