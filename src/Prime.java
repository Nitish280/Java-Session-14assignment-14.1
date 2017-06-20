// here we are creating the class prime and implimenting the runnable interface
public class Prime implements Runnable {
//here we creating the method of thread	
	    public void run(){
	    {
	   //  here we take the integer value
	    	int num;
	    	//here we are intialising the loop
	        for(num=2;num<=100;num++)
	        {
	            int num1=0;
	            for(int i=2;i<=num/2;i++)
	            	//here we are checking the no is perfectly divisible or not
	                if(num%i==0)
	                {
	                    num1++;
	                    break;
	                }
	            if(num1==0)
	            //here we are printing the prime number
	                System.out.println(num+" Number is prime");
	        }
	    }
	    }
	
//here we are creating the main method
	    public static void main(String args[]){
	    	//here we are creating the object
	    	Prime newprime=new Prime();
	    	//here we are creating the thread
	    	Thread t=new Thread(newprime);
	    	//here we are calling the run method by the thread
	    	t.start();
	    }	
}
	   
