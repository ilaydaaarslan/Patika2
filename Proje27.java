import java.util.Scanner;

public class Proje27 {
    public static void main(String[] args) {

        //Girilen sayının harmonik serisini bulan program

        Scanner inp = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int n = inp.nextInt();
        double result = 0.0;

        for (int i = 1; i <= n; i++){
            result += (1.0/i);
        }
        System.out.println(result);
    }
}
