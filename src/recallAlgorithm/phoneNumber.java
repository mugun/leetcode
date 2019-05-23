package recallAlgorithm;
import java.util.*;
public class phoneNumber {
	 public static List<String> letterCombinations(String digits) {
		 List<String> res=new ArrayList<String>();
		 StringBuffer buf=new StringBuffer();
		 if(digits.length()==0||digits==null) {
			 return res;
		 }
		 String[] phoneNumbers = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
		 dfsLetter(digits,0,phoneNumbers,res,buf);
		 return res;
	        
	   }
	 public static void dfsLetter(String digits,int index,String[] phoneNum,List<String> res,StringBuffer buf) {
		 if(index==digits.length()) {
			 res.add(buf.toString());
			 return;
		 }
		 String pNumber=phoneNum[digits.charAt(index)-'0'];
		 for(int i=0;i<pNumber.length();i++) {
			 buf.append(pNumber.charAt(i));
			 dfsLetter(digits,index+1,phoneNum,res,buf);
			 buf.deleteCharAt(buf.length()-1);
		 }
	 }
	public static void main(String[] args) {
		
	}
}
