package rentalmobilapp; //PACKAGE

//CLASS
public class Kendaraan {
    //ATRIBUT (Encapsulation)
    private String platNomor;
    private String merk;
    private boolean tersedia;

    //CONSTRUCTOR
    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tersedia = true;
    }

    //ACCESSOR
    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    //MUTATOR
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    //POLYMORPHISM
    public void info() {
        System.out.println("Plat: " + platNomor + ", Merk: " + merk + ", Tersedia: " + tersedia);
    }
}
