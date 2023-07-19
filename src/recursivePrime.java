import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class recursivePrime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();

        if(isPrime(number,number-1)){
            System.out.println(number+" is prime number.");
        }else{
            System.out.println(number+" is not prime number.");
        }


    }

    public static boolean isPrime(int num, int i) {
        if (i == 1) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return isPrime(num,i-1);

    }
}
