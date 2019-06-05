package DP;
import java.util.*;
//TOTALDP
public class DP02 {
	public static void TotalDP(int[] weight,int[] value,int packet) {
		int[][] m=new int[weight.length][packet+1];
		for(int i=1;i<weight.length;i++) {
			for(int j=1;j<=packet;j++) {
				if(j<weight[i]) {
					m[i][j]=m[i-1][j];
				}else {
					int k=j/weight[i];
					for(int p=0;p<=k;p++) {
						m[i][j]=Math.max(m[i-1][j],m[i-1][j-p*weight[i]]+p*value[i]);
					}
				}
			}
		}
		System.out.println("hello");
	}
	public static void main(String[] args) {
		int[] weight= {0,1,2,3,4};
		int[] value= {0,2,4,4,5};
		int pack=5;
		TotalDP(weight,value,pack);
	}
}
