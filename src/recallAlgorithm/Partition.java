package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/palindrome-partitioning/
public class Partition {
    public static List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<List<String>>();
        List<String> temp=new ArrayList<String>();
        count(res,temp,0,s);
        return res;
    }
    public static void count(List<List<String>> res,List<String> temp,int index,String s) {
    	if(index==s.length()) {
    		if(temp.size()==1) {
    			if(judge(temp.get(0))) {
    				res.add(new ArrayList<String>(temp));
    				return;
    			}
    			else
    				return;
    		}
    		res.add(new ArrayList<String>(temp));
    		return;
    	}
    	StringBuffer ss=new StringBuffer();
    	for(int i=index;i<s.length();i++) {
    		ss.append(s.charAt(i));
    		if(judge(ss.toString())) {
    			temp.add(ss.toString());
    			count(res,temp,i+1,s);
    		}else {
    			continue;
    		}
    		temp.remove(temp.size()-1);
    	}
    	
    }
    
    public static boolean judge(String s) {
    	if(s.length()==1)
    		return true;
    	else if(s.length()%2==1) {
    		int flag=1;
    		for(int i=0;i<s.length()/2;i++) {
    			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
    				flag=0;
    				break;
    			}
    		}
    		if(flag==1)
    			return true;
    		else
    			return false;
    	}
    	else {
    		int flag=1;
    		for(int i=0;i<s.length()/2;i++) {
    			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
    				flag=0;
    				break;
    			}
    		}
    		if(flag==1)
    			return true;
    		else
    			return false;
    	}
    }
    public static void main(String[] args) {
    	String s="acaba";
    	partition(s);

    }
}
