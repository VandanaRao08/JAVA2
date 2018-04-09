package javaConcepts;

public class ThreadJoin extends Thread
{
     public void run()
     {
    	 for(int i=1;  i<=5; i++)
    	 {
    		 System.out.println(i);
    		 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
     }
	public static void main(String[] args) throws InterruptedException 
	{
              ThreadJoin t1=new ThreadJoin();
              ThreadJoin t2=new ThreadJoin();
              ThreadJoin t3=new ThreadJoin();
              
              t1.start();
              t1.join();
              t2.start();
              t3.start();
          
              
	}

}
