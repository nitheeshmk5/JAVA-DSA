package in.nitheeshmk.arrays.searching;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Nitheesh";
        char tar = 'p';
        boolean res = findLetter(name,tar);
        System.out.println(res);
    }
    static boolean findLetter(String str,char target){
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
