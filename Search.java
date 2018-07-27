import java.util.Arrays;

public class Search {
  public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (target == array[i]) {
        return i;
      }
    }
    return -1;
  }

  // assumes the list is sorted
  public static int binarySearch(int[] array, int target) {
    int index = array.length/2;
    if (array[index] == target) {
      return index;
    } else if (array[index] < target) {
      return binarySearch(Arrays.copyOfRange(array, array.length/2+1, array.length), target);
    } else if (array[index] > target) {
      return binarySearch(Arrays.copyOfRange(array, 0, array.length/2), target);
    }
    return -1;
  }

  public static void main(String[] args) {
    // test LinearSearch
    int[] testArray = {-12, -4, -2, 2, 3, 5, 6, 6, 7, 7, 8, 10, 10, 15, 20, 24, 25, 28, 152};
    System.out.println(binarySearch(testArray, -2));
  }
}
