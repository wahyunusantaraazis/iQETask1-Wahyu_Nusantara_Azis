package PART2;

public class Problem1 {
    public static int pangkat(int a,int b){
        int pangkat = 1;
        for (int i = 1;i<=b;i++){
            pangkat *= a;
        }
        return pangkat;
    }
    public static void main(String[] args) {
        System.out.println(pangkat(2, 3));
        System.out.println(pangkat(5, 3));
        System.out.println(pangkat(10, 2));
        System.out.println(pangkat(2, 5));
        System.out.println(pangkat(7, 3));
    }
}
