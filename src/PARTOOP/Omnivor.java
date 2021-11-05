package PARTOOP;

public class Omnivor extends Animals{
    private String jenisHewan;

    public Omnivor(String jenisHewan, String namaBinatang, String jenisMakanan, String gigiBinatang) {
        super(namaBinatang, jenisMakanan, gigiBinatang);
        this.jenisHewan = jenisHewan;
    }

    public void identifyMyself() {
        System.out.print("Hi I'm " + jenisHewan + ", ");
        System.out.print("My Name is " + namaBinatang + ", ");
        System.out.print("My Food is " + jenisMakanan + ", ");
        System.out.print("I have " + gigiBinatang + " teeth");
    }
}
