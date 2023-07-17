import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1,n2,i=1,ebob=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the n1 : ");
        n1 = input.nextInt();
        System.out.println("Enter the n2 :");
        n2 = input.nextInt();

        while (i<=n1){
            if(n1%i==0 && n2%i==0) {
                ebob = i;
            }

            ++i;
        }
        System.out.println("Ebob = "+ ebob);
        System.out.println("Ekok = "+ (n1*n2)/(ebob));

    }
}
