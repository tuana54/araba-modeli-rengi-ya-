package nyp;

public class car {
	String type;
	String model;
	String color;
	int speed;
	
	car(String type,String model,String color){
		this.type=type;
		this.model=model;
		this.color=color;
		this.speed=0;
	}
	
	int increaseSpeed(int increment) {
		speed+=increment;
		return speed;
	}
	int decreaseSpeed(int decreament) {
		if(speed>0) {
			speed-=decreament;
		}
		return speed;
	}
	void printSpeed(){
		System.out.println("speed: "+speed);
	}
	void printİnfo() {
		System.out.println("---------------");
		System.out.println("model: "+this.model);
		System.out.println("type: "+this.type);
		System.out.println("color: "+this.color);
		System.out.println("speed: "+this.speed);
	}
}
