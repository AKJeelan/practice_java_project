import java.net.Inet4Address;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String name = "AK Jeelan";

        char[] array = name.toCharArray();
        for(int i = 0, j = array.length-1; i < j; i++,j--){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(new String(array));

        FunctionalInterface functionalInterface = () ->  10 + 20;
        System.out.println(functionalInterface.execute());

        // Stream API.

        List<String> list = Arrays.asList("abc", "", "bcd", "","Justin");

        list = list.stream().filter(obj -> !obj.isEmpty()).collect(Collectors.toList());
        System.out.println(list);

        list.forEach(print -> System.out.println(print));

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        Function<Integer,Integer> function = x -> x * 2;

        System.out.println(function.apply(10));
        SecondSmallestElement.secondSmallest(new int[] {5,8,3,2,1});
        SecondSmallestElement.secondSmallest(new int[] {5,8,3,2,1,1});
        CommonElements.commonElements(new int[]{1,2,3,4,5},new int[]{1,4,5,6,7,8});
        ReverseArrayInPlace.reverseArrayInPlace(new int[] {1,2,3,4,5,6});
        LengthOfLongestString.lengthOfLongestString(new String[] {"Apple", "Banana", "Avocado", "Apricot", "Graphes"});

        // Builder Design pattern
        Director director = new Director();
        Builder builder = new Builder();

        director.setBuilder(builder);
        Product product = director.construct();
        System.out.println(product);

        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> readOnlyList = Collections.unmodifiableList(list1);

        System.out.println(readOnlyList);
        try {

        }catch (UnsupportedOperationException ex){
            readOnlyList.add(200);
        }
        System.out.println(readOnlyList);

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1 , "AK");
        map.put(2 , "Jeelan");
        map.put(3 , "Anda");
        map.put(4 , "Vikram");
        map.put(5 , null);

        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(1 , "AK");
        weakHashMap.put(2 , "Jeelan");
        weakHashMap.put(3 , "Anda");
        weakHashMap.put(4 , "Vikram");
        weakHashMap.put(5 , null);

//        for (Integer num : map.keySet())
//            System.out.println("key : " + num + " value : " + map.get(num));

        for (Integer num : weakHashMap.keySet())
            System.out.println("key : " + num + " value : " + map.get(num));

//        Set<Integer> integerSet = map.keySet();
//
//        Iterator<Integer> iterator =  integerSet.iterator();
//        while (iterator.hasNext()){
//            Integer integer = iterator.next();
//            System.out.println("key : " + integer + " value : " + map.get(integer));
//        }
//
//        for(Map.Entry<Integer, String> entry : map.entrySet()){
//            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
//        }

        


    }
}