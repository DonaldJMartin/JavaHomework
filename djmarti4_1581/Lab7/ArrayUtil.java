import java.util.Arrays;

public class ArrayUtil {

    private static void reverse(String[] array) {

        for(int i = 0; i < array.length / 2; i++){
            String newArray = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = newArray;
        }
    }
    public static void main(String[] args) {
        String[] myArray = {"a" , "b" , "c" , "d" , "e"};
        reverse(myArray);

        System.out.println(Arrays.toString(myArray));


    }

}
