package Lab5;

public class SumOfNumbers {
	
	    public static void main(String[] args) {
	        SumOfThread sumThread = new SumOfThread();
	        sumThread.start(); // Start the thread

	        try {
	            sumThread.join(); // Wait for the thread to finish
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }

	        // Print the result
	        System.out.println("The sum of numbers from 1 to 100 is: " + sumThread.getSum());
	        System.out.println("Thread has finished execution.");
	    }
	}



