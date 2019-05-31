package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/restore-ip-addresses/submissions/
public class RestoreIpAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<String>();
       if(s.equals("0000")) {
    	   res.add("0.0.0.0");
    	   return res;
       }
        List<List<Integer>> res1=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        HashSet<String>set=new HashSet<String>();
        countIp(res1,temp,0,0,0,s);
        for(int i=0;i<res1.size();i++) {
        	StringBuffer t=new StringBuffer();
        	for(int j=0;j<res1.get(i).size();j++) {
        		t.append(String.valueOf(res1.get(i).get(j)));
        		t.append(".");
        	}
        	t.deleteCharAt(t.length()-1);
        	set.add(t.toString());
        }
        for(String n:set)
        	res.add(n);
        return res;
    }
    public static void countIp(List<List<Integer>> res,List<Integer> temp,int start,int index,int deep,String target) {
    	StringBuffer tep=new StringBuffer();
    	if(deep!=3) {
    		int tar;
    		for(int i=index;i<target.length();i++) {
    	
    		for(int k=index;k<=i;k++) {
    			
    			tep.append(target.charAt(k));
    		}
    		if(tep.length()!=1&&tep.charAt(0)=='0') {
    			return;
    		}
    		try {
    			tar=Integer.parseInt(tep.toString());
    		}catch(Exception e) {
    			return;
    		}
    		
    		if(tar>255) {
        		int gree=tep.length();
        		tep.delete(0,gree);
    			return;
    		}
    			
    		temp.add(tar);
    		countIp(res,temp,index+1,i+1,deep+1,target);
    		temp.remove(temp.size()-1);
    		int gree=tep.length();
    		tep.delete(0,gree);
    		
    		}
    		
    	}
    	else {
    		int tar;
    		for(int i=index;i<target.length();i++) {
    			tep.append(target.charAt(i));
    		}
    		if(tep.length()==0)
    			return;
    		if(tep.length()!=1&&tep.charAt(0)=='0') {
    			return;
    		}
    		try {
    			tar=Integer.parseInt(tep.toString());
    		}catch(Exception e) {
    			return;
    		}
    		
    		if(tar>255) {
        		int gree=tep.length();
        		tep.delete(0,gree);
    			return;
    		}
    			
    		temp.add(tar);
    		res.add(new ArrayList<Integer>(temp));
    		temp.remove(temp.size()-1);
    		int gree=tep.length();
    		tep.delete(0,gree);
    	}
    }
    public static void main(String[] args) {
    	String s="010010";
    	List<String> res;
    	res=restoreIpAddresses(s);
    }
}
