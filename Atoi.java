String/ Atoi

public class Solution {
	public int atoi(final String a) {
	    if(a.length()==0){return 0;}
	    StringBuilder x = new StringBuilder();
	    
	    boolean startedRead = false;
	    for (int i=0;i<a.length();i++){
	        
	        if(startedRead){
	            if(Character.isDigit(a.charAt(i))){
	                x.append(a.charAt(i));
	            }else{
	                break;
	            }
	        }else{
	            if(a.charAt(i)=='+'){startedRead = true;}
	            else if(Character.isDigit(a.charAt(i))||a.charAt(i)=='-'){
	                startedRead = true;
	                x.append(a.charAt(i));
	            }else{
	                if(a.charAt(i)!=' ') return 0;
	            }
	        }
	    }
	    
	    //check if x not empty
	    if(x.length()==0){return 0;}
	    
	    String num = x.toString();
	    
	    if(num.charAt(0)=='-'){
	        //check if length >1;
	        if(num.length()==1) return 0;
	        if(num.length()>11) return Integer.MIN_VALUE;
	        
	        //check overflow
	        
	        long d = Long.parseLong(num);
	        return (d<Integer.MIN_VALUE)?Integer.MIN_VALUE:(int)d;
	    }else{
	        //try parse check overflow
	        if(num.length()>11) return Integer.MAX_VALUE;
	        long d = Long.parseLong(num);
	        return (d>Integer.MAX_VALUE)?Integer.MAX_VALUE:(int)d;
	    }
	}
}
