class ThreadClass extends Thread {
	
    public void run() {
    	for(int i=0;i<5;i++)
    	{
	System.out.println(" child Thread is running");
      }
    } 	

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass tc = new ThreadClass();
		tc.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Parent Thread is running");
		}
		

	}

}
