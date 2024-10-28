import java.util.Arrays;

public class SecondSmallestElement {



    public static void secondSmallest(int[] arr){

        int smallestElem = Arrays.stream(arr).sorted().distinct().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array does not contains second smallest element"));
        System.out.println("Second smallest element is : " + smallestElem);
    }
}
