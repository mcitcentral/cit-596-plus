package InductionAndRecusion.GreatestCommonDivisor;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Find Greatest Common Divisor of Array | Leetcode #1979 | Easy
 *https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 * 
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 */

/**
 * Solution Notes by _______
 *
 */

public class GreatestCommonDivisor {

  public static int findGCD(int[] nums) {
    // TODO: Your solution
    return 0;
  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { 2, 5, 6, 9, 10 };
    assertEquals(2, findGCD(nums1));

    int[] nums2 = { 7, 5, 6, 8, 3 };
    assertEquals(1, findGCD(nums2));

    int[] nums3 = { 3, 3 };
    assertEquals(3, findGCD(nums3));

    System.out.println("All tests passed!");

  }

}