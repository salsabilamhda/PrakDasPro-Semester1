import java.util.Scanner;

public class Tugas3 {
    
        public static boolean cekPrimaRekursif(int n, int i) {
            if (n <= 2) {
                return (n == 2) ? true : false;
            }
            if (n % i == 0) {
                return false;
            }
            if (i * i > n) {
                return true;
            }
            return cekPrimaRekursif(n, i + 1);
        }
    
        public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
            System.out.print("Masukkan angka : ");
            int angka = sc.nextInt();
            if (cekPrimaRekursif(angka, 2)) {
                System.out.println(angka + " adalah bilangan prima");
            } else {
                System.out.println(angka + " bukan bilangan prima");
            }

            sc.close();
        }
    }

