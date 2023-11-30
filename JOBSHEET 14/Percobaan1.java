public class Percobaan1 {

    static int faktorialRelursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRelursif(n-1));
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i>= 1; i--){
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRelursif(5));
        System.out.println(faktorialIteratif(5));
    }
}