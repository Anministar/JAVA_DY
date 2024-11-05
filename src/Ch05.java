import java.util.*;
// import java.util.Scanner;


public class Ch05 {
	public static void main(String[] args) {
		
		// 00 입력문 (값 입력 받기, Scanner)
		
		// System.out		: 표준 출력 스트림 생성 - 모니터
		// System.in		: 표준 입력 스트림 생성 - 키보드
		

		// 실수
		// nextDouble()
		// nextFloat()
		
		// 정수
		// nextInt()
		// nextLong()
		// nextByte()
		// nextShort()
		
		// 논리
		// nextBoolean()
		
		// 한 단어(String)
		// next()
		
		// 한 줄(String)
		// nextLine()
		
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("-----------------Scanner 예제 01-----------------------");
//		System.out.print("정수를 하나 입력해주세요 >>> ");
//		String s = sc.next();		//  next()	: 한문자열(단어), 띄워쓰기 기준으로 한 문자열만 가능
//									//  nextLine() : 한 줄
//									//  nextInt()  : 숫자로 나옴. 대신 변수 앞에 String이 아니라 int로 바꿔야함.
//		System.out.println("입력한 문자열 : " + s);
//		System.out.println();
//		
//		System.out.println("--------------- Scanner 예제 02 ---------------");
//		System.out.println("정수 세개를 입력해주세요 >>> ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
		
		
		System.out.println("--------------- Scanner 버퍼 비우기 예제 ---------------");
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		System.out.println("입력한 수 출력 : " + num);
		
		sc.nextLine(); 		 // 버퍼공간에 있는 개행문자 제거	== 버퍼 초기화
		
		
		System.out.print("문자열 입력 : ");
		String text = sc.nextLine();
		System.out.println("입력한 텍스트 출력 : " + text);
		
		
//		## 입출력 실습 예제 ##
//		System.out.println("--------------- Scanner 문제 01 ---------------");
//		문제 01)
		// 직사각형의 가로와 세로 값을 사용자로부터 입력받고 
		// 직사각형의 둘레와 넓이를 구하는 프로그램을 구현해보세요
		// 직사각형의 둘레 = (가로길이 + 세로길이) * 2
		// 직사각형의 넓이 = 가로길이 * 세로길이
		

		
//		System.out.println("가로 길이를 입력하세요 >>> ");
//		int num = sc.nextInt();
//		System.out.println("세로 길이를 입력하세요 >>> ");
//		int num1 = sc.nextInt();
//		int dul = (num + num1) * 2;
//		int siz = num * num1;
//		System.out.println("직사각형의 둘레 = " + dul);
//		System.out.println("직사각형의 넓이 = " + siz);
		System.out.println();
		
		
//		문제 02)
//		System.out.println("--------------- Scanner 문제 02 ---------------");
		//이름을 입력하세요? 홍길동
		//홍길동 님의 나이를 입력하세요? 24
		//홍길동 님의 주소를 입력하세요? 대구광역시 중구 중앙대로 365-123
		//홍길동님의 나이는 24세 주소는 대구광역시 중구 중앙대로 365-123입니다.
//		System.out.print("이름을 입력하세요?");
//		String name = sc.nextLine();
//		
//		System.out.printf("%s 님의 나이를 입력하세요?",name);
//		int age = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.printf("%s 님의 주소를 입력하세요?",name);	 
//		String addr = sc.nextLine();
//		
//		
//		System.out.printf("%s 님의 나이는 %d세, 주소는 %s 입니다",name,age,addr);
//		System.out.println();
		
	}
}
