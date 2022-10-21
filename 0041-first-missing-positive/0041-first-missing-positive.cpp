class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n = nums.size(); if (!n) return 1;
        
        /* Mark all -ve numbers and zero as INT_MAX */
        for (int i = 0; i < n; i++) if (nums[i] <= 0) nums[i] = INT_MAX;
        
        /* 
         * If an element in the array is less than or equal to the size 
         * of the array, we can use its absolute value minus 1 to index 
         * into the array and change the sign of the number at that index. 
         * Thus, a negative element at index i represents that an element 
         * (or elements) of value 'i + 1' was (were) visited.
         */
        for (int i = 0; i < n; i++) {
            int ai = abs(nums[i]) - 1;
            if (ai < n) {
                if (nums[ai] > 0) nums[ai] = -1 * nums[ai];
            }
        }
        
        /*
         * The first positive element indicates the missing lowest 
         * positive element because we did not visit that element
         * (of value i + 1) in the array.
         */
        for (int i = 0; i < n; i++) if (nums[i] > 0) return i + 1;
        
        /* 
         * If no positive elements were found, that means the elements 
         * in the array are consecutive from 1 without any missing integer.
         * Return the next one.
         */
        return n + 1;
    }
};