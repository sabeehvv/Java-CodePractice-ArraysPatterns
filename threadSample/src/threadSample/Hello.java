package threadSample;

public class Hello {
	
	public static void main(String[] args) {
		
		Sample st1=new Sample();
		st1.start();
		
		Sample st2=new Sample();
		st2.start();
		
		Sample st3=new Sample();
		st3.start();
		
		Sample st4=new Sample();
		st4.start();
	}

}
