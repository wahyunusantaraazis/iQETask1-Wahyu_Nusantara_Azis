package PART2;

public class Problem2 {
    private static void drawXYZ(int n){
        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                num += 1;
                if (num % 3 == 0) {
                    System.out.print("X ");
                } else if (num % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawXYZ(3);
        System.out.println("-----");
        drawXYZ(5);
        System.out.println("-----");
        drawXYZ(1);
    }
}
