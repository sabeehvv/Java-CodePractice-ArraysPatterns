package runnableSample;

public class SampleA implements Runnable{


	public void run() {
		
		for (int i=0;i<10;i++) {
			System.out.println("thread"+i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	} 

}
