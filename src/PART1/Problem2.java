package PART1;

public class Problem2 {
    public static void main(String[] args) {

        int nilai = 6;
        int tambah = 0;
        for (int i = 0; i <= nilai; i++) {
            tambah++;
            if (nilai % tambah == 0) {
                System.out.println(tambah);
            }
        }
        System.out.println("================");
        int n = 20;
        int t = 0;
        for (int i = 0; i <= n; i++) {
            t++;
            if (n % t == 0) {
                System.out.println(t);
            }
        }
    }
}
