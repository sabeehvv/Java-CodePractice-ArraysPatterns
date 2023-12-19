package superSample;

public class B extends A{
	
	int a=40,c;
	
	
	void display() {
		
		c=super.a+a;
		System.out.println(super.a+"+"+a+"="+c);
		
	}
	
	B(){
		System.out.println("it's B constructor");
	}
	
	B(int a){
		super(a);
		System.out.println("it's B argument constructor");
	}
	
	void display1() {
		super.display();
	}

}
