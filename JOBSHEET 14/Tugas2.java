import java.util.Scanner;

public class Tugas2 {
    
    public static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void tampilkanPenjumlahan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int f = sc.nextInt();

        tampilkanPenjumlahan(f);
        int hasil = penjumlahanRekursif(f);
        System.out.print(" = " + hasil);

        sc.close();
    }
}


