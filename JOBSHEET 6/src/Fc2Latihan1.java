import java.util.Scanner;
public class Fc2Latihan1 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner (System.in);

        //deklarasi 
        int bil1, bil2, bil3;

        System.out.println("Masukkan Bilangan Pertama : ");
        bil1 = input25.nextInt();
        System.out.println("Masukkan Bilangan Kedua : ");
        bil2 = input25.nextInt();
        System.out.println("Masukkan Bilangan Ketiga : ");
        bil3 = input25.nextInt();
        

        //pemilihan

        if (bil1 > bil2) {
            if (bil1 > bil3) 
                System.out.println("Bilangan Terbesar : " + bil1);
            
        }   else if (bil2 > bil1) 
               if (bil2 > bil3) 
               System.out.println("Bilangan Terbesar : " + bil2);
         else 
                System.out.println("Bilangan Terbesar : " + bil3) ;

        }        
    } 

