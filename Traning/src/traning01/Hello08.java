package traning01;
import java.util.Scanner;

public class Hello08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		int max = s.nextInt();
		s.close();
		sum(max);
	}
	static void sum(int max) {
		int tmpSum=0;
		for(int i = 1; i<=max;i++) {
			tmpSum+=i;
		}
		System.out.println(tmpSum);
	}
}
