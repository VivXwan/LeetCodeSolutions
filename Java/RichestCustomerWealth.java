/*

Source: https://leetcode.com/problems/richest-customer-wealth/submissions/

Time: O(m * n), where m is the length of array accounts and n is the length of each customer's wealth
Space: O(1), in-place

*/

class Solution {
  public int maximumWealth(int[][] accounts) {

    int max = 0;

    for(int[] customer : accounts) {

      int sum = 0;

      for(int wealth : customer) {
        sum += wealth;
      }

      if(sum > max) {
        max = sum;
      }
    }

    return max;
  }
}
