import java.util.Scanner;
public class Kubus25 {
    
    static int hitungVolume (int sisi) {
        int Volume = sisi*sisi*sisi;
        return Volume;
    }

    static int hitungLuarPermukaan (int sisi) {
        int LuarPermukaan = 6*sisi*sisi;
        return LuarPermukaan;
    }

    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         int sisi, vol, lp;
         System.out.println("Masukkan panjang sisi ");
         sisi = input.nextInt();

         vol = hitungVolume(sisi);
         System.out.println("Volume Kubus adalah " + vol);
         lp = hitungLuarPermukaan(sisi);
         System.out.println("Luas Luar Permukaan Kubus adalah " + lp);
    }
}
