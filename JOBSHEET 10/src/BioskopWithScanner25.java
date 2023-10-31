import java.util.Scanner;
public class BioskopWithScanner25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkkan nama: ");
            nama = scan25.nextLine();
            System.out.print("Masukkkan baris: ");
            baris = scan25.nextInt();
            System.out.print("Masukkkan kolom: ");
            kolom = scan25.nextInt();
            scan25.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = scan25.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}