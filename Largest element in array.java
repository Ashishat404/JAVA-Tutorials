public class LargestElement {
public static void main(String[] args) {
        int[] array = {10, 20, 30, 5, 50, 40, 15};
      int max = array[0];

        for (int i = 1; i < array.length; i++) {
     if (array[i] > max) {
     max = array[i];
            }
        }

       System.out.println("The largest element in the array is: " + max);
    }
}                          