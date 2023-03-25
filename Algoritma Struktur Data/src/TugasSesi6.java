import java.util.*;

public class TugasSesi6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<TugasSesi6> daftarBuku = new ArrayList<>();
            int jumlahBuku;

            System.out.print("Masukkan jumlah buku: ");
            jumlahBuku = input.nextInt();
            input.nextLine();

            for (int i = 0; i < jumlahBuku; i++) {
                TugasSesi6 buku = new TugasSesi6();

                System.out.println("Buku ke-" + (i + 1));
                System.out.print("Judul: ");
                buku.judul = input.nextLine();
                System.out.print("Author: ");
                buku.author = input.nextLine();
                System.out.print("Penerbit: ");
                buku.penerbit = input.nextLine();
                System.out.print("Kategori (1-Teknik, 2-Manajemen, 3-Fiksi, 4-Lainnya): ");
                buku.kategori = input.nextInt();
                System.out.print("Tahun: ");
                buku.tahun = input.nextInt();
                input.nextLine();

                daftarBuku.add(buku);
            }

            System.out.println("=====================================================================================================");
            System.out.println("Daftar Buku Java yang Tersedia");
            System.out.println("=====================================================================================================");
            System.out.println("No  Judul                                Pengarang               Penerbit           Ketegori  Tahun");
            System.out.println("=====================================================================================================");

            for (int i = 0; i < daftarBuku.size(); i++) {
                TugasSesi6 buku = daftarBuku.get(i);

                System.out.printf("%-4d%-36s%-24s%-20s%-10d%-6d%n", (i + 1), buku.judul, buku.author, buku.penerbit, buku.kategori, buku.tahun);

            }

            int bukuTeknik = 0;
            int bukuManajemen = 0;
            int bukuFiksi = 0;
            int bukuLainnya = 0;
            int bukuLawas = 0;
            int bukuBaru = 0;

            for (int i = 0; i < daftarBuku.size(); i++) {
                TugasSesi6 buku = daftarBuku.get(i);

                if (buku.tahun < 2010) {
                    bukuLawas++;
                } else {
                    bukuBaru++;
                }

                switch (buku.kategori) {
                    case 1:
                        bukuTeknik++;
                        break;
                    case 2:
                        bukuManajemen++;
                        break;
                    case 3:
                        bukuFiksi++;
                        break;
                    case 4:
                        bukuLainnya++;
                        break;
                    default:
                        break;
                }
            }

            System.out.println("=====================================================================================================");
            System.out.println("Jumlah buku yang tersedia: " + daftarBuku.size());
            System.out.println("Buku Teknik: " + bukuTeknik);
            System.out.println("Buku Manajemen: " + bukuManajemen);
            System.out.println("Buku Fiksi: " + bukuFiksi);
            System.out.println("Buku Lainnya: " + bukuLainnya);
            System.out.println("Buku Lawas: " + bukuLawas);
            System.out.println("Buku Baru: " + bukuBaru);
        }
    }
    
    private String judul;
    private String author;
    private String penerbit;
    private int kategori;
    private int tahun;
    
    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPenerbit() {
        return penerbit;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public int getKategori() {
        return kategori;
    }
    
    public void setKategori(int kategori) {
        this.kategori = kategori;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
}
        
