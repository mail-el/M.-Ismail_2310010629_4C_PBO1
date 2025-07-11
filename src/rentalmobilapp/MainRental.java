package rentalmobilapp; //PACKAGE

import java.util.Scanner;

public class MainRental { //CLASS
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //INPUT/OUTPUT

        //ARRAY + OBJECT
        Mobil[] daftarMobil = {
            new Mobil("B1234XYZ", "Toyota Avanza", 7),
            new Mobil("D5678ABC", "Honda Brio", 5),
            new Mobil("F9012DEF", "Suzuki Ertiga", 7)
        };

        int pilihan = 0;

        //PERULANGAN
        do {
            System.out.println("\n--- Menu Rental Mobil ---");
            System.out.println("1. Lihat Daftar Mobil");
            System.out.println("2. Sewa Mobil");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            //ERROR HANDLING
            try {
                pilihan = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

            //SELEKSI
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Mobil ---");
                    for (Mobil m : daftarMobil) {
                        m.info(); //POLYMORPHISM
                    }
                    break;

                case 2:
                    System.out.print("Masukkan plat nomor mobil yang ingin disewa: ");
                    String plat = input.nextLine();
                    boolean ditemukan = false;

                    for (Mobil m : daftarMobil) {
                        if (m.getPlatNomor().equalsIgnoreCase(plat)) {
                            ditemukan = true;
                            if (m.isTersedia()) {
                                m.setTersedia(false); //MUTATOR
                                System.out.println("Mobil " + m.getMerk() + " berhasil disewa.");
                            } else {
                                System.out.println("Mobil tidak tersedia.");
                            }
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Mobil dengan plat tersebut tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 3);

        input.close(); //INPUT/OUTPUT
    }
}
