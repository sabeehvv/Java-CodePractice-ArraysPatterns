package abstractionPractice;

class Cmodel {
	Amodel objecta;
	
	Cmodel(Amodel objecta){
		this.objecta=objecta;
	}

	
	void scan() {
		objecta.display("Hello Abstract main");
		
		objecta.display();
	}
	}
	



