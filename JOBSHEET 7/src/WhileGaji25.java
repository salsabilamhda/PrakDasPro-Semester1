import java.util.Scanner;
public class WhileGaji25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);
        
        //deklarasi
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan25.nextInt();

        //perulangan
        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan25.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan25.nextInt();
            

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } 
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            i++;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);
        
    }
    
}
