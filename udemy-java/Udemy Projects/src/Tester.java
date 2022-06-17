import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        int[] originalArray = new int[5];

        getIntegers(originalArray);
 //       printArray(originalArray);
        int [] newArray = sortIntegers(originalArray);

        printArray(newArray);


    }

    public static int[] sortIntegers(int[] originalArray) {
        int[] newArray = new int[originalArray.length];

 //       Arrays.sort(originalArray); //sorts array into ascending order
  //      int j=0;
    //    for(int i=(originalArray.length-1); i>=0; i--) {    //reverses it
      //      newArray[j]=originalArray[i];
        //    j++;
       // }
        int largestPosition = 0;
        int largest;
        for(int i=0; i<originalArray.length; i++) {
            largest = originalArray[i];
            for(int j=i; j< originalArray.length; j++) {
                if(originalArray[j]>largest) {
                    largest = originalArray[j];
                    largestPosition = j;
                }
            }
            newArray[i] = largest;
            originalArray[largestPosition] = 0;
        }

        return newArray;

    }

    public static int[] getIntegers(int[] originalArray) {
        System.out.println("Enter array value number:");
        for(int i=0; i< originalArray.length; i++) {
            originalArray[i] = getInt((i+1) +":");
        }
        return originalArray;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println((i+1) + ": " + array[i]);
        }
    }

    public static int getInt(String prompt) {
        Scanner kb = new Scanner(System.in);
        System.out.print(prompt);
        return kb.nextInt();
    }
}