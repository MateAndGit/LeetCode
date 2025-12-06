class Solution {
      public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            int guess = nums[mid];

            if (guess == target) {
                return mid;
            } else if (guess < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return first;
    }
}