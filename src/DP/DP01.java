package DP;
import java.util.*;
//0-1DP
public class DP01 {
	public  static void dp(int v[],int w[],int target) {
		int[][] m=new int[v.length][target+1];
		for(int i=1;i<v.length;i++) {
			for(int j=1;j<=target;j++) {
				if(j>=w[i]) {
					m[i][j]=Math.max(m[i-1][j], m[i-1][j-w[i]]+v[i]);
				}else
					m[i][j]=m[i-1][j];
			}
		}
//		int c=12;
//		int[][] m=new int[v.length][c+1];
//		
//		for(int i=1;i<v.length;i++) {
//			for(int j=1;j<=c;j++) {
//				if(j>=w[i])
//					m[i][j]=Math.max(m[i-1][j],m[i-1][j-w[i]]+v[i]);
//				else
//					m[i][j]=m[i-1][j];
//			}
//		}
		for(int i=1;i<6;i++) {
			for(int j=1;j<=target;j++) {
				System.out.println(m[i][j]);
			}
		}
		
	}
	public static void main(String[] Args) {
		int[] value={0,8,10,6,3,7,2};
		int[] weight={0,4,6,2,2,5,1};
		int target=12;
		dp(value,weight,target);
	}
}
