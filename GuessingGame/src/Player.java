
public class Player {
	int number = 55; // where the guess goes
	 
	 public void guess() {
		 number = (int) (Math.random() * 100);
		 System.out.println("IÕd like to buy a number Bob! I'll take a... " 
				 			+ number);
	 }
	}
