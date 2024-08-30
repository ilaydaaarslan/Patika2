import java.util.Scanner;

public class Proje29 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Elmasın yüksekliğini giriniz: ");
            int n = scanner.nextInt();

            int i = 0;
            while (i < n){
                int j = 0;
                while (j < n-i-1){
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k < 2*i+1){
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
            i = n-2;
            while (i >= 0){
                int j = 0;
                while (j < n-i-1){
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k < 2*i+1){
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i--;
            }
        }
    }
