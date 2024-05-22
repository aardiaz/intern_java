package methodoveriding;

public class Test {

	public static void main(String[] args) {

		// static or early binding of object
		NabilBank nb = new NabilBank();

		nb.getBankName();
		nb.getInterestRate();

		// up-casting
		CentralBank bank = new NabilBank();
	}

	//dynamic or late binding of object
	//run time polymorphism
	void printBankInfo(CentralBank  cb) {
		
		cb.getBankName();
		cb.getInterestRate();
	}
}
