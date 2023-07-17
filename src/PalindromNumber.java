import java.util.Scanner;

public class PalindromNumber {

    static boolean isPalindrom(int number){
        int temp=number;
        int reverseNumber=0,lastDigit=0;

        while (temp!=0){
            lastDigit=temp%10;
            reverseNumber=(reverseNumber*10)+lastDigit;
            temp=temp/10;
        }
        if(number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        int number;

        System.out.print("Enter the Number : ");

        Scanner input= new Scanner(System.in);
        number = input.nextInt();

        if(isPalindrom(number)==true)
            System.out.println(number+" is Palindrom Number");
        else
            System.out.println(number+" is not Palindrom Number");

    }
}
