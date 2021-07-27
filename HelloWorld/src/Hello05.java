public class Hello05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 0;
//		int b = 1;
//		int c = 0;
//		int max = 10000;
//		while(c<max) {
//			if(c==0) {
//				c=a+b;
//				System.out.println(0);
//				System.out.println(1);
//				continue;
//			}
//			System.out.println(c);
//			a=b;
//			b=c;
//			c=a+b;
//		}
		fibonachi(0, 1, 10000);
	}
	static void fibonachi(int a, int b, int max) {
		if(a+b<max) {
			if(a == 0) {
				System.out.println(0);
				System.out.println(1);
				fibonachi(b, a+b, max);
			}else {
				System.out.println(a+b);
				fibonachi(b,a+b,max);
			}
		}
	}
}
