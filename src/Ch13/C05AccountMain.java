package Ch13;

public class C05AccountMain {
	// 속성(멤버 변수) 선언
	private String accountNumber;		// 계좌번호
	private int balance;				// 계좌잔액
	
	// 생성자
	public C05AccountMain(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	
	
	// 메서드
	// 입금 메서드
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금 완료. 현재 잔액 : $" + balance);
		
	}
	
	// 출금 메서드
	public void withdraw(int amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("출금 완료. 현재 잔액 : $" + balance);
		} else {
			// 출금할 돈의 양이 더 많은 경우\
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
	// 계좌 잔액 확인 메서드
	public int getBalance() {
		
		return balance;
		
	}
	
	public static void main(String[] args) {
		
		// 통장 개설
		C05AccountMain myAcc = new C05AccountMain("111-2222-1234", 1000000);
		
		// 입금
		myAcc.deposit(5000000);
		
		// 출금
		myAcc.withdraw(5000000);
		
		// 계좌 잔액 확인
		System.out.println("현재 잔액 : $" + myAcc.getBalance());
		
		
		
	}
	
	
	

}
