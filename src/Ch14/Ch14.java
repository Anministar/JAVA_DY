package Ch14;



//### 상속(Inheritance) ###

//## 상속의 기본구조 ##
//class 부모클래스 {
//// 부모 클래스의 멤버 변수와 메서드
//}
//
//class 자식클래스 extends 부모클래스 {
//// 자식 클래스의 추가적인 멤버 변수와 메서드
//}

class Animal {
	String name;
	int age;
}

class Dog extends Animal {
	
}

// 부모 클래스 (이동수단 클래스)
class Vehicle {
	String brand;
	
	// 부모 클래스의 생성자를 호출할 의무가 있음.
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	void start() {
		System.out.println(brand + "차량 시동을 걸다.");
	}
	void stop() {
		System.out.println(brand + "차량 시동을 끄다.");
	}
}

// 자식 클래스 (자동차 클래스)
class Car extends Vehicle {
	String model;
	
	public Car(String brand, String model) {
		super(brand);
		this.model = model;
	}
	
	void accelerate() {
		System.out.println(brand + model + "차량이 가속한다.");
	}
	void brake() {
		System.out.println(brand + model + "차량이 제동한다.");
	}
	
}



public class Ch14 {
	public static void main(String[] args) {
//		
//		Dog myDog = new Dog();
//		myDog.name = "뽀삐";
//		myDog.age = 3;
//		System.out.println(myDog.name);
//		System.out.println(myDog.age);
		
		// ==================================
		
		Car object = new Car("Ferarri", "Roma");
		object.start();
		object.accelerate();
		object.brake();
		object.stop();
		
	}

}
