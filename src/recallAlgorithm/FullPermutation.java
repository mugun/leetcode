package recallAlgorithm;
import java.util.*;
public class FullPermutation {
	
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums.length==0)
        	return res;
        List<Integer> sub=new ArrayList<Integer>();
        add(nums,res,sub, new boolean[nums.length]);
        return res;
    }
    public static void add(int[] nums,List<List<Integer>> res,List<Integer>sub,boolean[] flag) {
    	if(sub.size()==nums.length) {
    		res.add(new ArrayList<Integer>(sub));
    		return;
    	}
    	for(int i=0;i<=nums.length;i++) {
    		if(flag[i])
    			continue;
    		flag[i]=true;
    		sub.add(nums[i]);
    		add(nums,res,sub,flag);
    		flag[i]=false;
    		sub.remove(sub.size()-1);
    	}
    }
}
