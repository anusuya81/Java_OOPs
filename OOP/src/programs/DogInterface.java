package programs;

public class DogInterface implements Pet {
	 public void test(){
    	 System.out.println("Interface Method Implemented");
 	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		Pet p = new DogInterface();
		b=p.a;
		System.out.println(b);
    	 p.test();
	}

}
