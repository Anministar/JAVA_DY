package Ch13;

public class C04PersonMain {
	
	// 속성(멤버 변수) 선언
	String name;
	int age;
	
    
    // ### 생성자 메서드 (Constructor Method ###
    // 객체가 생성될 때 호출되는 특별한 메서드
    // 클래스를 사용하여 객체를 생성 시 new 키워드를 사용하면 해당 클래스의 생성자가 1회 호출
    // 생성자는 주로 객체의 초기화를 수행
    // 기본적으로 클래스 내에 생성자(Constructor)가 명시되어 있지 않다면 디폴트 생성자 (Default Constructor == 기본 생성자)가 자동으로 주입돼 사용
    
    // ## 생성자 사용법 ##
    // 1. 생성자 함수는 클래스 이름과 반드시 동일해야함.
    // 2. 클래스와 동일하게 반환 타입(반환 자료형)이 없음.
	
	// 디폴트 생성자(Constructor)
	public C04PersonMain() {
		System.out.println("default 생성자입니다.");
		name = "기본 이름";
		age = 1;
	}
	
	 // ### 인수(argument)와 매개변수(parameter) ###
    //
    // 1. 인수란 ?		: 함수 호출 시 함수로 값을 전달해주는 변수
//    				: main --> 클래스 내 함수
    //
    // 2. 매개변수란?  : 매개변수는 함수 호출 시에 전달된 인수(argument)값을 저장.
//    			   : 함수 호출 시 인수로 전달된 값을 함수 내부에서 사용할 수 있도록 하는 변수
//    			   : 클래스 내 함수 --> 함수 {} 몸체 내 코드

    // 매개변수는 함수 내에서 지역변수로 사용됨.
    
	
	// 매개변수 생성자(Constructor)
	public C04PersonMain(String name, int age) {
		System.out.println("매개 변수 생성자입니다!!");
		this.name = name;
		this.age = age;
	}
		
	
	// 기능 (메서드) 선언
	public void greet() {
		System.out.println( "안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
	}
	
	
	public static void main(String[] args) {
		C04PersonMain person1 = new C04PersonMain("John", 25);		// 매개변수 생성자에 인수 두 개 전달
		C04PersonMain person2 = new C04PersonMain();
		
		person2.name = "Jane";
		person2.age = 30;
		
		person1.greet();
		person2.greet();
	
		
		
	}
	
	

}
