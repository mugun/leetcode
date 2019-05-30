package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/subsets-ii/comments/
public class SubsetWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        res.add(new ArrayList<Integer>());
        if(nums.length==0)
        	return res;
        Arrays.sort(nums);
        
        
        return res;
    }
    public void countSub(List<List<Integer>> res, List<Integer> temp,int[] nums, int left,int right) {
    	for(int i=left;i<nums.length;i++) {
    		
    	}
    }
}
