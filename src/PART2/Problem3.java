package PART2;

public class Problem3 {
    private static float Mean(float[] s) {
        float jumlahData = 0;
        for (int i = 0; i < s.length; i++) {
            jumlahData += s[i];
        }
        return jumlahData / s.length;
    }
    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
