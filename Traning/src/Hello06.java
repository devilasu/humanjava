

public class Hello06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNum(10000);
	}
	
	static void primeNum(int max) {
		boolean prime = true; 
		for(int i = 2 ; i<max;i++) {
			prime = true;
			for(int n=2; n<i-1;n++) {
				if(i%n==0) {
					prime=false;
					break;
				}
			}
			if(prime)
				System.out.println(i);
		}
	}
}
