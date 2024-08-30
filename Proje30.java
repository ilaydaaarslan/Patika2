import java.util.Scanner;

public class Proje30 {
    public static void main(String[] args) {

        // ATM Projesi

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullancı adınız: ");
        userName = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();
        if (userName.equals("Patika") && password.equals("dev123")){
            System.out.println("Merhaba, Kodluyoruz bankasına hoş geldiniz!");
            do {
                System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
                System.out.println("1-Para Yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Çıkış Yap");
                select= inp.nextInt();

                if (select == 1){
                    System.out.println("Para Miktarı: ");
                    int price = inp.nextInt();
                    balance += price;

                } else if (select == 2) {
                    System.out.println("Para Miktarı: ");
                    int price = inp.nextInt();

                    if (price > balance){
                        System.out.println("Yetersiz Bakiye.");
                    }else {
                        balance -= price;
                    }

                } else if (select == 3) {
                    System.out.println("Bakiyeniz: " + balance);

                }
            }while (select != 4);
            System.out.println("Tekrar Görüşmek Üzere!");
            break;
        }else {
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre girdiniz, tekrar deneyiniz.");
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan hakkınız: " + right);
            }


        }
        }
    }
}
