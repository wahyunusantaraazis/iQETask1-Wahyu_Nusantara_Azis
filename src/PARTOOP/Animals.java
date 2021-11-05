package PARTOOP;

public class Animals {
    String namaBinatang;
    String jenisMakanan;
    String gigiBinatang;

    public Animals(String namaBinatang, String jenisMakanan, String gigiBinatang) {
        this.namaBinatang = namaBinatang;
        this.jenisMakanan = jenisMakanan;
        this.gigiBinatang = gigiBinatang;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public String getGigiBinatang() {
        return gigiBinatang;
    }

    public void setGigiBinatang(String gigiBinatang) {
        this.gigiBinatang = gigiBinatang;
    }

    public void tampil() {
        System.out.print("Hi I'm Parent of All Animal, My Name is " + getNamaBinatang());
    }
}
