// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         int n = nums.length;
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             int first = nums[i];
//             int complement = target - first;
//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i };
//             }
//             map.put(first, i);
//         }

//         return new int[] {};
//     }

// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
        if(nums[j]+nums[j-i]==target){
            return new int[] {j-i,j};
        }
    }}
            return null;

    }
}