import java.util.Scanner;
public class Ucapan_25 {

    public static String PenerimaUcapan() {
        Scanner scan25 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = scan25.nextLine();
        scan25.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you");
    }
}