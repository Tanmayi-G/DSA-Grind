package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithXORk {
    public int subarraysWithXorK(int[] nums, int k) {
        int n = nums.length;
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ nums[i];

            int x = xr ^ k;

            cnt += mpp.getOrDefault(x, 0);

            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }
}
