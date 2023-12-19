package runnableSample;

public class HelloMain {
	
	public static void main(String[] args) {
		
		SampleA st=new SampleA();
		
		Thread tr1=new Thread(st);
		tr1.start();
		
		Thread tr2=new Thread(st);
		tr2.start();
		
		Thread tr3=new Thread(st);
		tr3.start();
		
		Thread tr4=new Thread(st);
		tr4.start();
		
		Thread tr5=new Thread(st);
		tr5.start();
		
		Thread tr6=new Thread(st);
		tr6.start();

	}

}
