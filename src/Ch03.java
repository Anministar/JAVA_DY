
public class Ch03 {
	
	public static void main(String[] args) {
		
		
		// 00 자료형과 변수
		
		// 1 byte == 8bit
		// 자료(데이터) : 선저장 후 처리 ( 공간 먼저 확보 후 저장 )
		// 자료형 : 데이터 종류에 따라 저장될 공간을 미리 규격화 시켜놓은 예약어
		
		// 변수란? : 하나의 값을 저장할 수 있는 저장공간, 필요에 의해 반복적으로 바꿀 수 있음.
		// 상수란? : 항상 같은 수 , 값을 바꾸지 않음(고정)
		
		// "=" 은 우리가 알던 수학적 기호의 의미 즉, "같다"는 의미를 지니는게 아니라 "대입"의 의미를 지님.
		
		
		//		왼쪽			=		오른쪽
		//		( 공간 )		=		( 값, 수 )
		//		( Variable )  = 	( Value )
		// 이때 오른쪽을 먼저 처리한다.
		
		
		int age;			// 변수 선언
							// int 자료형 == 4byte
							// 4byte 정수 공간에 age이름 부여
		
		age = 22;			// 변수공간에 값 "대입"
							// 이때 주의해야할 점이 age는 22과 같지 않음.
							// " 대입 " 의 개념
		
		
		System.out.println(22);
		System.out.printf("age : %d \n", age);
		
		age = 12;				// 값 변경 가능
		
		int num1 = 10;			// 변수를 초기화한다고 함.
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num3);
		System.out.println();
		
		
	}
}
