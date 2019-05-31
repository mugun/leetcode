package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/subsets-ii/comments/
public class SubsetWithDup {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        res.add(new ArrayList<Integer>());
        if(nums.length==0)
        	return res;
        Arrays.sort(nums);
        countSub(res,temp,nums,0,0,0,0);
        
        return res;
    }
    public static void countSub(List<List<Integer>> res, List<Integer> temp,int[] nums,int index, int left,int right,int deep) {
    	int flag=1;

    	for(int i=index;i<nums.length;i++) {
        	if(i<nums.length) {
    	    	if(nums[i]!=nums[left]) {
    	    		left=i;
    	    		right=left;
    	    	}
    	    	if(left>=right) {
    		    	for(int k=i;k<nums.length;k++) {
    		    		if(nums[k]==nums[right])
    		    			right=k;
    		    		else
    		    			break;
    		    	}
    	    	}
        	}

    		if(flag==1) {
	    		temp.add(nums[i]);
	    		res.add(new ArrayList<Integer>(temp));
	    		countSub(res,temp,nums,i+1,left,right,deep+1);
	    		temp.remove(temp.size()-1);
	    		if(i<right)
	    		i=right;
    		}
    	}
    }
    public static void main(String[] args) {
    	List<List<Integer>> res;
    	int[] nums= {1,2,2};
    	res=subsetsWithDup(nums);
    	System.out.println(" ");
    }
}
