import java.util.Scanner;

public class UcapanTerimaKasih_25 {

    public static String PenerimaUcapan() {
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = scan5.nextLine();
        scan5.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        System.out.println("Thank you for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}

