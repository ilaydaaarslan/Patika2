import java.util.Scanner;

public class Proje28 {
    public static void main(String[] args) {

        // Yıldızlar ile Üçgen Yapımı

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
