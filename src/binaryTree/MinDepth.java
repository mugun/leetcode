package binaryTree;
import java.util.*;
//https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
public class MinDepth {
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		    TreeNode(int x) { val = x; }
		  }
    public int minDepth(TreeNode root) {
        if(root==null)
        	return 0;
    	int result=1;
        List<Integer> res=new ArrayList<Integer>();
        countMin(root,1,res);
        Collections.sort(res);
        result=res.get(0);
        return result;
    }
    public void countMin(TreeNode root,int deep,List<Integer> res) {
    	if(root!=null) {
    		if(root.left!=null) {
    			countMin(root.left,deep+1,res);
    		}
    		if(root.right!=null) {
    			countMin(root.right,deep+1,res);
    		}
    		if(root.left==null&&root.right==null) {
    			res.add(deep);
    		}
    		
    	}
    }
}
