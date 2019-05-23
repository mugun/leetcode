package recallAlgorithm;
import java.util.*;
public class NumberCombiation {
	public static List<List<Integer>>combine(int n,int k){
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		List<Integer> sub=new ArrayList<Integer>();
		add(res,sub,1,n,k);
		return res;
	}
	public static void add(List<List<Integer>> res,List<Integer> sub,int start,int n,int k) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
