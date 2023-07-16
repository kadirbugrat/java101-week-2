public class MaxAndMinValueArray {
    public static void main(String[] args) {

        int[] Arr = {15,12,788,1,-1,-778,2,0};

        int minClosest = Arr[0];
        int maxClosest = Arr[0];

        for(int i : Arr){

            if(i<minClosest){
                minClosest = i;
            }

            if(i>maxClosest){
                maxClosest = i;
            }

        }
        System.out.println("Minimum Değer :" + minClosest);
        System.out.println("Maximum Değer :" + maxClosest);

    }
}
