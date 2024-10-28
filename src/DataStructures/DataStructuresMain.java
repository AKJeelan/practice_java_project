package DataStructures;

import DataStructures.Arrays.Array;

public class DataStructuresMain {

    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
//        array.removeAt(3);
        System.out.println(array.indexOf(40));
    }
}
