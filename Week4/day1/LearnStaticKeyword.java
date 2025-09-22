package week4.day1;

public  class LearnStaticKeyword {
	// static variable 
	static int a= 3;
	static int b;
	// non-static variable 
	 int c;
	// static method
	public static void math() {
		System.out.println("value of static variable a : "+a);
		System.out.println("value of static variable b : "+b);
	}
	// non-static block 
	{
		System.out.println("Non static block is executed here");
	}
	// static block 
		static{
			System.out.println("static block is executed here");
			b=a*3;
		}

	public static void main(String[] args) {
		// execution order : static variable , static block, static method, Non static block, non-static variable
		 math();
		 LearnStaticKeyword ls = new LearnStaticKeyword();
		 ls.c=1;
		 System.out.println(ls.c);
		 
	}

}
