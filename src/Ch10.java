import java.util.Scanner;

public class Ch10 {
	public static void main(String[] args) {
		// 중첩 while문
		
		// 문제
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
		
		
		// 문제
		// 구구단 2단 출력(역순출력)
		
		
		
		//문제
		//구구단 N단 출력(입력받기)
		
		

		//전체 구구단(2단-9단) 출력하기
		
		//전체 구구단(2단-9단) 출력하기 (전체 역순출력)
		
		//1
		//*****
		//*****
		//*****
		//*****
		
		
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
//		int i =1;
//		while(i <= 4) {
//			System.out.println("*****");
//			i++;
//		}
		
		
		
		// ----------------- 개행 찍기 구간 --------------------
//		int i = 1;
//		while(i <= 4) {
//			
//			// ----------------- 별 찍기 구간 --------------------
//			int j = 1;
//			while (j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			// --------------------------------------------------
//			
//			System.out.println();
//			i++;
//		}
		// --------------------------------------------------
		
	      //2
	      //*
	      //**
	      //***
	      //****
	      
//	      int count = 0;
//	      int star= 0;
//	      while (count <= 3) {
//	         count++;
//	         while (star < count) {
//	            star++;
//	            System.out.print("*");
//	         }
//	         System.out.println("");
//	         star=0;
//	      }
//	      
	      
	      //높이 : 4
	      //*
	      //**
	      //***
	      //****
	      
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("1부터 입력 값까지 순차적으로 많아질 별의 최대 높이를 입력하세요.");
//	      int input = sc.nextInt();
//	
//	      int count=1;
//	         while (count <= input) {
//	            while (count <= input) {
//	               count++;
//	               System.out.print("*");
//	            }
//	            input--;
//	            count=1;
//	            System.out.println("");
//	         }
	      
	      
	      //3
	      //****
	      //***
	      //**
	      //*
	      
//	      int count=4;
//	      int star=4;
//	         while (count >= 1) {
//	            while (star >= count) {
//	               star--;
//	               System.out.print("*");
//	            }
//	            System.out.println("");
//	            count--;
//	            star=4;
//	         }
	      
	      
	            
	      //높이 : 4
	      //****
	      //***
	      //**
	      //*
	         
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("입력 값부터 순차적으로 작아질 별의 최대 높이를 입력하세요.");
//	      int input = sc.nextInt();
	//
//	      int count=input;
//	         while (count <= input && input > 0) {
//	            while (count <= input && count > 0) {
//	               count--;
//	               System.out.print("*");
//	            }
//	            input--;
//	            count=input;
//	            System.out.println("");
//	         }
	         
	      
	         
	      //4
	      //   *
	      //  ***
	      // *****
	      //*******
	         
	      
//	      int count=1;
//	      int line=1;
//	      int star=1;
//	      
//	      while (line <= 4) {
//	         while (count <= (4-line)) {
//	            count++;
//	            System.out.print(" ");
//	         }
//	         
//	         count=1;
//	         
//	         while (count <= star) {
//	            count++;
//	            System.out.print("*");
//	         }
//	         count=1;
//	         star+=2;
//	         line++;
//	         
//	         System.out.println("");
//	      }
	      
	      
	      
	      //높이 : n 
	      //     *
	      //    ***
	      //   *****
	      //  *******
	      
	      
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("트리 이미지를 만들 높이를 입력하세요.");
//	      int input = sc.nextInt();
//	      
//	      int count = 1;
//	      int line = 1;
//	      int star = 1;
//	      
//	      while (line <= input) {
//	         while (count <= (input-line)) {
//	            count++;
//	            System.out.print(" ");
//	         }
//	         
//	         count=1;
//	         
//	         while (count <= star) {
//	            count++;
//	            System.out.print("*");
//	         }
//	         
//	         System.out.println("");
//	         
//	         count=1;
//	         star+=2;
//	         line++;
//	      }
	      
	      
	      //5
	      //***********
	      // *********
	      //  *******
	      //   *****
	      //    ***
	      //     *
	      
		
		// [대영님 해답]
//	      int count=1;
//	      
//	      int line=4;
//	      int line_count=1;
//	      
//	      int star=-1;
//	      int star_count=1;
	//
//	      
//	      while (count <= line) {
//	         star+=2;
//	         count++;
//	      }
//	      
//	      count=1;
//	      
//	      while (line_count <= line) {
//	         
//	         while (count < line_count) {
//	            System.out.print(" ");
//	            count++;
//	         }
//	         
//	         while (star_count <= star) {
//	            System.out.print("*");
//	            star_count++;
//	         }
//	         count=1;
//	         star+=-2;
//	         star_count=1;
//	         line_count++;
//	         System.out.println();
//	      }
		
		
		  //*******
	      // *****
	      //  ***
	      //   *
		
		
		// [해답]
		//			i			j			k
		// 			1			0			7
		//			2			1			5
		//			3			2			3
		//			4			3			1
		// 	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//			n			n-1			9 - 2 * n
//		
//		int i = 1;
//		while(i <= 4) {
//			// 공백찍기 (i = 1일때는 공백찍기 X)  j
//			int j =1;
//			while(j <= i - 1) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			// 별찍기							k
//			int k = 1;
//			while(k <= 9 - 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
	      
	      
	      //높이 : n
	      //*******
	      // *****
	      //  ***
	      //   *
	      
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("아래로 작아지는 트리 이미지를 만들 높이를 입력하세요.");
//	      int line = sc.nextInt();
//	      
//	      int count=1; int line_count=1; int star=-1; int star_count=1;
	//
//	      
//	      while (count <= line) {
//	         star+=2;
//	         count++;
//	      }
//	      
//	      count=1;
//	      
//	      while (line_count <= line) {
//	         
//	         while (count < line_count) {
//	            System.out.print(" ");
//	            count++;
//	         }
//	         
//	         while (star_count <= star) {
//	            System.out.print("*");
//	            star_count++;
//	         }
//	         count=1;
//	         star+=-2;
//	         star_count=1;
//	         line_count++;
//	         System.out.println();
//	      }
	      
	      
	      //6
	      //   *
	      //  ***
	      // *****
	      //*******
	      // *****
	      //  ***
	      //   *
	      
//	      int count=1;
//	      int line=1;
//	      int star=-1;
//	      
//	      while (line <= 7) {
//	         if (line > 4 && line <= 7) {
//	            while (count <= (line-4)) {
//	               count++;
//	               System.out.print(" ");
//	            }
//	            star+=-2;
//	         }
//	         else {
//	            while (count <= (4-line)) {
//	               count++;
//	               System.out.print(" ");
//	            }
//	            star+=2;
//	         }
//	         
//	         
//	         count=1;
//	         while (count <= star) {
//	            count++;
//	            System.out.print("*");
//	         }
//	         
//	         count=1;
//	         line++;
//	         
//	         System.out.println("");
//	      }
	}
}
