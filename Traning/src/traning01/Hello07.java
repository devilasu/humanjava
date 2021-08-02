package traning01;
public class Hello07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc(12,32);
	}
	
	static void calc(int first, int second) {
		int mLeast = 1;
		int tmpFirst = first;
		int tmpSecond = second;
		boolean loop = true;
		int tmp=2;
		while(loop) {
			if(tmpFirst%tmp==0 &&tmpSecond%tmp==0) {
				tmpFirst= tmpFirst/tmp;
				tmpSecond = tmpSecond/tmp;
				mLeast = mLeast*tmp;
				tmp = 2;
			}else {
				tmp++;
				if(tmp>tmpFirst || tmp>tmpSecond)
					loop=false;
			}
		}
		
		System.out.println(first+", "+second+"최대공약수: "+mLeast);
		System.out.println(first+", "+second+"최소공배수: "+ first*second/mLeast);
	}
}
