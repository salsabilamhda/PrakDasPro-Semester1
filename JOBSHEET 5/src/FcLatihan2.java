import java.util.Scanner;
public class FcLatihan2 {
    
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String username = "salsabila";
        String password = "cacadada";
        boolean loggedIn = false;

        while(!loggedIn) {
        System.out.print("Masukan username : ");
        String usernameIn = input25.next();
        System.out.print("Masukkan password :");
        String passwordIn = input25.next();
        
        if (usernameIn.equals(username) && passwordIn.equals(password)) {
            loggedIn = true;
        } else {
            System.out.println("Username dan Password anda salah");
        }
            if(loggedIn=true){
            System.out.println("Selamat Datang");              
            }
        }
            
    }
}
