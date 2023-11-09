import java.util.Scanner;
public class Triangle25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        System.out.print("Masukkan  nilai N = ");
        int N = scan25.nextInt();
        scan25.close();
        int i = 0;
        while(i<N) { //modifikasi
            int j = 0;
            while(j<=i) { //modifikasi
                System.out.print("*");
                j++;
            }
            System.out.println(); //modifikasi
            i++;
        }
    }
}