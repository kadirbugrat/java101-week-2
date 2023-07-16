public class HarmonicAverageWithArrays {
    public static void main(String[] args) {

        int[] Arr = {1,2,3,4,5};
        double harmonicAverage=0;

        for(int i=0;i<Arr.length;i++){
            harmonicAverage = harmonicAverage + 1.0/Arr[i];
        }
        System.out.println(Arr.length/harmonicAverage);

    }

}
