package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/combination-sum/
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        count(res,temp,candidates,0,0,target);
        return res;
    }
    public static void count(List<List<Integer>> res,List<Integer> temp,int[] cand,int index,int sum,int target) {
    	if(sum==target) {
    		res.add(new ArrayList<Integer>(temp));
    		//temp.remove(temp.size()-1);
    		return;
    	}
    	int sumt=0;
    	for(int i=index;i<cand.length;i++) {
    		sumt=sum+cand[i];
    		if(sum<=target) {
    			temp.add(cand[i]);
    			count(res,temp,cand,i,sumt,target);
    			temp.remove(temp.size()-1);
    		}else {
    			sumt-=cand[i];
    			
    		}
    		
    	}
    }
    public static void main(String[] args) {
    	int[] s= {2,3,6,7};
    	int t=7;
    	combinationSum(s,t);
    }
}
