import java.util.ArrayList;

class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Step 1: Add all non-zero elements
        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }

        // Step 2: Add zeros for the remaining positions
        while (list.size() < nums.length) {
            list.add(0);
        }

        // Step 3: Copy back to nums[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}
