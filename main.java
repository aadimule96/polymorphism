// runtime polymorphism with methods


package polymorphism;

public class main {

	public static void main(String[] args) {
	
		shape s=new circle();
		s.draw();
		
		shape s1=new rectangle();
		s1.draw();
		
		shape s2=new triangle();
		s2.draw();
		
	}

}
