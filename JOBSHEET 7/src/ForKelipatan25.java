import java.util.Scanner;
public class ForKelipatan25 {

    public  static void main (String [] args) {
        Scanner scan25 = new Scanner (System.in);

        int kelipatan, total = 0, counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan25.nextInt();

        //perulangan
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += 1;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);

    }
}