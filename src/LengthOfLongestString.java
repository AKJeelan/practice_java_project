public class LengthOfLongestString {

    public static void lengthOfLongestString(String[] strings){
        int max = 0;
        for (String word : strings){
            int length = word.length();
            if(length > max)
                max = length;
        }

        System.out.println("LengthOfLongestString : " + max);
    }
}
