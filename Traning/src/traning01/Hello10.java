package traning01;
import java.util.ArrayList;

public class Hello10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("John");
		studentName.add("Jane");
		studentName.add("Jacob");
		studentName.add("Johanson");
		studentName.add("Jason");
		studentName.add("James");
		for(int i = 0 ; i<studentName.size();i++) {
			System.out.println(studentName.get(i));
		}
		System.out.println("\n\n\n");
		studentName.set(3, "Jefferson");
		for(int i = 0 ; i<studentName.size();i++)
			System.out.println(studentName.get(i));

		studentName.remove(3);
		System.out.println("\n\n\n");
		for(int i = 0 ; i<studentName.size();i++)
			System.out.println(studentName.get(i));
		
		studentName.remove("Jason");
		System.out.println("\n\n\n");
		for(int i = 0 ; i<studentName.size();i++)
			System.out.println(studentName.get(i));
		
		studentName.clear();
		System.out.println("\n\n\n");
		for(int i = 0 ; i<studentName.size();i++)
			System.out.println(studentName.get(i));
	}

}
