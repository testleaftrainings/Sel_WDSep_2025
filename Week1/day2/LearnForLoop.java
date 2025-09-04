package week1.day2;


public class LearnForLoop {

	public static void main(String[] args) {
		//print first 10 natural number
	   // if statement will check --> boolean --> condition
		// for loop 3 segment --> 1) initialization 2) condition checking  3) iteration 
		// loop no.1
		//segment 1 : done
		// segment 2 : 1<=10 --> true
		// segment 3 : 1+1--> 1
		// loop no.2 
		//segment 1 : i=2
		// segment 2 : 2<=10
		// segment 3 : 2+1--> 2
		// loop no.3 
		//segment 1 : i=3
		// segment 2 : 3<=10
		// segment 3 : 3+1--> 3
		// loop no.11 
				//segment 1 : i= 11
				// segment 2 : 11<=10 --> false --> the for loop statement will get terminated
		int a = 1;
		System.out.println(a++); // 1st retireve the value of a then it will added it with +1 // 1
		System.out.println(a);//  2
		System.out.println(++a);// 1st  added it with +1 then it wil retireve the value of a // 3
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
