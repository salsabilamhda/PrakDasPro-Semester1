import java.util.Scanner;
public class DoWhileCuti25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner (System.in);

        //deklarasi
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jatahCuti = scan25.nextInt();

        //perulangan
        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan25.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan25.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }
            }
        
        
    } while (jatahCuti > 0);
    
}
}
