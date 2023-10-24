import java.util.Scanner;
public class ArrayNilai25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        //deklarasi
        int [] nilaiAkhir = new int [10];

        //perulangan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = scan25.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }  else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }
            
        }
    }
}