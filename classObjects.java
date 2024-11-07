

class car{
	String color;
	String model;
	
	void drive() {
		System.out.println("The "+color+" color car name is "+model);
	}

}

public class classObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car myCar=new car();
		myCar.color="red";
		myCar.model="BMW";
		myCar.drive();
	
	}

}
