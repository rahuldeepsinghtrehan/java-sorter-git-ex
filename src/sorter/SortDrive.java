package sorter;

public class SortDrive {

    public static void main(String[] args) throws Exception {

        int[] numbers = SorterUtility.readNumbers("resources/numbers.csv");

        System.out.println("Before Sorting:");
        SorterUtility.printArray(numbers);

        Sorter.bubbleSort(numbers);

        System.out.println("After Bubble Sorting:");
        SorterUtility.printArray(numbers);
    }
}
