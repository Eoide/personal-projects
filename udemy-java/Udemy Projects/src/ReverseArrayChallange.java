import java.util.Arrays;

public class ReverseArrayChallange {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        reverse(array);
        System.out.print("Reversed = " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int[] reverse = new int[array.length];
        int j= array.length-1;
        for(int i=0; i< array.length; i++) {
            reverse[i] = array[j];
            j--;
        }
        array = Arrays.copyOf(reverse, reverse.length);
    }
}
