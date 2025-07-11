# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini merupakan sistem sederhana untuk menyewakan mobil. Pengguna dapat melihat daftar mobil beserta detailnya, memilih mobil yang ingin disewa berdasarkan plat nomor, dan sistem akan memperbarui status ketersediaan mobil secara otomatis.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kendaraan`, `Mobil`, dan `MainRental` adalah contoh class.

```bash
public class Kendaraan {
    ...
}

public class Mobil extends Kendaraan {
    ...
}

public class MainRental {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarMobil = new Mobil` adalah contoh pembuatan object.

```bash
Mobil[] daftarMobil = new Mobil[] {
    new Mobil("B1234XYZ", "Toyota Avanza", 7),
    ...
};
```

3. **Atribut** adalah variabel yang ada dalam class.`String platNomor`, `String merk`, dan `int kapasitas` adalah contoh atribut untuk menyimpan data dari sebuah object.

```bash
private String platNomor;
private String merk;
private int kapasitas;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, method khusus yang dijalankan saat pembuatan object contoh penggunaan constructor saat object pertama kali dibuat.

```bash
public Mobil(String platNomor, String merk, int kapasitas) {
    super(platNomor, merk);
    this.kapasitas = kapasitas;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, Method untuk mengubah nilai atribut.

```bash
public void setTersedia(boolean tersedia) {
    this.tersedia = tersedia;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini adalah contoh penggunaan accessor (getter) untuk mengambil nilai atribut.

```bash
public String getMerk() {
    return merk;
}

public boolean isTersedia() {
    return tersedia;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, Encapsulation menyembunyikan data atribut dengan private, lalu mengaksesnya lewat getter/setter.

```bash
private String platNomor;

public String getPlatNomor() {
    return platNomor;
}
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, konsep pewarisan, class Mobil mewarisi class Kendaraan.

```bash
public class Mobil extends Kendaraan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. penggunaan polymorphism dengan overriding method dari superclass. ditunjukkan lewat method `info()` yang dioverride di subclass Mobil.
```bash
@Override
public void info() {
    System.out.println("Mobil [" + getMerk() + "] - Plat: " + getPlatNomor() + ", Kapasitas: " + kapasitas + " org, Tersedia: " + isTersedia());
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, Pada kode ini adalah contoh penggunaan seleksi kondisi menggunakan `if-else` dan `switch`.
```bash
if (m.isTersedia()) {
    ...
} else {
    ...
}

switch (pilihan) {
    case 1:
        ...
        break;
    case 2:
        ...
        break;
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, `for (Mobil m : daftarMobil)`adalah contoh penggunaan perulangan untuk menampilkan data dan proses menu.

```bash
for (Mobil m : daftarMobil) {
    m.info();
}

do {
    ...
} while (pilihan != 3);
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, adalah contoh penggunaan input/output sederhana dengan `input = new Scanner(System.in)` dan `System.out.println`.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan plat nomor mobil: ");
String plat = input.nextLine();
System.out.println("Daftar Mobil:");
m.info();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, adalah contoh penggunaan array untuk menyimpan banyak object.
```bash
Mobil[] daftarMobil = {
    new Mobil("B1234XYZ", "Toyota Avanza", 7),
    new Mobil("D5678ABC", "Honda Brio", 5),
    new Mobil("F9012DEF", "Suzuki Ertiga", 7)
};
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, menggunakan 'try-catch' untuk menangani input yang tidak valid.

```bash
try {
    pilihan = Integer.parseInt(input.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input harus berupa angka!");
    continue;
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M. Ismail
NPM: 2310010629
kelas: 4C Reg Pagi Banjarbaru
