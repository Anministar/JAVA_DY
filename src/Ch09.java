
public class Ch09 {
	public static void main(String[] args) {
		// 00 반복문
		// 반복적인 실행이 필요할 때 반복문을 사용함.
		
		// 01 while문의 구조
		// 조건식이 참인 경우 반복적으로 코드를 실행한다.
		
//		while(조건) {
//			반복 실행 코드;			// 예) 조건이 참이면 코드 실행
//									//          조건이 거짓이면 반복문 종료
//		}
		
		
//		// 탈출용 변수
//		int i = 1;
//		
//		// 탈출용 조건식
//		while(i <= 10) {
//			System.out.println("HELLO WORLD");
//			i++;		// 탈출을 위한 연산식
//		}
//		
		
		
		// 1부터 10까지의 합을 구하기
		
		// 합을 저장해줄 변수 선언
//		int sum = 0;
//			
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
//		
//		
//		int i =1;
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
        //문제
        System.out.println("--------------- while문 문제 01 ---------------");
        //정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요
        //이때 받는 수는 n이 m보다 작아야 합니다(제약조건)
      
//        
//        Scanner sc = new Scanner(System.in);
//      
//      System.out.println("첫번째 정수를 입력해주세요.");
//      int n = sc.nextInt();
//      
//      System.out.println("첫번째 정수보다 작은 두번째 정수를 입력해주세요.");
//      int m = sc.nextInt();
//      
//       
//      
//      if (m >= n) {
//         int sum = 0;
//         while(m >= n) {
//            sum += n;
//            n++;
//         }
//         System.out.println("Value : " + sum);
//      }
//      
      
        
        
        System.out.println("--------------- while - 무한 루프 예제 ---------------");
        // 값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자 !!
        // 값이 -1이라면 프로그램 종료 !!
		
        //문제 
        System.out.println("--------------- while - if문 문제 01 ---------------");
        //입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
        
        //문제 
        System.out.println("--------------- while - if문 문제 02 ---------------");
        //-1을 입력하기전까지 계속 정수를 받습니다
        // 그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
        

        //문제
        //1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다
        System.out.println("--------------- while - if문 문제 03 ---------------");
        
        
        //문제
        System.out.println("--------------- while - if문 문제 04 ---------------");
       // 소수를 판별하는 코드를 만드세요
       // 소수 : 1과 자기자신으로만 나누어떨어지는 수 , % 연산자사용합니다)
		
	}

}
