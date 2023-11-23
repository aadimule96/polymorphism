// overriding

package polymorphism;

public class splender extends bike {
      void run() 
      {
    	  System.out.println("running @ 60kmph...........");
      }
      	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    bike b=new splender();  // upcasting
                            // reference variable of parent class refers to object of child class  
    b.run(); 
    
   
	}

}
