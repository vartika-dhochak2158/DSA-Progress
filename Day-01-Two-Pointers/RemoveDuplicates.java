class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int officer = 1; // write index
        int cm = 1;      // scan index
        int k = 1;       // count of unique elements

        while (cm < nums.length) {

            if (nums[cm] != nums[cm - 1]) {
                nums[officer] = nums[cm];
                officer++;
                k++;
            }

            cm++;
        }

        return k;
    }
}