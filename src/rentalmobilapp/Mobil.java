package rentalmobilapp; //PACKAGE

//INHERITANCE
public class Mobil extends Kendaraan {
    //ATRIBUT 
    private int kapasitas;

    //CONSTRUCTOR
    public Mobil(String platNomor, String merk, int kapasitas) {
        super(platNomor, merk); //PEWARISAN 
        this.kapasitas = kapasitas;
    }

    //ACCESSOR
    public int getKapasitas() {
        return kapasitas;
    }

    //POLYMORPHISM 
    @Override
    public void info() {
        System.out.println("Mobil [" + getMerk() + "] - Plat: " + getPlatNomor() +
                           ", Kapasitas: " + kapasitas + " org, Tersedia: " + isTersedia());
    }
}
