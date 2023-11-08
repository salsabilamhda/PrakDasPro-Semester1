import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 5.");
            return;
        }

        int maxBintang = String.valueOf(N).length(); 

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                for (int k = 1; k <= maxBintang; k++) {
                    System.out.print("*");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}