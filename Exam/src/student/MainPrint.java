package student;

public class MainPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "KYJ";
		s1.nYear = 4;
		s1.nClass = 1;
		s1.nNumber = 2008;
		s1.birthday = "19900120";
		s1.gender="male";
		s1.mobile="01034434102";
		System.out.println("�̸�: "+s1.name);
		System.out.println("�г�: "+s1.nYear);
		System.out.println("�а�: "+s1.nClass);
		System.out.println("�й�: "+s1.nNumber);
		System.out.println("����: "+s1.birthday);
		System.out.println("����: "+s1.gender);
		System.out.println("��ȭ��ȣ: "+s1.mobile+"\n");
		
		Computer c1 = new Computer();
		c1.memory = 4096;
		c1.nCore = 8;
		c1.nPort = 4;
		c1.graphicCard = "GTX1040ti";
		System.out.println("�޸�: "+c1.memory+"MB");
		System.out.println("�ھ�: "+c1.nCore);
		System.out.println("��Ʈ: "+c1.nPort);
		System.out.println("�׷���: "+c1.graphicCard);
		
	}

}
