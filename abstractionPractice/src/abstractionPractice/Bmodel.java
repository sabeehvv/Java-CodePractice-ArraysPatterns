package abstractionPractice;

class Bmodel extends Amodel {
	void display(String names) {
		System.out.println(names);
	}
	
	
	Bmodel(){
	Cmodel obj=new Cmodel(this);
	obj.scan();
	}
	
	
}
