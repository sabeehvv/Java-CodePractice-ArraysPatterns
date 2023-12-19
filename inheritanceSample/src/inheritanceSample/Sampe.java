package inheritanceSample;

public class Sampe {
	public static void main(String[] args) {
		
		B f=new B();
		f.display();
		
		f.displayB();
		f.aa=f.a;
		f.display();
		
	}

}
