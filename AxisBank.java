package Week3Assignment;

public class AxisBank {

	public void deposit() {
		System.out.println("Deposit: overriding");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo b = new BankInfo();
		b.deposit();
		AxisBank ab = new AxisBank();
		ab.deposit();

	}

}
