import java.util.Scanner;

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
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("--------------- while - 무한 루프 예제 ---------------");
        //값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자 !!
        //값이 -1이라면 프로그램 종료 !!
//     
//        Scanner sc = new Scanner(System.in);
//       
//       int ar[] = new int[11];                     // 사용자가 입력한 횟수 만큼의 변수를 담기 위한 배열 선언
//                                              // 10번의 입력만 받으면 되지만 배열은 0부터 시작하므로 11까지 선언.
//       
//       char tmp;                                 // 한 글자씩 검사 하기 위해 담을 변수 선언
//       boolean output = true;                     // 결과 값을 저장 할 변수, True / False 밖에 없으므로 boolean 으로 선언
//    
//       int input_count = 10;                        // 사용자에게 남은 입력 횟수를 알리기위한 변수 선언
//       int minus = 0;                           // 입력 받은 값에 마이너스가 있는지 여부를 확인 하기 위한 변수 선언
//       
//       int num = 0;                              // while 문의 루프 횟수(index)를 담기 위한 변수 선언
//       while (num < 10) {
//          minus = 0;                              // 새로 루프를 시작시 minus 변수의 값을 0으로 조정.
//          num++;                                 // while 문의 루프 횟수(index)를 담은 변수를 루프 횟수가 반복 될때 마다 증가
//          System.out.println("덧셈 할 정수를 입력해주세요. (최대 10번의 입력 중 " + input_count + "번의 입력 남음, 글자 입력시 입력 중단)");
//          String input = sc.nextLine();               // 사용자가 루프문 중단을 위해 문자를 입력 할 수 있도록 String 을 사용
//          input_count--;                           // 남은 입력 횟수를 차감
//
//          
//         if (input.charAt(0) == '-') {               // 입력값의 맨 앞에 - 표시가 있다면
//            input = input.replaceAll("-","");           // 전체 구문에서 - 표시를 삭제
//            minus = 1;                           // 마이너스 구문을 삭제했다는 변수 값 조정
//         }                                    // (isDigit 명령어가 음수표시인 -를 글자로 인식하기 때문에 입력 값에 글자가 포함 되어 있는지
//                                             //  확인 하기전에 먼저 입력 값 맨 앞에 음수 표시를 확인 후 있다면 전부 삭제.
//                                             //    글자 앞에 - 표시가 있을 수 있으므로, 전체 input 변수에서 -를 모두 삭제 한 후
//                                             //   아래의 글자와 숫자를 구분하는 메소드를 실행해야함)
//         
//         
//          for (int i = 0 ; i < input.length(); i++) {      // 입력받은 문자열인 input 의 길이 만큼 반복문 진행
//                                              // (배열이 아닌 문자열이기에 length 가 아닌 length()를 사용)
//             
//             
//             tmp = input.charAt(i);                  // 한 글자씩 검사하기 위해서 char 형 변수인 tep 변수에 임시저장   
//             if(Character.isDigit(tmp) == false)         // 문자열이 숫자가 아닐 경우
//                output = false;                     // output 의 값을 false 로 변경
//          }
//          
//          if (minus == 1 && output == true)             // 입력받은 문자열에서 - 표시를 지움으로써 minus 변수가 1로 변동 되고,
//                                              // - 표시를 모두 지웠는데도 output 의 결과값이 true (숫자) 라면 
//                input = "-" + input;               // input 맨 앞에 - 를 추가하여 input 변수가 음수로 인식 할 수 있도록 - 부호 추가
//                                               
//
//          
//          if (output == false)   {                  // 사용자가 입력한 값이 글자일 경우 (output = false)
//             System.out.println("사용자의 글자 입력이 확인 되어 입력을 종료합니다.\n");
//             num--;                              // 글자 입력 확인으로 앞에서 num++로 카운트를 올렸던 루프 횟수 카운트 하나 감소
//             break;                              // 입력 값이 숫자가 아니므로, while 문에서 탈출
//          }
//          else {                                 // 사용자가 입력한 값이 숫자일 경우
//             int intInput = Integer.parseInt(input);      // 입력 값이 숫자인지 글자인지 검증을 위해 Scanner 의 입력을 String 으로 선언하였으므로, 
//                                              // input 변수를 int 형으로 변환
//             
//             ar[num] = intInput;                     // 배열에 While 문이 실행 된 값과 동일한 배열 변수에 입력 값 담기
//             if (input_count == 0) {                  // 10번의 입력을 모두 끝냈다면,
//                System.out.println("\n10번의 입력을 모두 실행하였으므로, 계산을 시작합니다.");
//                break;                           // While 구문 종료.
//                }
//             }
//          }
//
//       int count = 0;                           // 현재 while 문의 루프 횟수(index)를 담기 위한 변수 선언
//       int sum = 0;                              // 배열에 담은 수끼리 더한 값을 담기 위한 변수 선언
//       while (count < num) {                        // 앞의 while 문 에서 반복된 수 만큼 현재 while 문에서 반복
//          count++;                              // while 문의 루프 횟수 카운트
//          sum += ar[count];                        // sum 변수 안에 배열에 담긴 숫자를 더 함.
//       }
//       
//       if (sum < 0)                              // sum 이 0보다 작다면
//          System.out.println("사용자가 입력한 모든 수의 합이 0 보다 작음으로 프로그램을 종료합니다.");            
//       else
//          System.out.println("\n사용자가 입력한 모든 수의 합은 " + sum + " 입니다.\n");       // 사용자가 입력한 값을 모두 더 한 배열 값을 출력.
//        
//        
//        
//        
//        
//       System.out.println("--------------- while - 무한 루프 예제 ---------------");
//       //값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자 !!
//       //값이 -1이라면 프로그램 종료 !!
//    
//       Scanner sc = new Scanner(System.in);
//      
//      int ar[] = new int[11];                     // 사용자가 입력한 횟수 만큼의 변수를 담기 위한 배열 선언
//                                             // 10번의 입력만 받으면 되지만 배열은 0부터 시작하므로 11까지 선언.
//      
//      char tmp;                                 // 한 글자씩 검사 하기 위해 담을 변수 선언
//      boolean output = true;                     // 결과 값을 저장 할 변수, True / False 밖에 없으므로 boolean 으로 선언
//      int num = 0;                              // while 문의 루프 횟수(index)를 담기 위한 변수 선언
//      int input_count = 10;                        // 사용자에게 남은 입력 횟수를 알리기위한 변수 선언
//      int minus = 0;                           // 입력 받은 값에 마이너스가 있는지 여부를 확인 하기 위한 변수 선언
//      while (num < 10) {
//         minus = 0;                              // 새로 루프를 시작시 minus 변수의 값을 0으로 조정.
//         num++;                                 // while 문의 루프 횟수(index)를 담은 변수를 루프 횟수가 반복 될때 마다 증가
//         System.out.println("덧셈 할 정수를 입력해주세요. (최대 10번의 입력 중 " + input_count + "번의 입력 남음, 글자 입력시 입력 중단)");
//         String input = sc.nextLine();               // 사용자가 루프문 중단을 위해 문자를 입력 할 수 있도록 String 을 사용
//         input_count--;                           // 남은 입력 횟수를 차감
//
//         
//        if (input.charAt(0) == '-') {               // 입력값의 맨 앞에 - 표시가 있다면
//           input = input.replaceAll("-","");           // 전체 구문에서 - 표시를 삭제
//           minus = 1;                           // 마이너스 구문을 삭제했다는 변수 값 조정
//        }                                    // (isDigit 명령어가 음수표시인 -를 글자로 인식하기 때문에 입력 값에 글자가 포함 되어 있는지
//                                            //  확인 하기전에 먼저 입력 값 맨 앞에 음수 표시를 확인 후 있다면 전부 삭제.
//                                            //    글자 앞에 - 표시가 있을 수 있으므로, 전체 input 변수에서 -를 모두 삭제 한 후
//                                            //   아래의 글자와 숫자를 구분하는 메소드를 실행해야함)
//        
//        
//         for (int i = 0 ; i < input.length(); i++) {      // 입력받은 문자열인 input 의 길이 만큼 반복문 진행
//                                             // (배열이 아닌 문자열이기에 length 가 아닌 length()를 사용)
//            
//            
//            tmp = input.charAt(i);                  // 한 글자씩 검사하기 위해서 char 형 변수인 tep 변수에 임시저장   
//            if(Character.isDigit(tmp) == false)         // 문자열이 숫자가 아닐 경우
//               output = false;                     // output 의 값을 false 로 변경
//         }
//         
//         if (minus == 1 && output == true)             // 입력받은 문자열에서 - 표시를 지움으로써 minus 변수가 1로 변동 되고,
//                                             // - 표시를 모두 지웠는데도 output 의 결과값이 true (숫자) 라면 
//               input = "-" + input;               // input 맨 앞에 - 를 추가하여 input 변수가 음수로 인식 할 수 있도록 - 부호 추가
//                                              
//
//         
//         if (output == false)   {                  // 사용자가 입력한 값이 글자일 경우 (output = false)
//            System.out.println("사용자의 글자 입력이 확인 되어 입력을 종료합니다.\n");
//            num--;                              // 글자 입력 확인으로 앞에서 num++로 카운트를 올렸던 루프 횟수 카운트 하나 감소
//            break;                              // 입력 값이 숫자가 아니므로, while 문에서 탈출
//         }
//         else {                                 // 사용자가 입력한 값이 숫자일 경우
//            int intInput = Integer.parseInt(input);      // 입력 값이 숫자인지 글자인지 검증을 위해 Scanner 의 입력을 String 으로 선언하였으므로, 
//                                             // input 변수를 int 형으로 변환
//            
//            ar[num] = intInput;                     // 배열에 While 문이 실행 된 값과 동일한 배열 변수에 입력 값 담기
//            if (input_count == 0) {                  // 10번의 입력을 모두 끝냈다면,
//               System.out.println("\n10번의 입력을 모두 실행하였으므로, 계산을 시작합니다.");
//               break;                           // While 구문 종료.
//               }
//            }
//         }
//
//      int count = 0;                           // 현재 while 문의 루프 횟수(index)를 담기 위한 변수 선언
//      int sum = 0;                              // 배열에 담은 수끼리 더한 값을 담기 위한 변수 선언
//      while (count < num) {                        // 앞의 while 문 에서 반복된 수 만큼 현재 while 문에서 반복
//         count++;                              // while 문의 루프 횟수 카운트
//         sum += ar[count];                        // sum 변수 안에 배열에 담긴 숫자를 더 함.
//      }
//      
//      if (sum < 0)                              // sum 이 0보다 작다면
//         System.out.println("사용자가 입력한 모든 수의 합이 0 보다 작음으로 프로그램을 종료합니다.");            
//      else
//         System.out.println("\n사용자가 입력한 모든 수의 합은 " + sum + " 입니다.\n");       // 사용자가 입력한 값을 모두 더 한 배열 값을 출력.
////
//--------------------------------------------------- 문제 1번 풀이 2번째 ---------------------------------------------- 
//    
//    
//    Scanner sc = new Scanner(System.in);
//    
//    int count = 0;                                  // while 문의 반복 횟수를 위한 변수 선언 
//    int sum = 0;                                    // 입력 받으 값을 모두 더하기 위한 변수 선언
//    while (count != -1) {                           // count 가 -1 이 될때까지 while 구문 실행
//       System.out.println("\n지속 적으로 덧셈 할 값을 입력해주세요.(-1 입력시 종료)\n");
//        int input = sc.nextInt();                     // 사용자 입력값을 input 변수에 담는다.
//        
//        if (input == -1) {                           // 사용자 입력값이 -1 이라면 
//           count = input;                            // count 변수를 사용자 입력 값과 동일하게 변경 (while 문 탈출 시 종료되기 위함)
//           System.out.println("사용자로부터 -1을 입력받아 프로그램이 종료됩니다.\n입력 값의 최종 합산 값은 " + sum + " 입니다.");
//        }
//        
//        else {
//           sum += input;                             // sum 변수에 사용자 입력값 input 을 더 함.
//            System.out.println("\n기초 값 " + count + " 입력 값 " + input + " 의 합은 " + sum + " 입니다.\n");
//            count += input;                          // count 변수에 사용자 입력값 input 을 더 함.
//        }
//    }
//        
//       Scanner sc = new Scanner(System.in);
//      int num = 0;		// 값을 입력받는 변수
//      int sum = 0;		// 누적합을 저장해줄 변수
//      
//      while( true ) {
//    	  System.out.println("값을 입력해주시면 누적 합을 구해드릴게요 (종료 : -1) >>> ");
//    	  num  = sc.nextInt();
//    	  // 종료에 대한 유효성 검사(Validation Check)  == num 변수가 -1을 가지고 있는지
//    	  if (num == -1) {
//    		  // 무한 루프문 종료
//    		  break;
//    	  }
//    	  
//    	  sum += num;
//    	  System.out.println("[SYSTEM] 현재 누적 합 현황: " + sum);
//    	  
//      }
//      System.out.println("누적 합 : " + sum);
//      
      
      
//    
//    
//    
//    
//    문제 
//    System.out.println("--------------- while - if 문 문제 01 ---------------");
//    입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
//    Scanner sc = new Scanner(System.in);
//    
//    
//    System.out.println("입력한 값 안에 있는 모든 3의 배수들의 합을 구 할 정수 값을 입력하세요.");
//    int input = sc.nextInt();                                          // 사용자 입력 값을 input 에 저장
//    
//    int count = 0;                                                   // while 문의 반복 횟수를 지정하기 위한 변수 선언
//    int sum = 0;                                                   // 배수의 합을 계산하여 담기 위한 변수 선언
//    while (count <= input) {                                          // count 가 사용자 입력 값 보다 작거나 같다면
//       count++;                                                   // count 증가
//       if (count % 3 ==0) {                                          // count 를 3 으로 나눴을때 몫이 0 이라면
//          sum += count;                                             // sum 변수 안에 count 를 더함
//       }
//    }
//    System.out.println("입력한 값 " + input + "안의 3의 배수들의 총 합은 " + sum + " 입니다.");
//    
//    
//    문제 
//    System.out.println("--------------- while - if 문 문제 02 ---------------");
//    -1을 입력하기전까지 계속 정수를 받습니다
//     그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
//    
//    Scanner sc = new Scanner(System.in);
//    
//    int count = 0;                                    // while 문의 카운트를 세기 위한 변수 선언
//    int even_sum = 0;                                 // 짝수의 합을 담기 위한 변수 선언
//    int odd_sum = 0;                                 // 홀수의 합을 담기 위한 변수 선언
//    while (count != -1) {                              // count 값이 -1이 아니라면 while 문 선언
//       System.out.println("\n사용자 임의의 정수를 입력해주세요.(-1 입력시 종료)\n");
//        int input = sc.nextInt();                        // 사용자 입력값을 input 값에 담음
//        
//        if (input == -1) {                              // input 값이 -1 이 입력되었다면
//           count = input;                              // count 값을 입력 값으로 치환
//           System.out.println("사용자로부터 -1을 입력받아 프로그램이 종료됩니다.\n\n입력한 짝수의 합은 " + even_sum + " 이며, 홀수의 합은 " + odd_sum + " 입니다." );
//        }
//        else {                                       // input 값이 -1이 아니라면
//           if (input % 2 == 0) {                        // input 값을 2로 나눠 0이라면
//              even_sum += input;                        // 짝수로 판단하여 even_sum 변수에 input 값을 더함
//           }                                       
//           else {                                    // input 값을 2로 나눠 0이 아니라면
//              odd_sum += input;                        // 홀수로 판단하여 odd_sum 변수에 input 값을 더함
//           }
//        }
//    }
//    
//
//    문제
//    1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다
//    System.out.println("--------------- while - if문 문제 03 ---------------");
//    
//    
//    Scanner sc = new Scanner(System.in);
//    
//    int count_num = 0;                                    // 루프문 while 의 횟수를 확인 하기 위한 변수 선언
//    System.out.println("1부터 100까지 수 중에 3의 배수이면서 4의 배수를 출력합니다.");
//    while (count_num <= 100) {                              // count_num이 100 이하거나 같으면 while 문 실행 
//       count_num++;                                    // count_num 값 1 증가
//       if (count_num % 3 == 0) {                           // count_num 의 값이 3으로 나눠져 0이라면
//          if (count_num % 4 == 0) {                        // count_num 의 값이 4으로 나눠져 0이라면
//             System.out.println(count_num);                  // 해당 값을 화면에 출력
//          }
//       }
//    }
//    
//    
//    문제
//    System.out.println("--------------- while - if문 문제 04 ---------------");
//    소수를 판별하는 코드를 만드세요
//    소수 : 1과 자기자신으로만 나누어떨어지는 수 , % 연산자사용합니다)
//    
//    
//    Scanner sc = new Scanner(System.in);
//    
//    int count=1;                                             // 소수를 찾기 위한 while 문 안의 카운트를 위한 변수 선언
//    while (count >= -1) {                                       // count_main 값이 -1 보다 크거나 같으면
//       System.out.println("소수인지 여부를 확인 할 정수를 입력해주세요. (-1 을 입력시 프로그램 종료)");
//       
//        int input = sc.nextInt();                                 // 입력을 위한 scanner 실행 
//        
//        if (input == -1) {                                       // input 값이 -1 이라면 
//           System.out.println("사용자가 -1 을 입력하여 프로그램을 종료합니다.");
//       break;                                                // while 문 종료
//       }
//        
//        if (input == 1) {                                       // input 값이 1 이라면 
//           System.out.println("입력한 값 1 은 소수가 아닙니다.");
//       continue;                                             // while 문 종료
//       }
//        
//        if (input == 2) {                                       // input 값이 2 이라면
//           System.out.println("입력한 값 2 은 소수 입니다.");
//           continue;                                          // while 문 종료
//        }
//        
//        count = 1;                                             // 소수를 찾기 위해 반복문을 실행하기전 변수 초기화 
//        while (input >= count) {                                 // input 값이 count 보다 크거나 같을때
//           count++;                                          // count 값을 증가
//           
//           if (input == count) {                                 // input 값이 count 수와 같다면 어차피 나누어 떨어짐으로 소수라 판정. 
//              System.out.println("입력한 값 " + input + " 은 소수 입니다.");
//               break;                                          // while 문 반복 종료
//           }
//           
//           if (input % count == 0) {                              // input 값을 count 값으로 나눴을때 몫이 0이 나온다면
//              System.out.println("입력한 값 " + input + " 은 소수가 아닙니다.");
//              break;                                          // while 문 반복 종료
//           }
//           
//        }
//    }
//        
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("소수를 판별하는 프로그램입니다.");
//        System.out.println("정수 하나를 입력해주세요 >>> ");
//        // 소수 판별 대상인 수 num
//        int num = sc.nextInt();
//        
//        // 1. 1로 나누어 떨어져야 한다.
//        
//        // 2. num으로 나누어 떨어져야 한다.
//        
//        // ==> 모든 수의 공통점 : 1, 자기자신으로 나누어 떨어진다
//        
//        // 소수만은 1과 자기자신의 사이의 수들로는 절대 나누어 떨어지지 않는다 == 딱 2번만 떨어진다.
//        
//        // 1부터 입력받은수까지 while을 반복하게 되면 num번 반복 ==> while에서 사용하는 탈출용 변수 i라는 수는 1부터 num까지의 모든 수의 폼을 가짐.
//        // 나누어 떨어질 때마다 카운트를 세는 방식으로 while반복문을 실행
//        // 반복문이 끝나게 되면 count == 2일 때는 소수, 아닐땐 소수 X
//        
//        // 나누어떨어질 때 횟수를 카운트해줄 변수
//        int count = 0;
//        
//        int i = 1;
//        while (i <= num) {
//        	if (num % i == 0) {
//        		// 1부터 num사이의 수 중에서 나누어떨어지는 수가 있다면 if문 내부로 진입
//        		count++;
//        	}
//        	i++;
//        }
//        
//        if (count == 2) {
//        	System.out.println(num + " : 소수");
//        } else {
//        	System.out.println(num + " : 소수 X");
//        }
//        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}

}
