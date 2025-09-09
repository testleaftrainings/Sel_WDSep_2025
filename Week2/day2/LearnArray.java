package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		// literal way of initializing the array
		// syntax : datatype name[] = {value1,value2,value3};
		// Index --> always starts from 0, 1, 2 , 3 , 4
		int[] empNo = { 837, 783, 234, 345, 598 };
		// length--> always starts from 1 ,2 , 3, 4, 5
		System.out.println(empNo.length);
		System.out.println("***Using Literals way***");
		// 0 ; 5<=5--> true; 0++
		Arrays.sort(empNo); // 234, 345, 598
		for (int i = 0; i < empNo.length; i++) {
			System.out.println(empNo[i]);
		}
		System.out.println("***Using Instaniation way***");
		// literal way of Instaniation the array
		// syntax : datatype name[] = new datatype[size];
		String[] mentor = new String[3]; // index --> 0,1,2
		// arrayname[index]= value1;
		mentor[0]="Bhuvanesh";
		mentor[1]="Harrish";
		mentor[0]="Vineeth";
		mentor[2]="Seenivasan";
		//mentor[3]="vinoth";
		
		for (int i = 0; i < mentor.length; i++) {
			System.out.println(mentor[i]);
		}
	}
}
