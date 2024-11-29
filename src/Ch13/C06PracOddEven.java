package Ch13;




//프로그램은 sum 메소드를 통해 주어진 숫자들에 대한 홀수와 짝수의 합을 계산하고, 그 결과를 출력하는 간단한 프로그램입니다.
public class C06PracOddEven {


	// x, y, z, w 각각 짝수 판별 후
	// 짝수면 짝수의 합에 더하고
	// 홀수면 홀수의 합에 더하고
	
	// 최종적으로 짝수의 합과 홀수의 합을 출력하고 x+y+z+w의 값을 반환하세요!!
	
	// 결과값
	// 짝수의 합 : 32
	// 홀수의 합 : 132
	// result = 164
	
	
	public static void main(String[] args) {
    	
    	// sum 메소드를 호출하여 인수로 20, 21, 12, 111을 전달하고 반환값을 변수에 저장 후 결과를 출력
		
		C06PracOddEven test = new C06PracOddEven();
    	
        int result = test.sum(20, 21, 12, 111);

        System.out.println("result = " + result);
    }
}
