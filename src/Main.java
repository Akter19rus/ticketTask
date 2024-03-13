import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ticketTask();
    }

    public static int[] arr() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static void ticketTask() {
        int[] arr = arr();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 2; i < Math.min(arr.length, 7); i++) {
            result.add(arr[i]);
        }
        System.out.println(result);
    }
}