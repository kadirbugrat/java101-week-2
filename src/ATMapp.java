import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ATMapp {
    public static void main(String[] args) {

        String username,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;

        while (right>0){
            System.out.println("Enter the username : ");
            username = input.nextLine();
            System.out.println("Enter the password : ");
            password = input.nextLine();

            if(username.equals("patika") && password.equals("java101")){
                System.out.println("Sisteme Giriş Yaptınız.");

                System.out.println("1-Para yatırma  \n" +
                                   "2-Para Çekme    \n" +
                                   "3-Bakiye Sorgula\n" +
                                   "4-Çıkış Yap");

                int option;
                System.out.println("Yapmak İstediğiniz İşlemi Seçiniz.");
                option = input.nextInt();

                switch (option){
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Yeni Bakiye : "+balance);
                        break;
                    case 2:System.out.print("Para miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                            System.out.println("Yeni Bakiye : "+balance);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Opps! Something Went Wrong!");
                }


                break;
            }else{
                System.out.println("Hatalı Kullanıcı Adı ve Şifre. Tekrar Deneyiniz.");
                System.out.println("Kalan Hakkınız : "+--right);
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

        }
    }
}
