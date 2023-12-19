package abstractionsample;

public class A extends Hello {
	
	void onText(String text) {
		System.out.println(text);
		
	}
	
	A(){
		TextScanner ts=new TextScanner(this);
		ts.scan();
	}

	
	public static void main(String[] args) {
		
		A s=new A();
	}
}
