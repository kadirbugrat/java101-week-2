
import java.util.Scanner;

public class MaxNumberAndMinNumber {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int numbers;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane Sayı gireceksiniz : ");
        numbers = input.nextInt();

        int i = 1;
        int n;

        while (i <= numbers) {
            System.out.println(i + ". Sayıyı Giriniz : ");
            n = input.nextInt();
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
            i++;
        }
        System.out.println("Girilen sayılardan En büyüğü : " + max);
        System.out.println("Girilen sayılardan En küçüğü : " + min);
    }
}
