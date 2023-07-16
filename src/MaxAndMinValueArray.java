import java.util.Scanner;

public class MaxAndMinValueArray {
    public static void main(String[] args) {

        int[] Arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int number;

        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int minClosest = Integer.MIN_VALUE;
        int maxClosest = Integer.MAX_VALUE;

        for (int i : Arr) {
            if (i < number && i > minClosest) {
                minClosest = i;
            }
            if (i > number && i < maxClosest) {
                maxClosest = i;
            }
        }



        System.out.println("Girilen Sayıya En Yakın Minimum Değer :" + minClosest);
        System.out.println("Girilen Sayıya En Yakın Maximum Değer :" + maxClosest);

        }
    }

