import java.util.Scanner;
public class PemilihanPercobaan125 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = input07.nextInt();

        //Menggunakan Tenary Operator
        String jenisBilangan = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka " + angka + " adalah " + jenisBilangan);

        //Menggunakan if else
        //if (angka % 2 == 0)
        //System.out.println("Angka " + angka + " Bilangan Genap");
        //else
        //System.out.println("Angka " + angka + " Bilangan Ganjil");

    }
}