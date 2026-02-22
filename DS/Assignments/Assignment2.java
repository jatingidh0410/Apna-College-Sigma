import java.util.*;

public class Assignment2 {

    // Question 1
    // Return true if any value appears at least twice
    public static boolean countDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // Question 2
    // Search in rotated sorted array (O(log n))
    public static int searchRotated(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    // Question 3
    // Best time to buy and sell stock
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    // Question 4
    // Trapping rain water (Two-pointer approach)
    public static int trapWater(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

    // Question 5
    // 3Sum problem (no duplicate triplets)
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Q1
        int nums1[] = {1, 2, 3, 1};
        System.out.println("Contains duplicates: " + countDuplicate(nums1));

        // Q2
        int nums2[] = {4,5,6,7,0,1,2};
        System.out.println("Search rotated index: " + searchRotated(nums2, 0));

        // Q3
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max profit: " + maxProfit(prices));

        // Q4
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped water: " + trapWater(height));

        // Q5
        int nums3[] = {-1,0,1,2,-1,-4};
        System.out.println("Three sum result: " + threeSum(nums3));
    }
}