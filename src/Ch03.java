
public class Ch03 {

	public static void main(String[] args) {

		// 00 자료형과 변수

		// 1 byte == 8bit
		// 자료(데이터) : 선저장 후 처리 ( 공간 먼저 확보 후 저장 )
		// 자료형 : 데이터 종류에 따라 저장될 공간을 미리 규격화 시켜놓은 예약어

		// 변수란? : 하나의 값을 저장할 수 있는 저장공간, 필요에 의해 반복적으로 바꿀 수 있음.
		// 상수란? : 항상 같은 수 , 값을 바꾸지 않음(고정)

		// "=" 은 우리가 알던 수학적 기호의 의미 즉, "같다"는 의미를 지니는게 아니라 "대입"의 의미를 지님.

		// 왼쪽 = 오른쪽
		// ( 공간 ) = ( 값, 수 )
		// ( Variable ) = ( Value )
		// 이때 오른쪽을 먼저 처리한다.

		int age; // 변수 선언
					// int 자료형 == 4byte
					// 4byte 정수 공간에 age이름 부여

		age = 22; // 변수공간에 값 "대입"
					// 이때 주의해야할 점이 age는 22과 같지 않음.
					// " 대입 " 의 개념

		System.out.println(22);
		System.out.printf("age : %d \n", age);

		age = 12; // 값 변경 가능

		int num1 = 10; // 변수를 초기화한다고 함.
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num3);
		System.out.println();

		// 01 자료형의 종류

		// 1. 정수 자료형
		// 1-1) int : 4byte 정수, 기본자료형

		// 1-2) byte : 1byte 정수, 부호 O

		// 1-3) ## short vs char 비교 ##
		// char : 2byte 정수 부호 X, 단일문자 저장용으로 주로 사용
		// short : 2byte 정수 부호 O

		// 1-4) long : 8byte 정수

		long a1 = 20; 		// 리터럴 접미사 x ==> 기본자료형(int)
							// long, int 자료형을 일치시켜주는 작업이 함(자동 형 변환 작업)
		
		
		long a2 = 20L; 		// 리터럴 접미사 L,l : long 자료형
							// long, long 자료형이 같아서 작업이 필요없음
		
		long a4 = 10000000000L;

		// 2. 실수 자료형

		// float : 4byte 실수(6 - 9자리)
		// double : 8byte 실수(기본값) (15 - 18자리)

		// 실수의 범위는 무한대에 가깝기 때문에 제한된 공간을 가진 컴퓨터는
		// 모든 범위의 수를 담기란 불가능하다.

		// 따라서 근사값 즉, 소수점 이하 (가수부) 유효범위까지만 실수값을 저장하고
		// 나머지 부분에 있어서는 오차가 발생하여 나타남.
		// ==> 따라서 반복적인 실수 연산처리는 오차가 나타날 수밖에 없다.
		

		float b1 = 3.14f;	// 리터럴접미사 F,f : float 자료형
		double b2 = 3.14;	// 리터럴접미사x ==> 기본자료형(double)
		
		
		//정밀도 확인
		System.out.println("--------------- 실수 자료형 - 정밀도 확인 예제 ---------------");
		float b3 = 0.123456789123456789F;
		double b4 = 0.1234556789123456789;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();

		// 3. 단일(한문자) 자료형
		// char : 2byte 문자 저장 자료형
		// 아스키 코드표(ASCII), Unicode 코드표 둘다 사용
		
		
		char ch1 = 'A';
		char ch2 = 65;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int) ch2);
		

		// 4. 문자열 자료형
		// String : 클래스 자료형 -------> 이후에 객체지향 파트에서 다시 설명
		
		
		String name = "홍길동";			// 참조변수 name에는 
										// 문자열이 저장된 위치값(메모리주소)가 저장
		
		String name1 = "홍길동";
		
		
		System.out.println(name);
		System.out.println(name1);
		
		System.out.println(System.identityHashCode(name));			// 자바가 이해하는 위치값
		System.out.println(System.identityHashCode(name1));
		
		
		String name2 = new String("홍길동");
		System.out.println(System.identityHashCode(name2));
		
		
		
		// 5. 논리형 자료형
		// boolean : 1byte
		// true(참)			
		// false(거짓)		
		
		boolean flag = true;
		System.out.println(flag);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
