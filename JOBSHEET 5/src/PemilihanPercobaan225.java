import java.util.Scanner;
public class PemilihanPercobaan225 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String nilaiHuruf = "", kualifikasi = "";
        double nilaiSetara = 0;
        
        System.out.println("Nilai uas       : ");
        float uas = input25.nextFloat();
        System.out.println("Nilai uts       : ");
        float uts = input25.nextFloat();
        System.out.println("Nilai kuis     : ");
        float kuis = input25.nextFloat();
        System.out.println("Nilai tugas     : ");
        float tugas = input25.nextFloat();

        double total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (80< total && total<=100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat baik";
        } else if (73 < total && total <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari baik";
        } else if (65 < total && total <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (60 < total && total <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";
        } else if (50 < total && total <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup"; 
        } else if (39 < total && total <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else if (total <= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
    } 
            System.out.println("Nilai akhir = " + total);
            System.out.println("Nilai huruf = " + nilaiHuruf);
            System.out.println("Nilai setara = " + nilaiSetara);
            System.out.println("Kualifikasi = " + kualifikasi);
        }
} 
