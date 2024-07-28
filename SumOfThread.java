package Lab5;

public class SumOfThread extends Thread {
	    private int sum;

	    public int getSum() {
	        return sum;
	    }

	    @Override
	    public void run() {
	        sum = 0;
	        for (int i = 1; i <= 100; i++) {
	            sum += i;
	        }
	   }
}

	
	
	


