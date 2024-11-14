import java.util.Scanner;

public class Ch07 {
	public static void main(String[] args) {
		// 00 분기문
		// 조건문과 반복문 중간에서 코드블럭을 나눠서 처리하는 문법
		// 그 예로는 if문, switch문, for문, while문 등이 있다.
		
		
		// 01 if문
		// 조건문을 작성할 때 사용하는 구문.
		// 
		// 조건식이 참이라면 코드 블럭을 실행
		// 조건식이 거짓이라면 코드 블럭을 무시(스킵)
		// ++) else문을 통해 조건이 거짓일 경우의 실행코드를 지정 할 수 있다.
		
	
		// 조건식은 참 또는 거짓을 판단할 수 있는 식이여야만 한다.
		// 참과 거짓, 0과 1
		
		
		// 02 if문의 형식
	
		// 2-1) if문
		// 
		// if ( 조건식 ) {
	//														//
	//														// 조건식이 참이라면 이 실행코드 실행
	//														//
		//}
		
//		System.out.println("--------------- if문 - 간단 예제 ---------------");
//        Scanner sc = new Scanner(System.in);
//       
//        
//        if (true) {
//            System.out.println("조건식이 참이고 if문 진입");
//        }
//        System.out.println("if문 처리 이후 실행코드");
//        System.out.println();
//        
//        System.out.println("--------------- if문 - 예제 01 ---------------");
//      Scanner scanner = new Scanner(System.in);

//	    System.out.print("정수를 입력하세요 >>> ");
//	    int num = sc.nextInt();
//	
//	    // 첫번째 if문: 짝수 여부 체크
//	    if (num % 2 == 0) {
//          System.out.println(num + "는 짝수입니다.");
//          System.out.println("첫번째 if문 끝.");
//	    }
//	
//	      // 두번째 if문: 홀수 여부 체크
//	    if (num % 2 == 1) {
//          System.out.println(num + "는 홀수입니다.");
//          System.out.println("두번째 if문 끝.");
//	    }
//	      System.out.println();
		
	      
	      
	      
	        // IF문 문제 01)
	     // 사용자로부터 정수 하나를 입력받고 3의 배수이면 3의 배수입니다가 출력되도록 코딩하세요.
        
        // ### [대영님 해답] ###
//	      Scanner sc = new Scanner(System.in);
//	      System.out.print("정수를 하나 입력해주세요 >>> ");
//	      int num = sc.nextInt();
//	      
//	      if (num %3 == 0) {
//	         System.out.println(num + " 은 3의 배수입니다.");
//	      }
//	      else {
//	         System.out.println(num + " 은 3의 배수가 아닙니다.");
//	      }
        
        
        // ### [해답] ###
//	      Scanner sc = new Scanner(System.in);
//	      System.out.print("정수를 하나 입력해주세요 >>> ");
//	      int num = sc.nextInt();
//	      
//	      // 짝수 경우
//	      if (num %3 == 0) {
//	         System.out.println(num + " 은 3의 배수입니다.");
//	      }
//	      
//	      
//	      // 홀수 경우 
//	      // 1))
//	      if (num % 3 != 0){
//	         System.out.println(num + " 은 3의 배수가 아닙니다.");
//	      }
//	      // 2))
//	    
//	      if (num % 3 == 1 || num % 3 == 2	 ) {
//	    	  System.out.println(num + " 은 3의 배수가 아닙니다.");
//	      }
	      
	      
        // 2-2) if문과 else문

        // if ( 조건식 ) {
//        										//
//        										// 조건식이 참이라면 이 실행코드 실행
//        										//
        //} 
        // 
        // else {
//        										//
//        										// 조건식이 거짓이라면 이 실행코드 실행
//        										//
        //}
//      IF-ELSE문 문제 01
        // 사용자로부터 두 정수를 입력받는다.
        // 두 수의 합이 짝수면 "두 수의 합은 짝수입니다."
        // 두 수의 합이 홀수면 "두 수의 합은 홀수입니다" 
        // 위와 같은 결과값이 나오도록 코딩하세요 !
        
//      System.out.print("첫번째 정수를 입력해주세요 >>> ");
//      int num01 = sc.nextInt();
//      
//      System.out.print("두번째 정수를 입력해주세요 >>> ");
//      int num02 = sc.nextInt();
//      
//      int sum = num01 + num02;
//      if (sum % 2 == 0) {
//         System.out.println("두 수의 합 " + sum + " 은 짝수입니다.");
//      }
//      else {
//         System.out.println("두 수의 합 " + sum + " 은 홀수입니다.");
//      }
      
      
        // IF-ELSE문 문제 02
        // 사용자로부터 정수를 입력받는다.
        // 그 수가 num >= 2 && num <= 20 이면
        // 조건식이 참이면 "2 ~ 20범위 안에 있습니다."
        // 조건식이 거짓이며 "범위를 벗어났습니다."
        // 위와 같은 결과값이 나오도록 코딩하세요 !
      
//      System.out.print("정수를 입력해 주세요.");
//      int num01 = sc.nextInt();
//      
//      if (num01 >= 2 && num01 <= 20) {
//         System.out.println("입력한 값은 2 ~ 20 범위 안에 있습니다.");
//      }
//      else {
//         System.out.println("입력한 값은 2 ~ 20 범위를 벗어났습니다.");
//      }
        
        
        

        // 2-3) 중첩 if문
//         if (조건식1)
//         {
//        	 //조건이 참인 경우 실행되는 코드 블록
//         	if (조건식 2) {
//        		// 조건식1과 조건식 2가 모두 참인 경우 실행되는 코드 블록
//         	}
//         }
           
        // 2-4) 중첩 if문과 else문

         //if (조건식1)
         //{
//         	// 조건이 참인 경우 실행되는 코드 블록
//         	if (조건식 2) {
//         		// 조건식1과 조건식 2가 모두 참인 경우 실행되는 코드 블록
//         	}
         //}
         //else
         //{
//         	// 조건식1이 거짓인 경우 실행되는 코드 블록
         //}
        
//        System.out.println("----------------- 중첩 if-else문 활용 예제 -------------------");
//        // DB에 저장된 ID, PWD를 지정
//        String id = "ABC";			// ID
//        String pwd = "1234";		// PW
//        
//        
//        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("ID를 입력해주세요 >>>");
//        String input_id = sc.next();	
//        
//        
//        // 기존의 DB ID(ABC)와 입력한 ID(input_id)와 비교
//        if (id.equals(input_id)) {
//        	System.out.println("[SYSTEM] : ID가 일치합니다 !!");
//        	
//        	System.out.print("PW를 입력해주세요 >>>");
//        	String input_pw = sc.next();
//        	
//        	// 기존의 DB PW(1234)와 입력한 PW(input_pw)와 비교
//        	if(pwd.equals(input_pw)) {
//        		System.out.println("[SYSTEM] : PW가 일치합니다 !!");
//        		System.out.println("[SYSTEM] : LOGIN SUCCESS !!");
//        		System.out.println("[SYSTEM] : " + id + "님 환영합니다 !!"); 
//        	} else {
//        		// ID는 일치하나 PW가 일치하지 않는 경우
//        		System.out.println("[SYSTEM] : PW가 일치하지 않습니다. !!");
//        		System.out.println("[SYSTEM] : 프로그램을 종료하겠습니다 !!");	
//        	}
//        	
//        } else {
//        	// ID가 일치하지 않는 경우
////        	System.out.println("[SYSTEM] : ID가 일치하지 않습니다.");
//        	System.out.printf("[SYSTEM] : %s라는 ID는 존재하지 않습니다.\n", input_id);
//        	System.out.println("[SYSTEM] : 프로그램을 종료하겠습니다 !!");
//        }
        
      
        
		 
	       
//      If문 통합 문제 01)
     //	짝수이면서 3의 배수이면 출력
     //	홀수이면서 5의 배수이면 출력
//	      Scanner sc = new Scanner(System.in);
//	      
//	      System.out.println("정수를 입력해주세요.");
//	      int num = sc.nextInt();
//	      
//	      if (num % 2 == 0 && num % 3 == 0) {
//	         System.out.println("해당 값 " + num + " 은 짝수이며, 3의 배수입니다.");
//	      }
//	      else {
//	         if (num % 2 != 0 && num % 5 == 0) {
//	            System.out.println("해당 값 " + num + " 은 홀수이며, 5의 배수입니다.");
//	         }
//	      }
        
        
//		Scanner sc = new Scanner(System.in);
	    // 05 else - if 
	    // 다중분기
//	       System.out.println("--------------- else-if문 예제 01 ---------------");
//	       System.out.print("나이 입력 : >>> ");
//	       int age = sc.nextInt();
//
//	       if (age >= 20) {
//	           System.out.println("성인입니다.");
//	       } else if (age >= 8) {
//	           System.out.println("취학 아동입니다.");
//	       } else {
//	           System.out.println("미취학 아동입니다.");
//	       }
//        
//        
//        
//        
//        
        
        
        
        
           
      
	      
		
	}
}
