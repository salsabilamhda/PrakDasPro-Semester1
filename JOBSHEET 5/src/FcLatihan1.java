import java.util.Scanner;
public class FcLatihan1 {
    
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        //tugas 1
        System.out.print("Masukan jarak : ");
        int jarak = input25.nextInt();

        if (jarak <= 5)
            System.out.println("Melee Weapon");
        else 
            System.out.println("Ranged Weapon");
            
    }
}
