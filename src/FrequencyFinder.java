import java.util.HashMap;
import java.util.Map;

public class FrequencyFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 3, 5, 1, 3};

        Map<Integer, Integer> frequencyMap = findFrequency(array);

        System.out.println("Eleman Frekansları:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " kez");
        }
    }

    public static Map<Integer, Integer> findFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }
}
