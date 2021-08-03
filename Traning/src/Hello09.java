
import java.util.Scanner;

public class Hello09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		int inNum = s.nextInt();
		s.close();
		factorial(inNum);
	}
	
	static void factorial(int max) {
		if(max>10)
			System.out.println("10보다 큰 수 입니다.");
		else {
			int result = 1;
			for(int i = 1; i<=max;i++) {
				result = result*i;
			}
			System.out.println(result);
		}
	}
}
