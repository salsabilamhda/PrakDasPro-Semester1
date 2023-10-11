import java.util.Scanner;
public class Pemilihan2Percobaan225 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner (System.in);

        //deklarasi
        int sudut1, sudut2, sudut3, totalSudut;

        //inputan
        System.out.println("Masukan Sudut 1: ");
        sudut1 = input25.nextInt();
        System.out.println("Masukan Sudut 2: ");
        sudut2 = input25.nextInt();
        System.out.println("Masukan Sudut 3: ");
        sudut3 = input25.nextInt();

        //rumus
        totalSudut = sudut1 +  sudut2 + sudut3;

        //pemilihan
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku - siku");
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut2 == 60))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else 
                System.out.println("Segitiga tersebut adalah segitiga sembranag");

        } else 
            System.out.println("Bukan segitiga");
    }
}