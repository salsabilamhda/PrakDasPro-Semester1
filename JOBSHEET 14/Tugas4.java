public class Tugas4 {
    public static void main(String[] args) {
        int bulan = 12;
        int jumlahPasangan = hitungPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + jumlahPasangan);
    }

    public static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
}



