package Ch13;

public class C03CarMain {
	// 속성 (멤버 변수) 선언
	String brand;
	String model;
	int year;
	double price;

	
	// 메서드 : 속성을 출력하는 메서드
	public void printCarInfo() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
		System.out.println("Price : $" + price);
	}
	
	
	// ### 메서드의 구조 ###
	// 1. 메서드의 헤더
	// public			void				printCarInfo		(		) 		==> printCarInfo() 메서드는 매개변수가 없음.
	// 접근 제어자			반환 타입(반환 자료형)	 메서드명				( 매개변수 )
	
	// 2. 메서드의 바디 (몸체)
	// {}
	
	// ### 접근 제어자 (Access Modifier) ###
	// 1. public : 모든 클래스
	// 2. default : 동일 패키지
	// 3. private : 현재 클래스
	// 4. protected : 동일 패키지 + 상속받은 하위 클래스
	
	
	
	//------------------------------------------------------------------------------------------------------------
	// 속성 추가(Getter와 Setter를 설명하기 위한 클래스와 관련 없는 변수)
	private String test = "강아지";
	
	
	// ### Getter와 Setter ###
	// 객체 지향 프로그래밍에서 클래스의 private 속성(멤버 변수)에 접근하거나 값을 설정하기 위한 메서드
	
	// Getter() 메서드 ( == 접근자 메서드) 지정
	// Getter : 클래스의 private 속성(변수) 값을 '''읽는''' 메서드
	public String getTest() {
		return test;
	}
	
	
	// Setter() 메서드 ( == 설정자 메서드) 지정
	// Setter : 클래스의 private 속성(변수) 값을 '''설정''' 메서드
	public void setTest(String test) {
		this.test = test;
	}
	
	// 이와 같이 보통 Getter와 Setter는 속성(변수) 이름 앞에 "get", "set"을 붙여서 메서드 이름을 지정함.
	
	 
    // ### 'this' Keyword ###
    // 클래스 내에서 사용되는 예약어
    // 생성되는 객체의 위치정보를 가져오는데 사용됨.
    
    // 멤버변수 vs 매개변수 구별
    // this.name = name
	
	
	//------------------------------------------------------------------------------------------------------------
	
	
	
	
	public static void main(String[] args) {
		// Car 클래스의 인스턴스 생성
		C03CarMain myCar = new C03CarMain();
		
		// 속성 설정
		myCar.brand = "Porsche";
		myCar.model = "911 Turbo";
		myCar.year = 2022;
		myCar.price = 250000.50;
		
		myCar.printCarInfo();
		
		
	}
}
