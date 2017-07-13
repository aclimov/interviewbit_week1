String/Next Permutation

public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	    
	    int N = a.size();
	    if(N<=1) return;
	    if(N==2){Collections.swap(a,0,1); return;}
	    int max = a.get(N-1);
	    int chidx = -1;
	    for(int i=N-2;i>=0;i--){
	        if(a.get(i)<a.get(i+1))
	        {
	             chidx = i;
	             break;
	        }
	    }
	    if(chidx ==-1){
	        Collections.sort(a);
	        return;
	    }
	    
	    for(int i=N-1;i>chidx;i--){
	        if(a.get(chidx)<a.get(i)){
	            Collections.swap(a,chidx,i);
                break;
	        }
	    }
	    Collections.reverse(a.subList(chidx+1,N));
	}
}
