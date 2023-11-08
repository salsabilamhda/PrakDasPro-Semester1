import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }

        int maxDigits = String.valueOf(N).length(); 

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                for (int k = 1; k <= maxDigits; k++) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++) {
                String formattedNumber = String.format("%" + maxDigits + "d", j);
                System.out.print(formattedNumber);
            }

            System.out.println();
        }
    }
}
