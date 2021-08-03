

public class Hello04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int col = 4;	//가로 갯수
		int line = 7;	//줄 수
		for(int i = 0; i<line; i++) {
			if(i%2==0) {
				for(int t = 1+(col*i);t<=(col*(i+1));t++) {
					System.out.print(t+" ");
				}
				System.out.println();
			}
			else {
				for(int t = col*(i+1);t>(col*i);t--) {
					System.out.print(t+" ");
				}
				System.out.println();
			}
		}
	}

}
