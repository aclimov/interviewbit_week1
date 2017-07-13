Strings /Count And Say

public class Solution {
	public String countAndSay(int a) {
	    if(a==1) return "1";
	    else{
	        String s ="1";
	        for(int i=1;i<a;i++){
	            s = addOne(s);
	        }
	        return s;
	    }
	}
	
	String addOne( String x){
	    char[] chars = x.toCharArray();
	    StringBuffer sb = new StringBuffer();
	    
	    char element=chars[0];
	    int count=1;
	    for(int c=1;c<chars.length;c++){
	        
	        if(chars[c]!=element){
	            sb.append(String.valueOf(count));
	            sb.append(element);
	            
	            element = chars[c];
	            count=1;
	        }else
	        {
	            count+=1;
	        }
	    }
	    sb.append(String.valueOf(count));
	    sb.append(element);
	    return sb.toString();
	}
}
