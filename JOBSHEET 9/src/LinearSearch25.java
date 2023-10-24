import java.util.Scanner;
public class LinearSearch25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = scan25.nextInt(); //modifikasi1
        int[] arrayInt = new int[jumlahElemen]; //modifikasi1

        //modifikasi1
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = scan25.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = scan25.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        }
       
    }

}