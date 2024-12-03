package Ch14;


//부모 클래스 : SmartPhone

//속성
//인치(사이즈)
//배터리 용량
//==========================================================
//자식 클래스 : SmartPhoneWithCamera
//속성
//카메라 해상도(메가픽셀)

//기능
//printDetails() 	: 스마트폰의 속성 정보 출력
public class C01PracSmartPhone {
	public static void main(String[] args) {
		// SmartPhoneWithCamera 객체 생성
		// 														인치, 배터리용량, 카메라 해상도(메가픽셀)
		SmartPhoneWithCamera myPhone = new SmartPhoneWithCamera(6, 4000, 108); 	
		// 스마트폰 속성 출력
		myPhone.printDetails();					
		// [결과값]
		// 6인치
		// 4000mAh
		// 108MP 
	}

}
