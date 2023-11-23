package polymorphism;

public class test {

	public static void main(String[] args) {
	Bank b=new SBI();
	System.out.println(b.getRateOfInterest());

	Bank h=new HDFC();
	System.out.println(h.getRateOfInterest());
	
	Bank i=new ICICI();
	System.out.println(i.getRateOfInterest());
	}

}
