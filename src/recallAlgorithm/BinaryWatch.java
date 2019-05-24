package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/binary-watch/
public class BinaryWatch {
    public static List<String> readBinaryWatch(int num) {
        List<String> res=new ArrayList<String>();
        int[] hTable= {8,4,2,1};
        int[] mTable= {32,16,8,4,2,1};
        for(int i=0;i<=num;i++) {
            List<Integer> hour=new ArrayList<Integer>();
            List<Integer> min=new ArrayList<Integer>();
            
        }
        return res;
    }
    public static void add(List<Integer> res,int[] table,int n,boolean[] flag,int sum) {
    	int count=0;
    	for(int i=0;i<flag.length;i++) {
    		if(flag[i]==true)
    			count++;
    	}
    	
    	if(count==n) {
    		res.add(sum);
    		return;
    	}
    	
    	for(int i=0;i<table.length;i++) {
    		if(flag[i])
    			continue;
    		flag[i]=true;
    		sum+=table[i];
    		add(res,table,n,flag,sum);
    		flag[i]=false;
    		sum-=table[i];
    	}
    }
}
