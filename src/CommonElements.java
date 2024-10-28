import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonElements {
    public static void commonElements(int[] arr1,int[] arr2){
        List<Integer> boxed = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> number == arr2Number)).boxed().collect(Collectors.toList());
        System.out.println("Common Elements Are : " + boxed);
    }
}
