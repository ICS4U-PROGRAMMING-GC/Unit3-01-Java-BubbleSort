/**
 * Sorts a fixed-size array of 6 integers using Bubble Sort.
 *
 * @author Carel
 * @version 1.0
 */
public final class BubbleSort {

    /**
     * Prevents instantiation of this utility class.
     */
    private BubbleSort() {
    }

    /**
     * Sorts an integer array in ascending order using Bubble Sort.
     *
     * @param array the array to sort
     */
    public static void sortArray(final int[] array) {
        int length = array.length;
        boolean swapped;

        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Prints the elements of an integer array on a single line.
     *
     * @param array the array to print
     */
    public static void printArray(final int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        int[] numbers = {34, 12, 52, 6, 19, 25};

        System.out.print("Original array: ");
        printArray(numbers);

        sortArray(numbers);

        System.out.print("Sorted array:   ");
        printArray(numbers);
    }
}
