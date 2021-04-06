package week3_day2;

class Student{
	private String name;
	private int kor;
	int eng;
	int tot;
	
	public  void input() {
		name = "ȫ�浿";
		kor = 100;
		eng = 90;
		
	}
	
	public void calcTot() {
		
		tot = kor + eng;
		
	}
	public void disp() {
		System.out.println(name +" "+ kor +" "+ eng +" "+ tot);
		
	}

}
	

public class ex07 {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.input();
		s.calcTot();
		s.disp();
		
		//input(s);
	}
	
	public static void input(Student s) {
		s.name = "ȫ�浿";
		s.kor = 100;
		s.eng = 90;
		
	}
	
	public static void calcTot(Student s) {
		
		s.tot = s.kor + s.eng;
		
	}

}
