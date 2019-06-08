package DP;
import java.util.*;
//https://leetcode-cn.com/problems/longest-increasing-subsequence/
public class LengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        int res=0;
        if(nums.length==0)
        	return res;
        if(nums.length==1)
        	return 1;
        int[] dp=new int[nums.length];
        Arrays.fill(nums, 1);
        for(int i=1;i<nums.length;i++) {
        	for(int j=0;j<i;j++) {
        		if(nums[j]<nums[i]) {
        			dp[i]=Math.max(dp[j]+1,dp[i]);
        		}
        	}
        }
        res=dp[0];
        for(int i=0;i<nums.length;i++)
        	res=Math.max(res, dp[i]);
        return res;
    }
    public static void main(String[] args) {
    	int[] set= {1,3,6,7,9,4,10,5,6};
    	lengthOfLIS(set);
    }
}
