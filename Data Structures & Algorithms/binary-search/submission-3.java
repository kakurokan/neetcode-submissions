class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
        int mid = (r + l) >>> 1;
            int n = nums[mid];
            if (n == target) {
                return mid;
            } else if (n < target) {
                l = mid + 1; 
            } else{
                r = mid - 1;
            }
        }

        return -1;
    }
}
