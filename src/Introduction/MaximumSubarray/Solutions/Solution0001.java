package Introduction.MaximumSubarray.Solutions;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Maximum Subarray | Leetcode #0053 | Easy
 * https://leetcode.com/problems/maximum-subarray/
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 */

/**
 * Solution Notes by @wilsonplau - This approach uses something called Kadane's
 * algorithm, which I don't believe we cover in the course.
 */

public class Solution0001 {

  public static int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int currSum = 0;

    for (int num : nums) {
      currSum += num;
      max = Math.max(currSum, max);
      if (currSum < 0) {
        currSum = 0;
      }
    }

    return max;
  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    assertEquals(6, maxSubArray(nums1));

    int[] nums2 = { 1 };
    assertEquals(1, maxSubArray(nums2));

    int[] nums3 = { 5, 4, -1, 7, 8 };
    assertEquals(23, maxSubArray(nums3));

    System.out.println("All tests passed!");

  }

}