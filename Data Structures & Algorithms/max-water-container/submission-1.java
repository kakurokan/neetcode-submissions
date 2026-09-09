class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int res = 0;
        while (l < r) {
            int width = r - l;
            int height = Math.min(heights[l], heights[r]);
            int volume = width * height;
            res = Math.max(res, volume);

            while (heights[r] > heights[l] && heights[l] <= height) {
                l++;
            }
            while (l < r && heights[r] <= height) {
                r--;
            }
        }

        return res;
    }
}
