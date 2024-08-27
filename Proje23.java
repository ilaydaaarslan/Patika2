import java.util.Scanner;

public class Proje23 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Kombinasyonun ilk elemanını girin (n): ");
        int n = scan.nextInt();


        System.out.print("İkinci elemanı girin (r): ");
        int r = scan.nextInt();

        int total = 1;
        for (int i = 1; i <= n; i++){
            total = total * i;
        }

        int sum = 1;
        for (int a = 1; a <= r; a++){
            sum = sum * a;
        }

        int p = n-r;
        int son = 1;
        for (int b =1; b <= p; b++){
            son =son * b;
        }

        int sonuc = total/ (sum * son);
        System.out.println("Girilen değerlerin kombinasyonu: " + sonuc);
    }
}
