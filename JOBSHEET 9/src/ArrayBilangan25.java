import java.util.Scanner;
public class ArrayBilangan25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        double[] bil = new double[4];
        bil[0] = 5.0;
        bil[1] = 12876;
        bil[2] = 7.5;
        bil[3] = 2000000;

        for (int i = 0; i <= 4; i++) {
            System.out.println(bil[i]);
        }



    }
}