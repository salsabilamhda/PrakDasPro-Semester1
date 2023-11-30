import java.util.Scanner;

public class Tugas1 {

        public static void deretDescendingRekursif(int n) {
            if (n >= 0) {
                System.out.print(n + " ");
                deretDescendingRekursif(n - 1);
            }
        }
    
        public static void deretIteratif(int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Masukkan angka : ");
            int n = sc.nextInt();
            System.out.println("Deret rekursif:");
            deretDescendingRekursif(n);
            System.out.println("\nDeret iteratif:");
            deretIteratif(n);

            sc.close();
        }
    }
    

