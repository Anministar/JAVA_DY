
// ### JAVA의 실행과정 ###
// 1. 한글, 영어 등등 Source code 작성

// 2. Compiler에 의한 Byte Code 변환 (기계어로 변환 X, .java File --> .class File )


// 3. JVM(Java Virtual Machine, 인터프리터)를 통해 바이트 코드를 실행
//		: JVM은 자바 프로그램이 어떤 운영체제에서든 동일하게 실행될 수 있도록 해주는 인터프리터 역할을 함.
//		: JVM의 역할은 메모리 관리, 가비지 컬렉션 등 프로그램이 안정적으로 실행되도록 도와줌.

// 4. RUN (실행)


// ## 기본적인 Eclipse 단축키 ##
// ctrl + space : 자동완성
// ctrl + f11	: 실행
// ctrl + (+ or -) : 글자 크기 조정
// ctrl + n 	: 파일 생성 시 선택창
// ctrl + /		: 주석 단축키



// 01 JAVA 주석
// 주석 : 프로그램 코드 내에 삽입된 사용자의 메모를 의미.
// ==> 코드 실행 결과 영향 X

// # 주석 종류 #
// //	 : 주석
// /* */ : 여러 줄 주석

// 02 JAVA의 기본구조
public class Ch01 {							// 클래스 영역 - 객체 지향 코드 구현 단위
	// public class Ch01 	: 1. 하나의 public 클래스로 시작.
	//						: 2. 클래스는 파일 이름과 동일해야 함.

	public static void main(String[] args) {			 // 메서드 영역 - 절차 지향 구현 단위, main 메서드의 선언부
	
		
		// ## 메서드의 정의와 종류 ##
		// 0. 메서드(기능)			: 특정 기능 수행, C언어의 함수 개념과 유사
		// 1. 메인 메서드			: 최초 실행되는 함수
		// 2. 라이브러리 메서드		: 개발편의를 위해서 미리 만들어져 제공되는 함수
		// 3. 사용자 정의 메서드	: 개발자가 정의한 (만든) 함수
		
		System.out.println("HELLO WORLD");			// 출력 함수(메서드) 실행, function call이라고 함.
													// ';' : 코드의 마침표 역할
													// 모니터에 우리가 작성한 텍스트를 console창에 출력하는 역할(기능)
		
		
		// 03 ESCAPE 문자
		
		// '정보 표시' 목적으로 사용된 기존 그래픽 문자 (영소문자, 숫자, 특수문자)와는 다르게
		// '제어' 목적으로 사용되는 특수문자
		
		// \ (역슬래쉬)를 앞에 붙여 사용
		
		
		// 1. \n : 개행(줄바꿈)
		// 2. \t : 탭 기능
		// 3. \' : '(작은 따옴표) 출력
		// 4. \" : "(큰 따옴표) 출력
		// 5. \\ : \ 출력 ( 폴더 경로 구분 시 잘 사용됨 )
		
		System.out.print("여기여기\n");
		System.out.println("HELLO, WORLD!");
		System.out.println("This is a new line.\n Second line\twith a tab");
		System.out.println("Single quote : \'\tDouble quote : \"");
		System.out.println("Backslash \\");
		
		
		
		// ## 표준 출력 함수 ##
		// System.out			: 표준 출력 스트림
		// System.out.print()	: 줄바꿈 X
		// System.out.println() : 줄바꿈 O (포함, ln = \n)
		// System.out.printf()	: 서식문자를 사용할 수 있는 출력 메서드, printf의 의미(format : 형식, 서식)
		
		
		// 서식이란?	: 서류를 꾸미는 일정한 양식
		// 서식문자란? : 서식공간에 자료를 대입하여 화면에 출력하거나 입력받기 위한 용도의 문자
		//			: ==> 자리를 지정해주는 문자
		// %d : decimal의 약자			10진수(정수) 서식문자
		// %f : float의 약자				10진수(실수) 서식문자
		// %c : character의 약자			한문자 서식문자
		// %s : String의 약자				문자열 서식문자
		// %o : Octal의 약자				8진수(정수) 서식문자
		// %x : Hexadecimal의 약자		16진수(정수) 서식문자
		// 주의점 : 타입이 다르면 안됨 !!!!
		
		System.out.printf("%d점을 맞았습니다. \n", 100);
		System.out.printf("%d \n", 100 + 200);
		System.out.printf("%d %d %d \n", 1, 2, 3);
		
		
		System.out.printf("%f \n", 123.5);
		// 소수점 제한 : %.2f : 소수점 둘쨰 자리까지 출력
		System.out.printf("%f\n", 3.141591123);
		
	
		
		// '' 안에는 하나의 문자만 컴파일러가 해석하는거라 한 문자 이상이면 에러
		System.out.printf("%c %c %c \n", 'A', 'B', 'C');
		
		
		// 단어, 문장
		System.out.printf("%s %s %s \n", "This is ", "JAVA", "CLASS");
		System.out.printf("%s \n", "This is JAVA Class");
		System.out.println();			// 빈줄 삽입
		
		System.out.println("안녕");
		
		
		
		
//		 문제 01)
//		다음과 같이 출력 합니다.
//		NO	이름			나이		성별		주소
//		1	이동하		26		M		대구
//		2	코리아		12		W		대구
//		3	IT			32		M		대구
		
		System.out.println("--------------- 서식문자 문제 01 - 방법1 ---------------");
		System.out.printf("%s	%s	%s	%s	%s\n", "NO", "이름", "나이", "성별", "주소");
		System.out.printf("%d	%s	%d	%c	%s\n", 1, "김광수", 35, 'M', "대구");
		System.out.printf("%d	%s	%d	%c	%s\n", 2, "이태수", 55, 'W', "울산");
		System.out.printf("%d	%s	%d	%c	%s\n", 3, "이지성", 44, 'M', "김해");
		System.out.println();
		System.out.println("--------------- 서식문자 문제 01 - 방법2 ---------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n", "NO", "이름", "나이", "성별", "주소");
		System.out.printf("%d\t%s\t%d\t%c\t%s\n", 1, "김광수", 35, 'M', "대구");
		System.out.printf("%d\t%s\t%d\t%c\t%s\n", 2, "이태수", 55, 'W', "울산");
		System.out.printf("%d\t%s\t%d\t%c\t%s\n", 3, "이지성", 44, 'M', "김해");
		System.out.println();
	
		// 문제 02
		// 서식문자를 사용하여 다음과 같은 결과값을 출력해보세요 !!
		// 
		// [결과값]
		// 이름 : 이동하
		// 나이 : 12
		// 성별 : M
		// 키   : 192.200000
		// 주소 : "대구광역시 중구 중앙대로 123-111"
		System.out.println("--------------- 서식문자 문제 02 ---------------");
		System.out.printf("이름 : %s\n", "이동하");
		System.out.printf("나이 : %d\n", 12);
		System.out.printf("성별 : %c\n", 'M');
		System.out.printf("키   : %f\n", 192.2);
		System.out.printf("주소 : %s", "\"대구광역시 중구 중앙대로 123-111\"\n");
		System.out.println();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
