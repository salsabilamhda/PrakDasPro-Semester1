import java.util.Scanner;
public class HargaBayar25 {

    public static void main(String [] args) {
        Scanner input =new Scanner(System.in);

        String merk;
        int harga, jumlah, halaman;
        double dis,total, bayar, jmlDis;

        System.out.println("Masukkan Merk Buku yang akan dibeli ");
        merk=input.next();
        System.out.println("Masukkan Jumlah Halaman Buku yang akan dibeli ");
        halaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Besaran Diskon ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Merk buku adalah " +merk);
        System.out.println("Jumlah Halaman Buku yang akan dibeli adalah " +halaman);
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

        
    }

    
}
