import java.util.Scanner;
public class Pemilihan2Percobaan325 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner (System.in);

        //deklarasi
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        //inputan
        System.out.println("Masukkan Kategori : ");
        kategori = input25.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input25.nextInt();

        //pemilihan
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil bersih : " + gajiBersih);
        }else 
            System.out.println("Masukan Kategori Salah ");

    }
    
}
