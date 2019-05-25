package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/subsets/
public class SubSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        res.add(temp);
        if(nums.length==0)
        	return res;
        countSubSet(res,temp,nums,0);
        return res;
    }
    public void countSubSet(List<List<Integer>> res,List<Integer> temp,int[] nums,int index) {
    	if(res.size()==Math.pow(2, nums.length))
    		return;
    	temp.add(nums[index]);
    	if(!res.contains(temp)) {
    		
    	}
    	
    }
}
