import java.util.Scanner;

public class Proje26 {
    public static void main(String[] args) {

        // Girilen sayının basamak değerlerinin toplamını hesaplayan program

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        int basValue;
        int toplam = 0 ;
        int tempNumber = number;

            tempNumber = number;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                toplam += basValue;
                tempNumber /= 10;
            }
        System.out.println("Girilen sayının basamak değerlerinin toplamı: " + toplam);
    }
}

