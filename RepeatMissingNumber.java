Arrays / Repeat And Missing Number Array

public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    
	    ArrayList ret = new ArrayList<>();
	    int A =0;
	    int B=0;
	    long N = a.size();
	    long total = N*(N+1)/2;//(n*(n+1)/2)
	    
	    HashSet m = new HashSet();
	    
	    for(int i=0;i<N;i++){
	        int n= a.get(i);
	        if(m.contains(n))
	        {
	            A = n;
	            continue;
	        }
	        
	        m.add(n);
	        total-=n;
	    }
	    B=(int)total;
	    
	    ret.add(A);
	    ret.add(B);
	    return ret;
	    
	}
}