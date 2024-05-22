package methodoveriding;

public class NMBBank extends CentralBank{

	@Override
	void getBankName() {
		 System.out.println("NMB Bank");
	}
	
	@Override
	void getInterestRate() {
		 System.out.println("10%");
	}
}
