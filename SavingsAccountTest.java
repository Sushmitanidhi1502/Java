package javassignment;
//Q17
public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(); //object1 with name saver1
		SavingsAccount saver2 = new SavingsAccount(); //object2
		saver1.setSavingsBalance(2000.00); //in obect 1 i am setting the balance
		saver2.setSavingsBalance(3000.00);
		SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
		
		saver2.calculateMonthlyInterest();
		System.out.printf("New Balance for Saver1=%f\n",saver1.getSavingsBalance());
		System.out.printf("New Balance for Saver2=%f\n",saver2.getSavingsBalance());
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		
		
		saver2.calculateMonthlyInterest();
		System.out.printf("New Balance for Saver1=%f\n",saver1.getSavingsBalance());
		System.out.printf("New Balance for Saver2=%f\n",saver2.getSavingsBalance());

	}

}
