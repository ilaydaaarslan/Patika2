import java.util.Scanner;

public class Proje25 {
    public static void main(String[] args) {

        // ARMSTRONG SAYILARI BULAN PROGRAM

        Scanner scan = new Scanner(System.in);
        System.out.print("Sorgulamak istediğiniz sayıyı giriniz: ");
        int number = scan.nextInt();

        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;

        }

        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;

            basPow =1;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;

        }
        if (result == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }
    }
}
