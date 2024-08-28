import java.util.Scanner;

public class Proje24 {
    public static void main(String[] args) {

        //Girilen değerler ile üslü sayı hesaplama

        int n,k;

        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= k; i++){
            total *= n;
        }

        System.out.println("Cevap: " + total);
    }
}
