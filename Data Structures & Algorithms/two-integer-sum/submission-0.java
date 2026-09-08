class Solution {
    public int[] twoSum(int[] nums, int target) {
        // key = value, value = index
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int difference = target - n;

            if (values.containsKey(difference)) {
                return new int[] {values.get(difference), i};
            }

            values.put(n, i);
        }

        return new int[0];
    }
}

