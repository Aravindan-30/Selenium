package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int num = 13;
		for (int i = 1; i < num; i++) {
			if(num %i ==0 ) {
				System.out.println("prime");
			}
			else {
				System.out.println("non prime");
			}
		}
	}

}
