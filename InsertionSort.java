import java.util.Arrays;

public class InsertionSort {
  public static int[] sort(int[] array) {
    for (int marker = 1; marker < array.length; marker++) {
      int compare = marker-1;
      int tempMark = marker;
      while (compare >= 0 && array[tempMark] < array[compare]) {
        swap(array, compare, tempMark);
        compare--;
        tempMark--;
      }
    }
    return array;
  }

  private static void swap(int[] array, int index1, int index2) {
    int index1store = array[index1];
    array[index1] = array[index2];
    array[index2] = index1store;
  }

  public static void main(String[] args) {
    // test InsertionSort
    int[] testArray = {5,7,-2,-4,15,2,3,6,10,6,7,8,10,20,24,28,-12,152,25};
    int[] newArray = sort(testArray);
    System.out.println(Arrays.toString(newArray));
  }
}
