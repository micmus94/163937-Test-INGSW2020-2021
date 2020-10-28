package NumPrim.NumPrim;

import java.util.LinkedList;
import java.util.List;

public class MyMath {

	 public boolean prime(int num) {
	    	if(num<2)
	    		return false;
	    	for(int i=2;i*i<num;i++) {
	    		if(num%i==0)
	    			return false;
	    	}
	    	return true;
	    }
	 public List<Integer> primeGenerator(int n){
		 List<Integer>primeNumber=new LinkedList<Integer>();
		 if(n>=2)
			 primeNumber.add(2);
		 for(int i=3;i<n;i+=2) {
			 if(prime(i))
				 primeNumber.add(i);
		 }
		 return primeNumber;
	 }
}
