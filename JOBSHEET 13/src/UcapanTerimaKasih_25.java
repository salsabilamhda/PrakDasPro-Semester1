import java.util.Scanner;
public class UcapanTerimaKasih_25 {

    public static String PenerimaUcapan() {
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin Anda beri ucapan:");
        String namaOrang = scan5.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
         String UcapanTambahan = "See u next time";
         UcapanTambahan(UcapanTambahan);
       
    }
}


