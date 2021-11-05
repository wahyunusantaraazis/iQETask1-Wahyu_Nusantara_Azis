package PART1;

public class Problem1 {
    public static void main(String[] args) {
        float alas, tinggi; //ini untuk deklarasi variabel
        double luas; //ini untuk deklarasi variabel
        //input
        alas = 20; //inisialisasi nilai variabel alas
        tinggi = 25; //inisialisasi nilai varibale tinggi
        //kode
        luas = 0.5 * alas * tinggi;
        int intValue = (int) luas; //untuk proses konversi dari tipe data double ke integer
        System.out.println("Luas Segitiga = "+intValue); //untuk output hasil
    }
}

