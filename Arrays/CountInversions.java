package Arrays;

public class CountInversions {
    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        long cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
