package PARTOOP;

public class Main {
    public static void main (String[] args) {

        Animals animals = new Animals("Binatang", "", "");
        Herbivor herbivor = new Herbivor("Herbivore", "Kambing", "Tumbuhan", "Tumpul");
        Carnivor karnivoraObject = new Carnivor("Carnivore", "Singa", "Daging", "Tajam");
        Omnivor omnivor = new Omnivor("Omnivore", "Ayam", "Semua", "Tajam dan Tumpul");

        animals.tampil();
        System.out.println("");
        System.out.println("");
        herbivor.identifyMyself();
        System.out.println("");
        karnivoraObject.identifyMyself();
        System.out.println("");
        omnivor.identifyMyself();
    }
}
