package nyp;

public class main {

	public static void main(String[] args) {
		car audi=new car("sports","audi","red");
		audi.increaseSpeed(20);
		audi.printİnfo();
		/*audi.model="audi";
		audi.speed=150;
		System.out.println(audi.model+"hızı: ,"+audi.speed);*/
		car bmw=new car("sports","bmw","blue");
		 bmw.increaseSpeed(50);
		 bmw.decreaseSpeed(10);
		 bmw.increaseSpeed(5);
		 bmw.printİnfo();
		/*bmw.model="bmw";
		bmw.speed=50;
		bmw.increaseSpeed(100);
		bmw.decreaseSpeed(10);
		System.out.println(bmw.model+"hızı: "+bmw.speed);*/
		car mercedes=new car("sports","mercedes","black");
		mercedes.printİnfo();
		/*mercedes.type="sports";
		mercedes.speed=80;
		mercedes.decreaseSpeed(20);
		mercedes.increaseSpeed(50);
		System.out.println(mercedes.type+"hızı: "+mercedes.speed);*/
		
		

	}

}
