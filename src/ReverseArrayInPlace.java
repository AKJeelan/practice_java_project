import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayInPlace {

    public static void reverseArrayInPlace(int[] arr){

        for(int i = 0, j = arr.length - 1; i < j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



}
