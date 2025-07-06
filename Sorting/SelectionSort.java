package Sorting;

//select minimum and swap with correct index

public class SelectionSort {
    public int[] selectionSort(int[] nums) {

    for (int i = 0; i < nums.length - 2; i++) {
      int minIndex = i;
      for (int j = i ; j <= nums.length-1; j++) {
        if (nums[j] < nums[minIndex]) {
          minIndex = j;
        }
      }

      if (minIndex != i) {
        //swap
        int temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
      }
    }

    return nums;
  }
}
