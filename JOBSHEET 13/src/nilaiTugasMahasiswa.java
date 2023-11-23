import java.util.Scanner;
public class nilaiTugasMahasiswa {
    private static int[][] nilai;
    private static String[] nama;
    private static Scanner sc = new Scanner(System.in);

    public static void inputJumlahMahasiswaDanTugas() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas per minggu: ");
        int jumlahTugas = sc.nextInt();

        nilai = new int[jumlahMahasiswa][jumlahTugas];
        nama = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = sc.next();
        }
    }

    public static void inputNilai() {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai " + nama[i] + " minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilNilai() {
        for (int i = 0; i < nilai[0].length; i++) {
            System.out.println("Minggu ke-" + (i + 1));
            for (int j = 0; j < nilai.length; j++) {
                System.out.println(nama[j] + ": " + nilai[j][i]);
            }
            System.out.println();
        }
    }


    public static void nilaiTertinggi() {
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 1; i < nilai.length; i++) {
            if (hitungTotalNilai(i) > hitungTotalNilai(mahasiswaTertinggi)) {
                mahasiswaTertinggi = i;
                mingguTertinggi = mingguTertinggi(i);
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi: " + nama[mahasiswaTertinggi]);
        System.out.println("Pada minggu ke: " + (mingguTertinggi + 1));
    }

    private static int mingguTertinggi(int mahasiswa) {
        int mingguTertinggi = 0;
        int nilaiTertinggi = nilai[mahasiswa][0];

        for (int j = 1; j < nilai[mahasiswa].length; j++) {
            if (nilai[mahasiswa][j] > nilaiTertinggi) {
                nilaiTertinggi = nilai[mahasiswa][j];
                mingguTertinggi = j;
            }
        }

        return mingguTertinggi;
    }

    private static int hitungTotalNilai(int mahasiswa) {
        int total = 0;
        for (int j = 0; j < nilai[mahasiswa].length; j++) {
            total += nilai[mahasiswa][j];
        }
        return total;
    }

    public static void hariTertinggi() {
        int mingguTertinggi = 0;
        int nilaiTertinggi = nilai[0][0];
        for (int j = 1; j < nilai[0].length; j++) {
            int totalMinggu = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalMinggu += nilai[i][j];
            }
            if (totalMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalMinggu;
                mingguTertinggi = j;
            }
        }
        System.out.println("Hari dengan nilai tertinggi dari keseluruhan mahasiswa: Minggu ke-" + (mingguTertinggi + 1));
    }

    public static void main(String[] args) {
        inputJumlahMahasiswaDanTugas();
        inputNilai();
        System.out.println();
        tampilNilai();
        hariTertinggi();
        System.out.println();
        nilaiTertinggi();
    }
}