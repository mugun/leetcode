package DP;
import java.util.*;
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<s.length()+1;i++) {
        	for(int j=0;j<i;j++) {
        		if(dp[j]&&wordDict.contains(s.substring(j, i))) {
        			dp[i]=true;
        			break;
        		}
        	}
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
    	List<String> ss=new ArrayList<String>();
    	ss.add("leet");
    	ss.add("code");
    	wordBreak("leetcode",ss);
    }
}
