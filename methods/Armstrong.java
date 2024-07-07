package in.nitheeshmk.methods;

public class Armstrong {
    public static void main(String[] args) {
        for (int i = 0; i < 1000;i++){
            if(isArm(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArm(int n){
        int copy = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == copy;
    }

}
