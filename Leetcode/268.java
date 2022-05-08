class Solution {
    public int missingNumber(int[] nums) {
        int actualsum=0;
        for(int i:nums)
        {
            actualsum+=i;
        }
        int n=nums.length;
        return (n*(n+1)/2)-actualsum;
    }
}