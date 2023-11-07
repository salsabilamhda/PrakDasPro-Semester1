import java.util.Scanner;
public class NestedLoop_2341720257 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        double [][] temps = new double [5][7];
        double [] kotaRata2 = new double [5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            double kotaJum = 0; //modif1
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                temps[i][j] = scan25.nextDouble();
                kotaJum += temps[i][j]; //modif1
            }
            kotaRata2[i] = kotaJum / temps[0].length; //modif1
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + " : ");
            for (double temp : temps[i]) { //modifikasi dg foreach
                System.out.print(temp + " ");
            }
            System.out.println("Rata - rata suhu tiap kota: " + kotaRata2[i]); //modif1
            System.out.println();
        }

    }
}
