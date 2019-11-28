
public class Bus {
	
	int seats;
	String color;
	
	Bus(int seats,String color){
		this.seats = seats;
		this.color = color;
		
		
	}
	
	Bus(){
		this(40);//this is used to call a constructor from another constructor within the 
		//the same class
	}
	
	Bus(int seats){
		this(seats,"red");
		
	}
	
	void printDetails() {
		System.out.println("Welcome to redbus,bus capacity is "+seats+ "color is "+color);
	}
}
