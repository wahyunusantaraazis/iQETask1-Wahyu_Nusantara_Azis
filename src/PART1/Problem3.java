package PART1;

public class Problem3 {
    public static void main(String[] args) {

        int nilai = 6;
        int tambah = 6;
        for (int i = 1; i <= nilai; i++) {

            if (nilai % tambah == 0) {
                System.out.println(tambah);
            }
            tambah--;
        }
        System.out.println("================");
        int n = 20;
        int t = 20;
        for (int i = 1; i <= n; i++) {
            if (n % t == 0) {
                System.out.println(t);
            }
            t--;
        }
    }
}
