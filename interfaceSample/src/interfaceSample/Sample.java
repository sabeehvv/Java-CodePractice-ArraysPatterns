package interfaceSample;

public class Sample implements Hello{
	
	public void display(String text) {
		System.out.println(text);
	}
	
	Sample(){
		Testoutput s=new Testoutput(this);
		s.scan();
	}
	
	
	
	public static void main(String[] args) {
		
		Sample ts=new Sample();
		
	}

}
