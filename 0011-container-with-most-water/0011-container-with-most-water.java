class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int minH=0;

        while (left < right) {
             minH= Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea,(right-left)*minH);

            while (height[left] <=minH && left<right) {
                left++;
            } while(left<right && height[right]<=minH) {
                right--;
            }
        }

        return maxArea;
    }
}