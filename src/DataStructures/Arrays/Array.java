package DataStructures.Arrays;

public class Array {

    private int capacity;
    private int[] array;
    private int index = 0;

    public Array(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public void insert(int num){
        if(index == capacity){
            int newCapacity = capacity + ((int) (capacity * 0.5));
            int[] newArray = new int[newCapacity];
            for(int i = 0; i < capacity; i++){
                newArray[i] = array[i];
            }
            newArray[capacity] = num;
            capacity = newCapacity;
            array = newArray;
        }
        array[index] = num;
        index++;
    }

    public void removeAt(int index){
        if(index > this.index)
            System.out.println("Index out of bound");

        int[] newArray = new int[capacity - 1];
        for (int i = 0,j = 0; i < capacity; i++){
            if(i != index){
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
        capacity = capacity - 1;
    }

    public int indexOf(int value){
        for(int i = 0; i < capacity; i++){
            if(array[i] == value)
                return i;
        }
        return -1;
    }
}
