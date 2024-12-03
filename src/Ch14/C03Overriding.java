package Ch14;



class Exam {
	int num1;
	
	public void printNum1() {
		System.out.println(num1);
	}
	
}

class Example extends Exam {
	int num2;
	

	public void printNum1() {
		System.out.println("hello world");
	}
	public void printNum2() {
		System.out.println(num2);
	}
}
public class C03Overriding {
	
	public static void main(String[] args) {
		
//		Exam obj = new Exam();
//		obj.num1 = 10;
//		obj.printNum1();
////		obj.num2 = 20;		// X
////		obj.printNum2();	// X
//		
//		Example obj1 = new Example();
//		obj1.num1 = 100;
//		obj1.printNum1();
//		obj1.num2 = 200;
//		obj1.printNum2();
		
		
		Exam obj2 = new Example();
		obj2.num1 = 120;
		obj2.printNum1();
//		obj2.num2 = 220;
//		obj2.printNum2();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
