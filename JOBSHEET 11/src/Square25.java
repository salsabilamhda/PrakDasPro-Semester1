import java.util.Scanner;
public class Square25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        System.out.print("Masukkan nilai N = ");
        int N = scan25.nextInt();
        scan25.close();
        
        for(int iOuter=1; iOuter<=N; iOuter++) {
        for(int i = 0; i<=N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    }
}