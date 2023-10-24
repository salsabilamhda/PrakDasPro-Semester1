import java.util.Scanner;
public class TugasArray25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();
        int[] array = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            array[i] = input.nextInt();
        }

        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        int total = array[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            total += array[i];
        }

        double rataRata = (double) total / jumlahElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
