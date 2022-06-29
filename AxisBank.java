package week3.assignment;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposit method from AxisBank");
	}
	//Method overriding
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		
		BankInfo b = new BankInfo();
		b.deposit();
		
		BankInfo.saving();
	}

}
