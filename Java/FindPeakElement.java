/*

Source: https://leetcode.com/problems/find-peak-element

*/

class Solution {
    public int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end){

            int mid = start + ((end - start) >>> 1);
            int nextIndex = mid + 1;

            if(nums[mid] < nums[nextIndex]) {
                start = nextIndex;
            }else {
                end = mid;
            }
        }

        return start;
    }
}
