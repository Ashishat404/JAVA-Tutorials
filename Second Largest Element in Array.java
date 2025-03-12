//This is program in java for finding second largest element in array 
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 5, 50, 40, 15};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest && array[i] != firstLargest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
            