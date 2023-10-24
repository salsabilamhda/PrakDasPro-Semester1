import java.util.Scanner;
public class ArrayRataNilai25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scan25.nextInt(); //modifikasi2

        int[] nilaiMhs= new int[jumlahMahasiswa]; //modifikasi2
        double totalLulus = 0; //modifikasi2
        double totalTidakLulus = 0; //modifikasi2
        double rataLulus = 0; //modifikasi 2
        double rataTidakLulus = 0; // modifikasi2
        int jumlahLulus = 0; //modifikasi1
        

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan25.nextInt();


            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }
    

        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahMahasiswa - jumlahLulus > 0) {
            rataTidakLulus = totalTidakLulus / (jumlahMahasiswa - jumlahLulus);
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
      
    }
}
