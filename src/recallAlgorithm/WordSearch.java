package recallAlgorithm;
import java.util.*;
//https://leetcode-cn.com/problems/word-search/
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        boolean res=true;
        int row=board.length;
        int col=board[0].length;
        if(word.length()>row*col)
			return false;
        int pFlag=0;
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		if(board[i][j]==word.charAt(0)){
        			boolean[][] flag=new boolean[row][col];
        	        StringBuffer temp=new StringBuffer();
        	        dfs(temp,board,flag,i,j,word);
        	        if(temp.length()==word.length()) {
        	        	pFlag=1;
        	        	break;
        	        }
        		}
        	}
        }
        if(pFlag==1)
        return res;
        else
        	return false;
    }
    public static void dfs(StringBuffer temp,char[][] board,boolean[][] flag,int row,int col,String word) {
    	if(temp.length()==word.length())
    		return;
    	if(flag[row][col]==false) {
    		if(board[row][col]==word.charAt(temp.length())) {
    			flag[row][col]=true;
    			temp.append(word.charAt(temp.length()));
    			if(col-1>=0) {
    				dfs(temp,board,flag,row,col-1,word);
    			}
    			if(row-1>=0) {
    				dfs(temp,board,flag,row-1,col,word);
    			}
    			if(row+1<board.length) {
    				dfs(temp,board,flag,row+1,col,word);
    			}
    			if(col+1<board[0].length) {
    				dfs(temp,board,flag,row,col+1,word);
    			}
    	    	if(temp.length()==word.length())
    	    		return;
    			flag[row][col]=false;
    			temp.deleteCharAt(temp.length()-1);
    		}
    		
    	}
    }
    public static void main(String[] args) {
    	char[][] board= {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
    	String word="ABCESEEEFS";
    	boolean a=exist(board,word);
    	System.out.println(a);
    	
    }
}
