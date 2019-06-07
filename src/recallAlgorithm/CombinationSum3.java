package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/combination-sum-iii/
public class CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        count(res,temp,0,k,n,1);
        return res;
    }
    public static void count(List<List<Integer>> res,List<Integer>temp,int sum,int k,int n,int index) {
    	if(temp.size()==k) {
    		if(sum==n)
    			res.add(new ArrayList<Integer>(temp));
    		return;
    	}
    	int sumt=0;
    	for(int i=index;i<10;i++) {
    		sumt=sum+i;
    		if(sumt<=n) {
    			temp.add(i);
    			count(res,temp,sumt,k,n,i+1);
    			temp.remove(temp.size()-1);
    		}else {
    			break;
    		}
    	}
    }
    public static void main(String[] args) {
    	int k=3,n=9;
    	combinationSum3(k,n);
    }
}
