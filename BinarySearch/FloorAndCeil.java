package BinarySearch;

public class FloorAndCeil {
    private int findFloor(int[] nums, int n, int x) {
        int low = 0, high = n - 1;

        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private int findCeil(int[] nums, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int floor = findFloor(nums, n, x);
        int ceil = findCeil(nums, n, x);
        return new int[] {floor,ceil};
    }
}
