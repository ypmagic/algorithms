import java.util.Arrays;

public class SelectionSort {
  // implements SelectionSort
  // takes in an array of integers
  public static int[] sort(int[] array) {
    // go through the array left to right
    for (int i = 0; i < array.length; i++) {
      int minIndex = i; // the smallest value
      for (int j = i+1; j < array.length; j++) {
        // smallest value in the array
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      // swap positions using a copy
      int originalValue = array[i];
      array[i] = array[minIndex];
      array[minIndex] = originalValue;
    }
    // returns the new array that is sorted
    return array;
  }

  public static void main(String[] args) {
    // test SelectionSort
    int[] testArray = {5,7,-2,-4,15,2,3,6,10,6,7,8,10,20,24,28,-12,152,25};
    int[] newArray = sort(testArray);
    System.out.println(Arrays.toString(newArray));
  }
}
