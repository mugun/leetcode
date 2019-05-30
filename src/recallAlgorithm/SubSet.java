package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/subsets/
public class SubSet {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        res.add(temp);
        if(nums.length==0)
        	return res;
        countSubSet(res,temp,nums,0);
        return res;
    }
    public static void countSubSet(List<List<Integer>> res,List<Integer> temp,int[] nums,int index) {
    	if(res.size()==Math.pow(2, nums.length))
    		return;
    	for(int i=index;i<nums.length;i++) {
    		temp.add(nums[i]);
    		res.add(new ArrayList<Integer>(temp));
    		countSubSet(res,temp,nums,i+1);
    		temp.remove(temp.size()-1);
    	}
    	
    }
    public static void main(String[] args) {
    	int[] nus= {1,2,3};
    	List<List<Integer>>res;
    	res=subsets(nus);
    	System.out.println("");
    }
}
