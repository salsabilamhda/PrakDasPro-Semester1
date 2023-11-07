import java.util.Scanner;
public class Star25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        System.out.print("Masukkan nilai N = ");
        int N = scan25.nextInt();

        for(int i=1; i<=N; i--) {
            System.out.print("*");
        }
    
    }
}