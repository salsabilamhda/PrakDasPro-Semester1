import java.util.Scanner;
public class BioskopWithScanner25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        int baris, kolom;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
           System.out.println("Menu: ");
           System.out.println("1. Input data penonton");
           System.out.println("2. Tampilkan daftar penonton");
           System.out.println("3. Exit");

           System.out.print("Pilih menu (1/2/3): ");
           int choice = scan25.nextInt();
           scan25.nextLine();
          
           switch (choice) {
            case 1:
                System.out.print("Masukkan nama: ");
                nama = scan25.nextLine();
               
                do {
                    System.out.println("Masukkan baris: ");
                    baris = scan25.nextInt();
                    System.out.println("Masukkan kolom: ");
                    kolom = scan25.nextInt();
                    scan25.nextLine();

                    if (!isValidSeat(baris, kolom, penonton)) {
                        System.out.println("Kursi sudah terisi atau nomor baris/kolom tidak tersedia. Silakan pilih kursi lain.");

                    }
                } while (!isValidSeat(baris, kolom, penonton));

                penonton[baris-1][kolom-1] = nama;
                System.out.println("Data penonton berhasil diinput.");
                break;
            case 2:
                System.out.println("Daftar penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Terima kasih!");
                System.exit(0);
                default:
                    System.out.println("Menu yang Anda pilih tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }

    public static boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
            return penonton[baris - 1][kolom - 1] == null;
        }
        return false;
    }
}
           
    

