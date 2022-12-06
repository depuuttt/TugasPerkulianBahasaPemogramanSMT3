package plant;

import java.util.Scanner;

class Plants {
    protected int stsTumbuh;
    protected int jmlhAir;
    protected int jmlhPupuk;

    public Plants() {
        stsTumbuh = 0;
        jmlhAir = 0;
        jmlhPupuk = 0;
    }

    public int getStsTumbuh() {
        return stsTumbuh;
    }

    public void setStsTumbuh(int stsTumbuh) {
        this.stsTumbuh = stsTumbuh;
    }

    public int getJmlhAir() {
        return jmlhAir;
    }

    public void setJmlhAir(int jmlhAir) {
        this.jmlhAir = jmlhAir;
    }

    public int getJmlhPupuk() {
        return jmlhPupuk;
    }

    public void setJmlhPupuk(int jmlhPupuk) {
        this.jmlhPupuk = jmlhPupuk;
    }

    public void beriAir() {
        jmlhAir++;
        cekKondisiTumbuh();
    }

    public void beriPupuk() {
        jmlhPupuk++;
        cekKondisiTumbuh();
    }

    public void cekKondisiTumbuh() {
        if (jmlhAir >= 3 && jmlhPupuk >= 1) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (stsTumbuh < 4) {
            jmlhAir = jmlhAir - 3;
            jmlhPupuk = jmlhPupuk - 1;
            stsTumbuh++;
        }
    }

    public void displayPlant() {
        System.out.println(getStsTumbuhText());
        System.out.println("Jumlah Air      : " + jmlhAir);
        System.out.println("Jumlah Pupuk    : " + jmlhPupuk);
    }

    public String getStsTumbuhText() {
        switch (stsTumbuh) {
            case 0:
                return "Status Tanaman : Benih";
            case 1:
                return "Status Tanaman : Tunas";
            case 2:
                return "Status Tanaman : Tanaman Kecil";
            case 3:
                return "Status Tanaman : Tanaman Dewasa";
        }
        return "Status Tanaman : Berbunga";
    }
}

// Anggrek
// Membutuhkan 3 Air dan 2 Pupuk
class Anggrek extends Plants {
    private String jenis = "Anggrek";

    public Anggrek() {
        super();
        jenis = "Anggrek";
    }

    public void cekKondisiTumbuh() {
        if (getJmlhAir() >= 3 && getJmlhPupuk() >= 2) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (getStsTumbuh() < 4) {
            setJmlhAir(getJmlhAir() - 3);
            setJmlhPupuk(getJmlhPupuk() - 2);
            setStsTumbuh(getStsTumbuh() + 1);
        }
    }

    public String getJenis() {
        return jenis;
    }
}

// Mawar
// Membutuhkan 2 Air dan 1 Pupuk
class Mawar extends Plants {
    private String jenis = "Mawar";

    public Mawar() {
        super();
        jenis = "Mawar";
    }

    public void cekKondisiTumbuh() {
        if (getJmlhAir() >= 2 && getJmlhPupuk() >= 1) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (getStsTumbuh() < 4) {
            setJmlhAir(getJmlhAir() - 2);
            setJmlhPupuk(getJmlhPupuk() - 1);
            setStsTumbuh(getStsTumbuh() + 1);
        }
    }

    public String getJenis() {
        return jenis;
    }
}

// Melati
// Membutuhkan 2 Air dan 2 Pupuk
class Melati extends Plants {
    private String jenis = "Melati";

    public Melati() {
        super();
        jenis = "Melati";
    }

    public void cekKondisiTumbuh() {
        if (getJmlhAir() >= 2 && getJmlhPupuk() >= 2) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (getStsTumbuh() < 4) {
            setJmlhAir(getJmlhAir() - 2);
            setJmlhPupuk(getJmlhPupuk() - 2);
            setStsTumbuh(getStsTumbuh() + 1);
        }
    }

    public String getJenis() {
        return jenis;
    }
}

public class PlantMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihAksi, pilihTanaman;
        System.out.println("|=============================|");
        System.out.println("|        Pilih Tanaman        |");
        System.out.println("|=============================|");
        System.out.println("| 1. Anggrek                  |");
        System.out.println("| 2. Mawar                    |");
        System.out.println("| 3. Melati                   |");
        System.out.println("|=============================|");
        System.out.print("Masukkan Pilihan : ");
        pilihTanaman = sc.nextInt();

        switch (pilihTanaman) {
            case 1:
                Anggrek myAnggrek = new Anggrek();
                do {
                    System.out.println("|=============================|");
                    System.out.println("|  Sistem Penumbuhan Tanaman  |");
                    System.out.println("|  Anggrek (3 Air & 2 Pupuk)  |");
                    System.out.println("|=============================|");
                    System.out.println("| 1. Beri Air Untuk Tanaman   |");
                    System.out.println("| 2. Beri Pupuk Untuk Tanaman |");
                    System.out.println("| 9. Untuk Keluar             |");
                    System.out.println("|=============================|");
                    System.out.print("Masukkan Pilihan : ");
                    pilihAksi = sc.nextInt();
                    switch (pilihAksi) {
                        case 1:
                            myAnggrek.beriAir();
                            break;
                        case 2:
                            myAnggrek.beriPupuk();
                            break;
                    }
                    myAnggrek.displayPlant();
                } while (pilihAksi != 9);
                break;

            case 2:
                Mawar myMawar = new Mawar();
                do {
                    System.out.println("|=============================|");
                    System.out.println("|  Sistem Penumbuhan Tanaman  |");
                    System.out.println("|   Mawar (2 Air & 1 Pupuk)   |");
                    System.out.println("|=============================|");
                    System.out.println("| 1. Beri Air Untuk Tanaman   |");
                    System.out.println("| 2. Beri Pupuk Untuk Tanaman |");
                    System.out.println("| 9. Untuk Keluar             |");
                    System.out.println("|=============================|");
                    System.out.print("Masukkan Pilihan : ");
                    pilihAksi = sc.nextInt();
                    switch (pilihAksi) {
                        case 1:
                            myMawar.beriAir();
                            break;
                        case 2:
                            myMawar.beriPupuk();
                            break;
                    }
                    myMawar.displayPlant();
                } while (pilihAksi != 9);
                break;

            case 3:
                Melati myMelati = new Melati();
                do {
                    System.out.println("|=============================|");
                    System.out.println("|  Sistem Penumbuhan Tanaman  |");
                    System.out.println("|   Melati (2 Air & 1 Pupuk)  |");
                    System.out.println("|=============================|");
                    System.out.println("| 1. Beri Air Untuk Tanaman   |");
                    System.out.println("| 2. Beri Pupuk Untuk Tanaman |");
                    System.out.println("| 9. Untuk Keluar             |");
                    System.out.println("|=============================|");
                    System.out.print("Masukkan Pilihan : ");
                    pilihAksi = sc.nextInt();
                    switch (pilihAksi) {
                        case 1:
                            myMelati.beriAir();
                            break;
                        case 2:
                            myMelati.beriPupuk();
                            break;
                    }
                    myMelati.displayPlant();
                } while (pilihAksi != 9);
                break;

            default:
                System.out.println("Maaf, tanaman tidak tersedia.");
                break;
        }
    }
}