package Ch13;

//문제 1: 학생 클래스 만들기

//1. Student 클래스를 작성하세요.
//2. name과 age라는 두 개의 속성을 가지도록 클래스를 구성하세요.
//3. name과 age라는 정보를 각각 초기화하세요!
//4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.

class student {
	   // 속성 (멤버 변수) 선언
	   String name;
	   int age;
	   
	   // 메서드 : 속성을 출력하는 메서드
	   public void displayinfo() {
	      System.out.println("Name : " + name);
	      System.out.println("Age : " + age);
	      
	   }
	}

	public class C03PracStudent {
	   public static void main(String[] args) {
	      student dong = new student();
	      // displayinfo() 메서드를 사용해서 학생정보를 출력
	      
	      dong.name = "대영";
	      dong.age = 90;
	      
	      dong.displayinfo();
	   }
	}
